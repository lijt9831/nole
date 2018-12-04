package com.jxyd.nole.bas.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;

public class MD5Utils {

	/**
	 * MD5散列(lower case)
	 *
	 * @param s
	 * @return
	 * @see https://tools.ietf.org/html/rfc1321
	 */
	public static String md5HashToHex(String s) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] bytes = md.digest(s.getBytes("UTF-8"));
			return toHex(bytes);
		} catch (Exception e) {
			throw new RuntimeException("MD5散列算法出现异常", e);
		}
	}

	private static String toHex(byte[] bytes) {

		final char[] HEX_DIGITS = "0123456789abcdef".toCharArray();
		StringBuilder ret = new StringBuilder(bytes.length * 2);
		for (int i = 0; i < bytes.length; i++) {
			ret.append(HEX_DIGITS[(bytes[i] >> 4) & 0x0f]);
			ret.append(HEX_DIGITS[bytes[i] & 0x0f]);
		}
		return ret.toString();
	}

	public static String md5File(File f) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);
			// 100KB each time
			byte[] buffer = new byte[102400];
			int length;
			MessageDigest alg = MessageDigest.getInstance("MD5");
			while ((length = fis.read(buffer)) != -1) {
				alg.update(buffer, 0, length);
			}
			return toHex(alg.digest());
		} catch (Exception e) {
			throw new RuntimeException("文件散列失败", e);
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException e) {
			}
		}
	}



}
