package com.jxyd.nole.web.ms.sys.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jxyd.nole.bas.util.StringUtils;
import com.jxyd.nole.jpa.mysql.alpha.raw.mapper.Sys01PermissionMapper;
import com.jxyd.nole.jpa.mysql.alpha.raw.mapper.Sys02RoleMapper;
import com.jxyd.nole.jpa.mysql.alpha.raw.mapper.Sys03RolePermissionLinkMapper;
import com.jxyd.nole.jpa.mysql.alpha.raw.mapper.Sys04UserMapper;
import com.jxyd.nole.jpa.mysql.alpha.raw.mapper.Sys05UserRoleLinkMapper;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys01Permission;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys01PermissionExample;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys01PermissionExample.Criteria;
import com.jxyd.nole.web.ms.cook.model.Role;
import com.jxyd.nole.web.ms.sys.SystemTx;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys02RoleExample;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys03RolePermissionLink;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys03RolePermissionLinkExample;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys04User;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys04UserExample;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys05UserRoleLink;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys05UserRoleLinkExample;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Component
public class SystemTxImpl implements SystemTx {

	/*
	 * @see
	 * http://docs.spring.io/spring/docs/4.2.0.RC1/spring-framework-reference/
	 * htmlsingle/#transaction-declarative-annotations
	 * 
	 * In proxy mode (which is the default), only external method calls coming
	 * in through the proxy are intercepted. This means that self-invocation, in
	 * effect, a method within the target object calling another method of the
	 * target object, will not lead to an actual transaction at runtime even if
	 * the invoked method is marked with @Transactional.
	 */

	@Autowired
	private Sys01PermissionMapper permissionMapper;
	@Autowired
	private Sys02RoleMapper roleMapper;
	@Autowired
	private Sys03RolePermissionLinkMapper rolePermissionLinkMapper;

	@Autowired
	private Sys04UserMapper usrMapper;
	@Autowired
	private Sys05UserRoleLinkMapper userRoleLinkMapper;

	@Transactional(propagation = Propagation.REQUIRED)
	public void saveMenu(JSONArray deletedKeyArray, JSONArray resultArray) {
		List<Integer> listWillBeDelete = new ArrayList<Integer>();
		for (Object obj : deletedKeyArray) {
			int permissionId = (int) obj;
			listWillBeDelete.add(permissionId);
			Sys01Permission permission = permissionMapper.selectByPrimaryKey(permissionId);
			if (permission != null) {
				permissionMapper.deleteByPrimaryKey(permissionId);
			}
			if (permission.getIsLeaf() == 1) {
				Sys01PermissionExample permissionExample = new Sys01PermissionExample();
				permissionExample.createCriteria().andPidEqualTo(permission.getId());
				List<Sys01Permission> veinList = permissionMapper.selectByExample(permissionExample);
				permissionMapper.deleteByExample(permissionExample);
				for (Sys01Permission sys01Permission : veinList) {
					listWillBeDelete.add(sys01Permission.getId());
				}
			}
			Sys03RolePermissionLinkExample example = new Sys03RolePermissionLinkExample();
			example.createCriteria().andPermissionIdIn(listWillBeDelete);
			rolePermissionLinkMapper.deleteByExample(example);
		}
		treeSave(resultArray, 0);
	}

