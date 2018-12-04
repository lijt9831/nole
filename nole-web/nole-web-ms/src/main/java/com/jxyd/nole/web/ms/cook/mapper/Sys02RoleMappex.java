package com.jxyd.nole.web.ms.cook.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import com.jxyd.nole.web.ms.cook.model.Role;

import net.sf.json.JSONArray;

public interface Sys02RoleMappex {
	
	List<Role> selectRoleListWithRowbounds(Map<String, Object> paramMap, RowBounds rowBounds);

	int countRoleList(Map<String, Object> paramMap);
	
	JSONArray selectRoleArray(Integer userId);
}