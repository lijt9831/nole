package com.jxyd.nole.bas.util;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * 对称解密使用的算法为 AES-128-CBC，数据采用PKCS#7填充。
 * 
 * @author zxg
 * @see https://en.wikipedia.org/wiki/Cipher_suite
 * @see https://tools.ietf.org/html/rfc2315
 * @see https://tools.ietf.org/html/rfc2898
 */
public class AEC128CBCUtils {

	/**
	 * 操作对象是原始流
	 * @param target
	 * @param secretKey
	 * @param iv
	 * @param mode
	 * @return
	 */
	private static byte[] toggle(byte[] target, byte[] secretKey, byte[] iv, int mode) {
		try {
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			SecretKeySpec key = new SecretKeySpec(secretKey, "AES");
			IvParameterSpec algorithm = new IvParameterSpec(iv);
			cipher.init(mode, key, algorithm);
			return cipher.doFinal(target);
		} catch (Exception e) {
			throw new RuntimeException("对称算法异常", e);
		}
	}
	
	/**
	 * 操作对象是 Base64 utf-8 编码的字符串 （返回的也是）
	 * @param target
	 * @param secretKey
	 * @param iv
	 * @return
	 */
	public static String encrypt(String target, String secretKey, String iv) {
		
		try {
			// 获取流
			byte[] targetByteArray = Base64Utils.decodeFromString(target);
			byte[] secretKeyByteArray = Base64Utils.decodeFromString(secretKey);
			byte[] ivByteArray = Base64Utils.decodeFromString(iv);

			// 加密
			byte[] toggle = toggle(targetByteArray, secretKeyByteArray, ivByteArray, Cipher.ENCRYPT_MODE);

			// 转 utf-8 base64
			return Base64Utils.encodeToString(toggle);
		} catch (Exception e) {
			throw new RuntimeException("加密失败", e);
		}
	}

	/**
	 * 操作对象是 Base64 utf-8 编码的字符串 （返回是原始数据）
	 * @param target
	 * @param secretKey
	 * @param iv
	 * @return
	 */
	public static String decrypt(String target, String secretKey, String iv) {

		try {
			// 获取流
			byte[] targetByteArray = Base64Utils.decodeFromString(target);
			byte[] secretKeyByteArray = Base64Utils.decodeFromString(secretKey);
			byte[] ivByteArray = Base64Utils.decodeFromString(iv);

			// 解密
			byte[] toggle = toggle(targetByteArray, secretKeyByteArray, ivByteArray, Cipher.DECRYPT_MODE);

			// 转明文
			return new String(toggle, "utf-8");
		} catch (Exception e) {
			throw new RuntimeException("解密失败", e);
		}
	}

}