	/**
	 * id maybe start with 'edit_' or 'new_' pid maybe start with 'edit_' or
	 * 'new_'
	 */
	private void treeSave(JSONArray resultArray, int pid) {
		for (Object object : resultArray) {
			JSONObject result = JSONObject.fromObject(object);
			int level = result.getInt("level");
			String idStr = result.getString("id");
			String name = result.getString("name");
			Sys01Permission menu = new Sys01Permission();
			if (idStr.startsWith("new_")) {
				menu.setPid(pid);
				menu.setIsTree(level == 1 ? 1 : 0);
				menu.setIsBranch(level == 2 ? 1 : 0);
				menu.setIsLeaf(level == 3 ? 1 : 0);
				menu.setIsVein(level == 4 ? 1 : 0);
				menu.setIsVeinMain(name.startsWith("[main]") ? 1 : 0);
				menu.setName(name.replace("[main]", "").trim());
				menu.setLevel(level);
				menu.setOrder(99);
				menu.setIsCollapsed(0);
				menu.setCreateTime(new Date());
				permissionMapper.insert(menu);
			} else if (idStr.startsWith("edit_")) {
				menu.setName(name.replace("[main]", "").trim());
				menu.setIsVeinMain(name.startsWith("[main]") ? 1 : 0);
				menu.setId(Integer.valueOf(idStr.replace("edit_", "")));
				permissionMapper.updateByPrimaryKeySelective(menu);
			} else {
				menu.setId(Integer.valueOf(idStr));
			}

			JSONArray children = JSONArray.fromObject(result.get("children"));
			if (children.size() > 0) {
				treeSave(children, menu.getId());
			}
		}
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void savePermission(JSONArray deletedKeyArray, JSONArray resultArray) {
		for (Object obj : deletedKeyArray) {
			int permissionId = (int) obj;
			Sys01PermissionExample permissionExample = new Sys01PermissionExample();
			Criteria permissionCriteria = permissionExample.createCriteria();
			permissionCriteria.andIdEqualTo(permissionId);
			permissionMapper.deleteByExample(permissionExample);
			Sys03RolePermissionLinkExample linkExample = new Sys03RolePermissionLinkExample();
			linkExample.createCriteria().andPermissionIdEqualTo(permissionId);
			rolePermissionLinkMapper.deleteByExample(linkExample);
		}
		treeSave(resultArray, 0);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void saveRole(Role role) {
		role.setCreateTime(new Date());
		roleMapper.insert(role);
		String permissionIdsStr = role.getPermissionIds();
		if (StringUtils.isNotBlank(permissionIdsStr)) {
			String[] permissionIdArray = permissionIdsStr.split(",");
			for (String permissionId : permissionIdArray) {
				if (StringUtils.isNotBlank(permissionId)) {
					Sys01Permission permission = permissionMapper.selectByPrimaryKey(Integer.valueOf(permissionId));
					if (permission == null || permission.getIsVein() == 0) {
						continue;
					}
					Sys03RolePermissionLink link = new Sys03RolePermissionLink();
					link.setPermissionId(Integer.valueOf(permissionId));
					link.setRoleId(role.getId());
					rolePermissionLinkMapper.insert(link);
				}
			}
		}
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void updateRole(Role role) {
		// 更新
		roleMapper.updateByPrimaryKeySelective(role);
		String permissionIdsStr = role.getPermissionIds();
		if (StringUtils.isNotBlank(permissionIdsStr)) {
			// 清空原有权限，增加现有权限
			Sys03RolePermissionLinkExample example = new Sys03RolePermissionLinkExample();
			example.createCriteria().andRoleIdEqualTo(role.getId());
			rolePermissionLinkMapper.deleteByExample(example);
			String[] permissionIdArray = permissionIdsStr.split(",");
			for (String permissionId : permissionIdArray) {
				if (StringUtils.isNotBlank(permissionId)) {
					Sys01Permission permission = permissionMapper.selectByPrimaryKey(Integer.valueOf(permissionId));
					if (permission == null || permission.getIsVein() == 0) {
						continue;
					}
					Sys03RolePermissionLink link = new Sys03RolePermissionLink();
					link.setPermissionId(Integer.valueOf(permissionId));
					link.setRoleId(role.getId());
					rolePermissionLinkMapper.insert(link);
				}
			}
		}
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void deleteRole(List<Integer> idList) {
		Sys02RoleExample example = new Sys02RoleExample();
		example.createCriteria().andIdIn(idList);
		roleMapper.deleteByExample(example);
		Sys03RolePermissionLinkExample linkExample = new Sys03RolePermissionLinkExample();
		linkExample.createCriteria().andRoleIdIn(idList);
		rolePermissionLinkMapper.deleteByExample(linkExample);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void saveUser(Sys04User sys04User, String roleIds) {
		// 插入用户信息，返回用户id
		usrMapper.insertSelective(sys04User);
		if(StringUtils.isNotBlank(roleIds)){
			for (String roleIdStr : roleIds.split(",")) {
				Sys05UserRoleLink link = new Sys05UserRoleLink();
				link.setRoleId(Integer.valueOf(roleIdStr.trim()));
				link.setUserId(sys04User.getId());
				userRoleLinkMapper.insert(link);
			}
		}
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void updateUser(Sys04User sys04User, String roleIds) {
		usrMapper.updateByPrimaryKeySelective(sys04User);
		// 先清空原有关系 
		Sys05UserRoleLinkExample example = new Sys05UserRoleLinkExample();
		example.createCriteria().andUserIdEqualTo(sys04User.getId());
		userRoleLinkMapper.deleteByExample(example);
		// 建立新关系 
		if(StringUtils.isNotBlank(roleIds)){
			for (String roleIdStr : roleIds.split(",")) {
				Sys05UserRoleLink link = new Sys05UserRoleLink();
				link.setRoleId(Integer.valueOf(roleIdStr.trim()));
				link.setUserId(sys04User.getId());
				userRoleLinkMapper.insert(link);
			}
		}
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void deleteUser(List<Integer> idList) {
		Sys04UserExample example = new Sys04UserExample();
		example.createCriteria().andIdIn(idList);
		usrMapper.deleteByExample(example);
		Sys05UserRoleLinkExample linkExample = new Sys05UserRoleLinkExample();
		linkExample.createCriteria().andUserIdIn(idList);
		userRoleLinkMapper.deleteByExample(linkExample);
	}
}
