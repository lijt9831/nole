package com.jxyd.nole.web.ms.cook.mapper;

import java.util.List;
import java.util.Map;

import com.jxyd.nole.web.ms.cook.model.Menu;

public interface Sys01PermissionMappex {

	List<Menu> selectMainConfig(Map<String,Object> paramMap);
	
	List<Menu> selectPermissionConfig(Map<String,Object> paramMap);
	
}