package com.jxyd.nole.mgr.shiro.mapper;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration(locations = {"classpath*:spring/root/public_*.xml","classpath*:spring/root/private_mybatis.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
//@Transactional
public class JdbcRealmMapperTest {

	@Autowired
	private JdbcRealmMapper jdbcRealmMapper;
	
	@Test
	public void testSelectUser() {
		Map<String, String> user = jdbcRealmMapper.selectUser("admin");
		System.out.println(user.get("password"));
		
	}

	@Test
	public void testSelectUPermsString() {
		Set<String> perms = jdbcRealmMapper.selectUPerms("admin");
		System.out.println(perms);
	}

	@Test
	public void testSelectSPerms() {
		Set<String> perms = jdbcRealmMapper.selectSPerms();
		System.out.println(perms);
	}

}
