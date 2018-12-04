package com.jxyd.nole.web.ms.sys.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.session.RowBounds;
import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxyd.nole.bas.log.Log;
import com.jxyd.nole.bas.log.LogFactory;
import com.jxyd.nole.bas.util.StringUtils;
import com.jxyd.nole.jpa.mysql.alpha.raw.mapper.Sys01PermissionMapper;
import com.jxyd.nole.jpa.mysql.alpha.raw.mapper.Sys02RoleMapper;
import com.jxyd.nole.jpa.mysql.alpha.raw.mapper.Sys04UserMapper;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys01Permission;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys01PermissionExample;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys01PermissionExample.Criteria;
import com.jxyd.nole.web.ms.cook.mapper.Sys01PermissionMappex;
import com.jxyd.nole.web.ms.cook.mapper.Sys02RoleMappex;
import com.jxyd.nole.web.ms.cook.mapper.Sys04UserMappex;
import com.jxyd.nole.web.ms.cook.model.Menu;
import com.jxyd.nole.web.ms.cook.model.Role;
import com.jxyd.nole.web.ms.msg.ErrorMessage;
import com.jxyd.nole.web.ms.msg.Message;
import com.jxyd.nole.web.ms.msg.SuccessMessage;
import com.jxyd.nole.web.ms.msg.WarningMessage;
import com.jxyd.nole.web.ms.sys.SystemService;
import com.jxyd.nole.web.ms.sys.SystemTx;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys02Role;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys02RoleExample;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys04User;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys04UserExample;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Service
public class SystemServiceImpl implements SystemService {

	private static final Log log = LogFactory.getLog(SystemServiceImpl.class);

	@Autowired
	private Sys01PermissionMappex permissionMappex;
	@Autowired
	private Sys02RoleMappex roleMappex;
	@Autowired
	private Sys02RoleMapper roleMapper;
	@Autowired
	private Sys01PermissionMapper permissionMapper;

	@Autowired
	private SystemTx systemTx;
	
	@Autowired
	private Sys04UserMapper userMapper;
	@Autowired
	private Sys04UserMappex userMappex;

