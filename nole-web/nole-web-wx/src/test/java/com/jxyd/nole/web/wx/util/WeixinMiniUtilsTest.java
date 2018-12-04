package com.jxyd.nole.web.wx.util;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@ContextConfiguration(locations = {"classpath:spring/root/private_root.xml"})
//@RunWith(SpringJUnit4ClassRunner.class)
public class WeixinMiniUtilsTest {

//	@Test
//	public void testCheckCode() {
//		Map<String, String> checkCode = WeixinMiniUtils.checkCode("aaa");
//		System.out.println(checkCode);
//	}

	
	@Test
	public void testCheckSignature() {
		String rawData = "{\"nickName\":\"李建霆\",\"gender\":1,\"language\":\"zh_CN\",\"city\":\"Fengtai\",\"province\":\"Beijing\",\"country\":\"China\",\"avatarUrl\":\"https://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTJrqLEic7DVicYYmH1dIAfTIyQZibMyvDTllPzMpjQDkmSNfAah0klZBO3pbsdBsslhNXoJxB6ibsxp6g/132\"}";
		String session_key = "BSIQsKVFMjX5cfB/zzQCnA==";
		String signature = "fb9c998096c2b5e774c152241e092d5c90403279";
		boolean checkSignature = WeixinMiniUtils.checkSignature(rawData, session_key, signature);
		System.out.println(checkSignature);
	}
}
