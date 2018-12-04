package com.jxyd.nole.bas.util;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.Cipher;

/**
 * 私钥加密 -> 公钥解密 <br>
 * 公钥加密 -> 私钥解密<br>
 * 私钥签名<br>
 * 公钥验证签名<br>
 * 
 * @author zxg
 *
 */
public class RSA2Utils {

	/**
	 * 生成公钥(UTF-8,Base64)、私钥(UTF-8,Base64)
	 * 
	 * @param keysize
	 */
	public static String[] generateKeyPair() {
		try {
			KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
			keyPairGenerator.initialize(512);
			KeyPair keyPair = keyPairGenerator.generateKeyPair();
			RSAPublicKey rsaPublicKey = (RSAPublicKey) keyPair.getPublic();
			RSAPrivateKey rsaPrivateKey = (RSAPrivateKey) keyPair.getPrivate();
			String rsaPublicKeyBase64 = Base64Utils.encodeToString(rsaPublicKey.getEncoded());
			String rasPrivateKeyBase64 = Base64Utils.encodeToString(rsaPrivateKey.getEncoded());
			return new String[] { rsaPublicKeyBase64, rasPrivateKeyBase64 };
		} catch (Exception e) {
			throw new RuntimeException("生成RSA密钥对异常", e);
		}
	}

	/**
	 * 私钥加密
	 * 
	 * @param rsaPrivateKey 私钥(UTF-8,Base64)
	 * @param plaintext 目标文本(明文)
	 * @return cryptograph 密文(UTF-8,Base64)
	 */
	public static String encodeByPrivateKey(String rsaPrivateKey, String plaintext) {
		try {
			byte[] bytes = Base64Utils.decodeFromString(rsaPrivateKey);
			PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(bytes);
			KeyFactory keyFactory = KeyFactory.getInstance("RSA");
			PrivateKey privateKey = keyFactory.generatePrivate(pkcs8EncodedKeySpec);
			Cipher cipher = Cipher.getInstance("RSA");
			cipher.init(Cipher.ENCRYPT_MODE, privateKey);
			byte[] result = cipher.doFinal(plaintext.getBytes("UTF-8"));
			return Base64Utils.encodeToString(result);
		} catch (Exception e) {
			throw new RuntimeException("私钥加密异常", e);
		}
	}

	/**
	 * 公钥加密
	 * 
	 * @param rsaPublicKey 公钥(UTF-8,Base64)
	 * @param plaintext 目标文本(明文)
	 * @return cryptograph 密文(UTF-8,Base64)
	 */
	public static String encodeByPublicKey(String rsaPublicKey, String plaintext) {
		try {
			byte[] bytes = Base64Utils.decodeFromString(rsaPublicKey);
			X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(bytes);
			KeyFactory keyFactory = KeyFactory.getInstance("RSA");
			PublicKey publicKey = keyFactory.generatePublic(x509EncodedKeySpec);
			Cipher cipher = Cipher.getInstance("RSA");
			cipher.init(Cipher.ENCRYPT_MODE, publicKey);
			byte[] result = cipher.doFinal(plaintext.getBytes("UTF-8"));
			return Base64Utils.encodeToString(result);
		} catch (Exception e) {
			throw new RuntimeException("公钥加密异常", e);
		}
	}

	/**
	 * 私钥解密
	 * 
	 * @param rsaPrivateKey 私钥(UTF-8,Base64)
	 * @param cryptograph 密文(UTF-8,Base64)
	 * @return plaintext 目标文本(明文)
	 */
	public static String decodeByPrivateKey(String rsaPrivateKey, String cryptograph) {
		try {
			byte[] bytes = Base64Utils.decodeFromString(rsaPrivateKey);
			PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(bytes);
			KeyFactory keyFactory = KeyFactory.getInstance("RSA");
			PrivateKey privateKey = keyFactory.generatePrivate(pkcs8EncodedKeySpec);
			Cipher cipher = Cipher.getInstance("RSA");
			cipher.init(Cipher.DECRYPT_MODE, privateKey);
			byte[] decryptResult = cipher.doFinal(Base64Utils.decodeFromString(cryptograph));
			return new String(decryptResult, "UTF-8");
		} catch (Exception e) {
			throw new RuntimeException("私钥解密异常", e);
		}
	}

	/**
	 * 公钥解密
	 * 
	 * @param rsaPublicKey 公钥(UTF-8,Base64)
	 * @param cryptograph 密文(UTF-8,Base64)
	 * @return plaintext 目标文本(明文)
	 */
	public static String decodeByPublicKey(String rsaPublicKey, String cryptograph) {
		try {
			X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(Base64Utils.decodeFromString(rsaPublicKey));
			KeyFactory keyFactory = KeyFactory.getInstance("RSA");
			PublicKey publicKey = keyFactory.generatePublic(x509EncodedKeySpec);
			Cipher cipher = Cipher.getInstance("RSA");
			cipher.init(Cipher.DECRYPT_MODE, publicKey);
			byte[] decryptResult = cipher.doFinal(Base64Utils.decodeFromString(cryptograph));
			return new String(decryptResult, "UTF-8");
		} catch (Exception e) {
			throw new RuntimeException("公钥解密异常", e);
		}
	}
	
	/**
	 * 私钥签名
	 * 
	 * @param rsaPrivateKey 私钥(UTF-8,Base64)
	 * @param plaintext 目标文本(明文)
	 * @return 签名(UTF-8,Base64)
	 */
	public static String sign(String rsaPrivateKey, String plaintext) {
		try {
			byte[] keyBytes = Base64Utils.decodeFromString(rsaPrivateKey);
			PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(keyBytes);
			KeyFactory keyFactory = KeyFactory.getInstance("RSA");
			PrivateKey privateKey = keyFactory.generatePrivate(pkcs8EncodedKeySpec);
			Signature signature = Signature.getInstance("SHA256WithRSA");
			signature.initSign(privateKey);
			signature.update(plaintext.getBytes("UTF-8"));
			byte[] signed = signature.sign();
			return Base64Utils.encodeToString(signed);
		} catch (Exception e) {
			throw new RuntimeException("私钥签名异常", e);
		}
	}

	/**
	 * 公钥验证签名
	 * 
	 * @param rsaPublicKey 公钥(UTF-8,Base64)
	 * @param plaintext 目标文本(明文)
	 * @param sign 签名(UTF-8,Base64)
	 * @return true 验证成功，false 验证失败
	 */
	public static boolean check(String rsaPublicKey, String plaintext, String sign) {
		try {
			byte[] keyBytes = Base64Utils.decodeFromString(rsaPublicKey);
			X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(keyBytes);
			KeyFactory keyFactory = KeyFactory.getInstance("RSA");
			PublicKey publicKey = keyFactory.generatePublic(x509EncodedKeySpec);
			Signature signature = Signature.getInstance("SHA256WithRSA");
			signature.initVerify(publicKey);
			byte[] signed = Base64Utils.decodeFromString(sign);
			signature.update(plaintext.getBytes());
			return signature.verify(signed);
		} catch (Exception e) {
			throw new RuntimeException("公钥验证签名异常", e);
		}
	}

}