	@Override
	public JSONArray getMainPageConfig(String username) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		// 不匹配任何角色
		paramMap.put("username", username);
		List<Menu> menuList = permissionMappex.selectMainConfig(paramMap);
		return buildMainConfig(menuList, 0);
	}

	/**
	 * 递归绘树 0代表 树林
	 * 
	 * @param list
	 *            全部数据
	 * @param me
	 *            谁的孩子们的“谁”
	 * @return 孩子们
	 */
	private JSONArray buildMainConfig(List<Menu> list, int me) {
		JSONArray myChildren = new JSONArray();
		for (Menu item : list) {
			// 命中（递：获取子元素）
			if (me == item.getPid()) {
				JSONObject child = new JSONObject();
				if (1 == item.getIsTree()) {
					child.put("id", item.getId());
					child.put("collapsed", item.getIsCollapsed());
					child.put("icon", item.getIcon());
					child.put("text", item.getName());
					JSONArray branches = buildMainConfig(list, item.getId());
					child.put("menu", branches);
					child.put("show", branches.size() > 0);
				} else if (1 == item.getIsBranch()) {
					child.put("text", item.getName());
					JSONArray leafs = buildMainConfig(list, item.getId());
					child.put("items", leafs);
					child.put("show", leafs.size() > 0);
				} else if (1 == item.getIsLeaf()) {
					child.put("id", item.getId());
					child.put("text", item.getName());
					JSONArray veins = buildMainConfig(list, item.getId());
					// 没有主叶脉的不作为菜单显示（用于隐形的权限控制比如编辑页面）
					boolean hidden = true;
					for (Object object : veins) {
						JSONObject vein = JSONObject.fromObject(object);
						if (vein.getInt("is_vein_main") == 1) {
							child.put("href", vein.getString("text"));
							hidden = false;
							break;
						}
					}
					if (hidden) {
						continue;
					}
					child.put("show", true);
				} else if (1 == item.getIsVein()) {
					child.put("id", item.getId());
					child.put("text", item.getName());
					child.put("is_vein_main", item.getIsVeinMain());
					child.put("show", true);
				}
				// 权限控制
				if(child.getBoolean("show")){
					myChildren.add(child);
				}
			}
		}
		return myChildren;
	}

	/**
	 * 菜单管理页面的tree的数据
	 */
	@Override
	public JSONArray getMenuConfig() {
		Sys01PermissionExample sys01Example = new Sys01PermissionExample();
		sys01Example.setOrderByClause("`level` asc,`order` asc ,create_time asc");
		Criteria criteria = sys01Example.createCriteria();
		// 不包含叶脉
		criteria.andIsVeinEqualTo(0);
		List<Sys01Permission> list = permissionMapper.selectByExample(sys01Example);
		return buildMenu(list, 0);
	}

	private JSONArray buildMenu(List<Sys01Permission> list, int targetId) {
		JSONArray children = new JSONArray();
		for (Sys01Permission item : list) {
			// 命中（递：获取子元素）
			if (targetId == item.getPid()) {
				JSONObject child = new JSONObject();
				child.put("id", item.getId());
				child.put("text", item.getName());
				child.put("expanded", item.getIsCollapsed() == 0);
				JSONArray nodes = buildMenu(list, item.getId());
				if (nodes.size() > 0) {
					child.put("children", nodes);
				}
				children.add(child);
			}
		}
		return children;
	}

	/**
	 * 权限页面的那tree 的数据配置，包含veins
	 */
	@Override
	public JSONArray getPermissionConfig(int roleId) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("roleId", roleId);
		List<Menu> list = permissionMappex.selectPermissionConfig(paramMap);
		return buildPermission(list, 0);
	}

	private JSONArray buildPermission(List<Menu> list, int targetId) {
		JSONArray children = new JSONArray();
		for (Menu item : list) {
			// 命中（递：获取子元素）
			if (targetId == item.getPid()) {
				JSONObject child = new JSONObject();
				child.put("id", item.getId());
				if (item.getIsVeinMain() == 1) {
					child.put("text", "[main] " + item.getName());
				} else {
					child.put("text", item.getName());
				}
				child.put("expanded", item.getIsCollapsed() == 0);
				child.put("checked", item.getIsChecked() == 1);
				JSONArray nodes = buildPermission(list, item.getId());
				if (nodes.size() > 0) {
					child.put("children", nodes);
				}
				children.add(child);
			}
		}
		return children;
	}

	@Override
	public JSONObject getRoleList(String role, RowBounds rowBounds) {
		Map<String, Object> paramMap = null;
		if (StringUtils.isNotBlank(role)) {
			paramMap = new HashMap<String, Object>();
			paramMap.put("role", role);
		}
		List<Role> records = roleMappex.selectRoleListWithRowbounds(paramMap, rowBounds);
		int totalCount = roleMappex.countRoleList(paramMap);
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("records", records);
		data.put("totalCount", totalCount);
		return JSONObject.fromObject(data);
	}

	@Override
	public Message saveMenu(String nodeArrayStr, String deletedKeyArrayStr) {
		if (nodeArrayStr == null || deletedKeyArrayStr == null) {
			return new WarningMessage("不合法参数");
		}
		try {
			JSONArray nodeArray = JSONArray.fromObject(nodeArrayStr);

			JSONArray deletedKeyArray = JSONArray.fromObject(deletedKeyArrayStr);
			List<Integer> deletedKeyList = new ArrayList<Integer>();
			for (Object deletedKey : deletedKeyArray) {
				deletedKeyList.add(Integer.valueOf(String.valueOf(deletedKey)));
			}

			JSONArray resultArray = buildNewAndEdit(nodeArray, "0");

			systemTx.saveMenu(deletedKeyArray, resultArray);
		} catch (Exception e) {
			log.error("save menu failed", e);
			return new ErrorMessage("save menu failed");
		}
		return new SuccessMessage("save menu success");
	}

	private JSONArray buildNewAndEdit(JSONArray nodeArray, String pidStr) {
		JSONArray children = new JSONArray();
		for (Object obj : nodeArray) {
			JSONObject node = JSONObject.fromObject(obj);
			if (node.getString("pid").replace("new_", "").replace("edit_", "").equals(pidStr)) {
				JSONObject result = new JSONObject();
				result.put("id", node.getString("id"));
				result.put("pid", node.getString("pid"));
				result.put("level", node.getInt("level"));
				result.put("name", node.getString("name"));
				String idStr = node.getString("id").replace("new_", "").replace("edit_", "");
				result.put("children", buildNewAndEdit(nodeArray, idStr));
				children.add(result);
			}
		}
		return children;
	}

	@Override
	public Message savePermission(String nodeArrayStr, String deletedKeyArrayStr) {
		try {
			JSONArray nodeArray = JSONArray.fromObject(nodeArrayStr);

			JSONArray deletedKeyArray = JSONArray.fromObject(deletedKeyArrayStr);
			List<Integer> listWillBeDelete = new ArrayList<Integer>();
			for (Object deletedKey : deletedKeyArray) {
				listWillBeDelete.add(Integer.valueOf(String.valueOf(deletedKey)));
			}

			JSONArray resultArray = buildNewAndEdit(nodeArray, "0");

			systemTx.savePermission(deletedKeyArray, resultArray);
		} catch (Exception e) {
			log.error("save permission failed", e);
			return new ErrorMessage("save permission failed");
		}
		return new SuccessMessage("save permission success");
	}

	@Override
	public Message saveRole(Role role) {
		if (role == null || role.getRole() == null || role.getIsAvailable() == null) {
			return new WarningMessage("不合法参数");
		}
		// 校验角色是否已存在
		Sys02RoleExample example = new Sys02RoleExample();
		example.createCriteria().andRoleEqualTo(role.getRole());
		List<Sys02Role> roleList = roleMapper.selectByExample(example);
		if (roleList.size() > 0) {
			return new WarningMessage("Role [" + role.getRole() + "] already exits!");
		}
		// 保存
		try {
			systemTx.saveRole(role);
		} catch (Exception e) {
			log.error("save role failed", e);
			return new ErrorMessage("save role failed");
		}
		return new SuccessMessage("save role success");
	}

	@Override
	public Sys02Role getRole(int roleId) {
		return roleMapper.selectByPrimaryKey(roleId);
	}

	@Override
	public Message updateRole(Role role) {
		if (role == null || role.getId() == null || role.getRole() == null || role.getIsAvailable() == null) {
			return new WarningMessage("不合法参数");
		}
		Sys02Role exists = roleMapper.selectByPrimaryKey(role.getId());
		if (exists == null) {
			return new WarningMessage("数据已被删除");
		}
		if (!exists.getRole().equals(role.getRole())) {
			// 校验角色是否已存在
			Sys02RoleExample example = new Sys02RoleExample();
			example.createCriteria().andRoleEqualTo(role.getRole());
			List<Sys02Role> roleList = roleMapper.selectByExample(example);
			if (roleList.size() > 0) {
				return new WarningMessage("Role [" + role.getRole() + "] already exits!");
			}
		}
		// 保存
		try {
			systemTx.updateRole(role);
		} catch (Exception e) {
			log.error("update role failed", e);
			return new ErrorMessage("update role failed");
		}
		return new SuccessMessage("update role success");
	}

	@Override
	public Message deleteRole(String deletedKeyArray) {
		if (deletedKeyArray == null) {
			return new WarningMessage("不合法参数");
		}
		try {
			JSONArray ja = JSONArray.fromObject(deletedKeyArray);
			List<Integer> idList = new ArrayList<Integer>();
			for (Object object : ja) {
				int roleId = (int) object;
				idList.add(roleId);
			}
			systemTx.deleteRole(idList);
		} catch (Exception e) {
			log.error("delete role failed", e);
			return new ErrorMessage("delete role failed");
		}
		return new SuccessMessage("delete role success");
	}
	
	@Override
	public Sys04User getUser(String username) {
		Sys04UserExample userExample = new Sys04UserExample();
		userExample.createCriteria().andUsernameEqualTo(username);
		List<Sys04User> userList = userMapper.selectByExample(userExample);
		if (userList.size() > 1) {
			log.warn("Duplicate username[" + username + "]");
		}
		return userList.size() == 0 ? null : userList.get(0);
	}

	@Override
	public Set<String> getPermissions(String username) {
		return userMappex.selectPermissionsByUsername(username);
	}

	@Override
	public Set<String> getPermissions() {
		return userMappex.selectPermissions();
	}

	@Override
	public Message saveUser(Sys04User sys04User ,String roleIds) {
		Message checkMessage = checkUser4insert(sys04User);
		if (checkMessage instanceof ErrorMessage) {
			return checkMessage;
		}
		String plainTextPassword = sys04User.getPassword();
		RandomNumberGenerator rng = new SecureRandomNumberGenerator();
		String salt = rng.nextBytes().toString();

		// Now hash the plain-text password with the random salt and multiple
		// iterations and then Base64-encode the value (requires less space than
		// Hex):
		String hashedPasswordBase64 = new Sha256Hash(plainTextPassword, salt, 1024).toBase64();
		sys04User.setPassword(hashedPasswordBase64);
		sys04User.setPasswordSalt(salt);
		sys04User.setCreateTime(new Date());
		try {
			systemTx.saveUser(sys04User ,roleIds);
		} catch (Exception e) {
			log.error("save user failed", e);
			return new ErrorMessage("save user failed");
		}
		return new SuccessMessage("save user success");
	}

	private Message checkUser4insert(Sys04User sys04User) {
		if (sys04User == null) {
			return new ErrorMessage("user info can not be null");
		}
		if (sys04User.getUsername() == null) {
			return new ErrorMessage("username 不能为空");
		}
		if (sys04User.getPassword() == null) {
			return new ErrorMessage("password 不能为空");
		}
		Sys04User user = getUser(sys04User.getUsername());
		if (user != null) {
			return new ErrorMessage("用户名[" + sys04User.getUsername() + "]已存在");
		}
		return new SuccessMessage("verification is ok");
	}

	@Override
	public Message updateUser(Sys04User sys04User,String roleIds) {
		Message checkMessage = checkUser4update(sys04User);
		if (checkMessage instanceof ErrorMessage) {
			return checkMessage;
		}
//		String plainTextPassword = sys04User.getPassword();
//		RandomNumberGenerator rng = new SecureRandomNumberGenerator();
//		String salt = rng.nextBytes().toString();
//
//		// Now hash the plain-text password with the random salt and multiple
//		// iterations and then Base64-encode the value (requires less space than
//		// Hex):
//		String hashedPasswordBase64 = new Sha256Hash(plainTextPassword, salt, 1024).toBase64();
//		sys04User.setPassword(hashedPasswordBase64);
//		sys04User.setPasswordSalt(salt);
		try {
			systemTx.updateUser(sys04User ,roleIds);
		} catch (Exception e) {
			log.error("update user failed", e);
			return new ErrorMessage("update user failed");
		}
		return new SuccessMessage("update user success");
	}

	private Message checkUser4update(Sys04User sys04User) {
		if (sys04User == null || sys04User.getId() == null) {
			return new ErrorMessage("不合法参数");
		}
		if (sys04User.getUsername() == null) {
			return new ErrorMessage("username 不能为空");
		}
//		if (sys04User.getPassword() == null) {
//			return new ErrorMessage("password 不能为空");
//		}
		// TODO 密码格式校验
		// TODO 邮箱和手机格式及唯一校验
		Sys04User userById = getUser(sys04User.getId());
		if (userById == null) {
			return new ErrorMessage("用户信息[" + sys04User.getId() + "]不存在");
		}
		// 用户名不应该被修改，页面要做限制，程序暂定可以修改，但是不允许重复
		if (!userById.getUsername().equals(sys04User.getUsername())) {
			Sys04User userByUsername = getUser(sys04User.getUsername());
			if (userByUsername != null) {
				return new ErrorMessage("用户名[" + sys04User.getUsername() + "]已存在");
			}
		}
		return new SuccessMessage("verification is ok");
	}

	@Override
	public JSONObject getUserList(String username, RowBounds rowBounds) {
		Sys04UserExample example = new Sys04UserExample();
		Sys04UserExample.Criteria cri = example.createCriteria();
		if (StringUtils.isNotBlank(username)) {
			cri.andUsernameLike("%" + username + "%");
		}
		List<Sys04User> userList = userMapper.selectByExampleWithRowbounds(example, rowBounds);
		Long totalCount = userMapper.countByExample(example);
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("records", userList);
		data.put("totalCount", totalCount);
		return JSONObject.fromObject(data);
	}

	@Override
	public Sys04User getUser(int userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

	@Override
	public JSONArray getRoleArray(int userId) {
		return roleMappex.selectRoleArray(userId);
	}
	
	@Override
	public Message deleteUser(String deletedKeyArray) {
		if (deletedKeyArray == null) {
			return new WarningMessage("不合法参数");
		}
		try {
			JSONArray ja = JSONArray.fromObject(deletedKeyArray);
			List<Integer> idList = new ArrayList<Integer>();
			for (Object object : ja) {
				int id = (int) object;
				idList.add(id);
			}
			systemTx.deleteUser(idList);
		} catch (Exception e) {
			log.error("delete user failed", e);
			return new ErrorMessage("delete user failed");
		}
		return new SuccessMessage("delete user success");
	}

}
