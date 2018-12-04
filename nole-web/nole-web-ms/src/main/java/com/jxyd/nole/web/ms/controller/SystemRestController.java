package com.jxyd.nole.web.ms.controller;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jxyd.nole.bas.util.StringUtils;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys04User;
import com.jxyd.nole.web.ms.cook.model.Page;
import com.jxyd.nole.web.ms.cook.model.Role;
import com.jxyd.nole.web.ms.sys.SystemService;

@RestController
@RequestMapping(path = "/sys")
public class SystemRestController {

	@Autowired
	private SystemService systemService;

	@RequestMapping(path = "/getMainPageConfig", method = RequestMethod.GET)
	public Object getMainPageConfig() {
		Object principal = SecurityUtils.getSubject().getPrincipal();
		return systemService.getMainPageConfig(String.valueOf(principal));
	}

	@RequestMapping(path = "/getMenuConfig", method = RequestMethod.GET)
	public Object getMenuConfig() {
		return systemService.getMenuConfig();
	}

	@RequestMapping(path = "/getPermissionConfig", method = RequestMethod.GET)
	public Object getPermissionConfig(String roleId) {
		return systemService.getPermissionConfig(StringUtils.isBlank(roleId) ? -1 : Integer.valueOf(roleId));
	}

	@RequestMapping(path = "/getRoleConfig", method = RequestMethod.POST)
	public Object getRoleList(String role, Page page) {
		return systemService.getRoleList(role, page.getRowBounds());
	}

	@RequestMapping(path = "/saveMenu", method = RequestMethod.POST)
	public Object saveMenu(String nodeArray, String deletedKeyArray) {
		return systemService.saveMenu(nodeArray, deletedKeyArray);
	}

	@RequestMapping(path = "/savePermission", method = RequestMethod.POST)
	public Object savePermission(String nodeArray, String deletedKeyArray) {
		return systemService.savePermission(nodeArray, deletedKeyArray);
	}

	@RequestMapping(path = "/saveRole", method = RequestMethod.POST)
	public Object saveRole(Role role) {
		return systemService.saveRole(role);
	}

	@RequestMapping(path = "/updateRole", method = RequestMethod.POST)
	public Object updateRole(Role role) {
		return systemService.updateRole(role);
	}

	@RequestMapping(path = "/deleteRole", method = RequestMethod.POST)
	public Object deleteRole(String deletedKeyArray) {
		return systemService.deleteRole(deletedKeyArray);
	}

	@RequestMapping(path = "/saveUser", method = RequestMethod.POST)
	public Object saveUser(Sys04User sys04User, String roleIds) {
		return systemService.saveUser(sys04User, roleIds);
	}

	@RequestMapping(path = "/updateUser", method = RequestMethod.POST)
	public Object updateUser(Sys04User sys04User, String roleIds) {
		return systemService.updateUser(sys04User, roleIds);
	}

	@RequestMapping(path = "/getUserConfig", method = RequestMethod.POST)
	public Object getUserList(String username, Page page) {
		return systemService.getUserList(username, page.getRowBounds());
	}
	
	@RequestMapping(path = "/deleteUser", method = RequestMethod.POST)
	public Object deleteUser(String deletedKeyArray) {
		return systemService.deleteUser(deletedKeyArray);
	}
}
