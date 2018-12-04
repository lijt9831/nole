package com.jxyd.nole.web.wx.property;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath*:spring/root/public_*.xml","classpath:spring/root/private_*"})
@RunWith(SpringJUnit4ClassRunner.class)
public class WeixinPropertiesTest {

	@Test
	public void test() {
		System.out.println(WeixinProperties.appid);
		System.out.println(WeixinProperties.appsecret);
		System.out.println(WeixinProperties.urlCheckcode);
		if(WeixinProperties.fakeOnoff) {
			System.out.println("fake 开启");
		}else {
			System.out.println("fake 关闭");
		}
	}

}
