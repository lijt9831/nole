package com.jxyd.nole.web.ms.cook.model;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys02Role;

public class Role extends Sys02Role {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String permissionIds;

	private int permissionCnt;

	public String getPermissionIds() {
		return permissionIds;
	}

	public void setPermissionIds(String permissionIds) {
		this.permissionIds = permissionIds;
	}

	public int getPermissionCnt() {
		return permissionCnt;
	}

	public void setPermissionCnt(int permissionCnt) {
		this.permissionCnt = permissionCnt;
	}

}
