package com.jxyd.nole.mgr.cache.redis;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;

public class RedisUtilsTest {

	@Test
	public void testGet() {
		Set<String> keys = RedisUtils.keys("*");
		System.out.println(keys);
	}

}
