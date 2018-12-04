package com.jxyd.nole.bas.util;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class MD5UtilsTest {

	@Test
	public void testMd5HashToHexString() {
		String strMd5File = MD5Utils.md5File(new File("D://api-docs"));
		System.out.println(strMd5File);
	}

	@Test
	public void testMd5HashToHexFile() {
		String md5HashStr = MD5Utils.md5HashToHex("www.xxxx.com");
		assertNotNull(md5HashStr);
		System.out.println(md5HashStr);
	}
}