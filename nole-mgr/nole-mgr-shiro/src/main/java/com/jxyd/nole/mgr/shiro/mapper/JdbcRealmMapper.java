package com.jxyd.nole.mgr.shiro.mapper;

import java.util.Map;
import java.util.Set;

public interface JdbcRealmMapper {

	/**
	 * 查询用户
	 * 
	 * @param username
	 * @return
	 */
	public Map<String, String> selectUser(String username);

	/**
	 * 查询用户的权限
	 * 
	 * @param username
	 * @return
	 */
	public Set<String> selectUPerms(String username);

	/**
	 * 查询系统的权限
	 * 
	 * @return
	 */
	public Set<String> selectSPerms();

}
