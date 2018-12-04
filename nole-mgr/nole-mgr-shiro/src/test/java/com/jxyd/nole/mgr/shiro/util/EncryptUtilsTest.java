package com.jxyd.nole.mgr.shiro.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class EncryptUtilsTest {

	@Test
	public void testGenerate() {
		String salt = EncryptUtils.generateSalt();
		System.out.println(salt);
		String encryptPassword = EncryptUtils.encryptPassword("123456", salt);
		System.out.println(encryptPassword);
	}


}
