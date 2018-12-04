package com.jxyd.nole.web.ms.sys;

import java.util.List;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys04User;
import com.jxyd.nole.web.ms.cook.model.Role;

import net.sf.json.JSONArray;

public interface SystemTx {

	public void saveMenu(JSONArray deletedKeyArray, JSONArray resultArray);

	public void savePermission(JSONArray deletedKeyArray, JSONArray resultArray);

	public void saveRole(Role role);

	public void updateRole(Role role);

	public void deleteRole(List<Integer> idList);

	public void saveUser(Sys04User usr01User, String roleIds);

	public void updateUser(Sys04User usr01User, String roleIds);

	public void deleteUser(List<Integer> idList);
}
