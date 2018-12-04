package com.jxyd.nole.bas.util;

import static org.junit.Assert.assertTrue;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class Base64UtilsTest {

	@Test
	public void testEncodeToString() throws UnsupportedEncodingException {
		String str = "今天天气不错！";
		String encodeToString = Base64Utils.encodeToString(str.getBytes("utf-8"));
		int length = encodeToString.length();
		System.out.println("原始长度：" + str.length());
		System.out.println("编码后长度：" + length);
		System.out.println("编码后数据:" + encodeToString);
		assertTrue(encodeToString.equals("5LuK5aSp5aSp5rCU5LiN6ZSZ77yB"));
	}

	@Test
	public void testDecodeFromString() throws UnsupportedEncodingException {
		String str = "5LuK5aSp5aSp5rCU5LiN6ZSZ77yB";
		byte[] decodeFromString = Base64Utils.decodeFromString(str);
		String string = new String(decodeFromString,"utf-8");
		System.out.println("解码后数据：" + string);
		assertTrue(string.equals("今天天气不错！"));
	}

}
