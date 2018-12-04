package com.jxyd.nole.web.ms.sys;

import java.util.Set;

import org.apache.ibatis.session.RowBounds;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys02Role;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys04User;
import com.jxyd.nole.web.ms.cook.model.Role;
import com.jxyd.nole.web.ms.msg.Message;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public interface SystemService {

	public JSONArray getMainPageConfig(String username);

	public JSONArray getMenuConfig();

	public Message saveMenu(String nodeArray, String deletedKeyArray);

	public Message savePermission(String nodeArray, String deletedKeyArray);

	public Message saveRole(Role role);

	public Message updateRole(Role role);

	public Sys02Role getRole(int roleId);

	public JSONArray getPermissionConfig(int roleId);

	/**
	 * 角色列表页条件检索，带分页
	 */
	public JSONObject getRoleList(String role, RowBounds rowBounds);

	public Message deleteRole(String deletedKeyArray);

	public Sys04User getUser(String username);

	public Sys04User getUser(int userId);

	public Set<String> getPermissions(String username);

	public Set<String> getPermissions();

	public Message saveUser(Sys04User usr01User, String roleIds);

	public Message updateUser(Sys04User usr01User, String roleIds);

	public JSONObject getUserList(String username, RowBounds rowBounds);

	/**
	 * 用户新增/编辑页的角色信息
	 */
	public JSONArray getRoleArray(int userId);
	
	public Message deleteUser(String deletedKeyArray);
}
