package com.jxyd.nole.web.ms.cook.mapper;

import java.util.Set;

public interface Sys04UserMappex {
	
	public Set<String> selectPermissions();
	
	public Set<String> selectPermissionsByUsername(String username);
}