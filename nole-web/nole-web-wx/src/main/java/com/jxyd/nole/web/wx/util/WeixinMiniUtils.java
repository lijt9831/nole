package com.jxyd.nole.web.wx.util;

import static com.jxyd.nole.web.wx.property.WeixinProperties.appid;
import static com.jxyd.nole.web.wx.property.WeixinProperties.appsecret;
import static com.jxyd.nole.web.wx.property.WeixinProperties.urlCheckcode;

import java.util.HashMap;
import java.util.Map;

import org.apache.shiro.crypto.hash.Sha1Hash;

import com.jxyd.nole.bas.http.HttpUtils;
import com.jxyd.nole.bas.log.Log;
import com.jxyd.nole.bas.log.LogFactory;
import com.jxyd.nole.bas.util.AEC128CBCUtils;

import net.sf.json.JSONObject;

/**
 * @author zxg
 * 
 */
public class WeixinMiniUtils {
	
	private static final Log log = LogFactory.getLog(WeixinMiniUtils.class);

	/**
	 * 如果成功， code 为 0 ，同时可以获取 openid ，session_key，unionid
	 * @param code
	 * @return
	 */
	public static Map<String, String> checkCode(String code) {
		
		Map<String, String> result = new HashMap<String, String>();
		String codeinfo = HttpUtils.get(String.format(urlCheckcode, appid, appsecret, code));
		
		if(codeinfo == null) {
			result.put("code", "1");
			result.put("msg", "请求微信服务器失败");
			return result;
		}
		
		JSONObject json = JSONObject.fromObject(codeinfo);
		if (json.containsKey("openid") && json.containsKey("session_key")) {
			result.put("code", "0");
			result.put("msg", "成功");
			result.put("openid", json.getString("openid"));
			result.put("session_key", json.getString("session_key"));
			result.put("unionid", json.containsKey("unionid") ? json.getString("openid") : "");
		} else {
			result.put("code", json.getString("errcode"));
			result.put("msg", json.getString("errmsg"));
		}
		return result;
	}
	
	/**
	 * 验证签名
	 * @param rawData
	 * @param session_key
	 * @param signature
	 * @return
	 */
	public static boolean checkSignature(String rawData, String session_key, String signature) {
		log.debug("入参 [rawData=" + rawData + ", session_key=" + session_key + ", signature=" + signature + "]");
		if (rawData == null || session_key == null || signature == null) {
			return false;
		}
		Sha1Hash sha1Hash = new Sha1Hash(rawData + session_key);
		String actual = sha1Hash.toHex();
		if (signature.equals(actual)) {
			return true;
		}else {
			log.debug("期望签名：[" + signature + "],实际签名：[" + actual + "]");
			return false;
		}
	}
	
	/**
	 * 对称算法解密数据 
	 * @param encryptedData
	 * @param session_key
	 * @param iv
	 * @return
	 */
	public static String decrypt(String encryptedData, String session_key, String iv) {
		log.trace("入参 [encryptedData=" + encryptedData + ", session_key=" + session_key + ", iv=" + iv + "]");
		String decrypted = AEC128CBCUtils.decrypt(encryptedData, session_key, iv);
		return decrypted;
	}
}
