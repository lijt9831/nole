package com.jxyd.nole.web.wx.property;

import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

/** 
 * 说明：WeixinProperties
 * 创建人：zxg
 * 创建时间：2018
 */
@Component
public class WeixinProperties {

	/**
	 * 欺骗开关，用于假登录测试
	 */
	public static boolean fakeOnoff;
	

	public static String fakeOpenid;
	

	public static String fakeSessionKey;
	

	public static String fakeUserid;
	
	/**
	 * 微信小程序参数 
	 */
	public static String appid;
	

	public static String appsecret;
	

	public static String urlCheckcode;
	
    @Autowired
    public void setFakeOnoff(@Value("#{weixin['fake.onoff']}") boolean fakeOnoff) {
    	WeixinProperties.fakeOnoff = fakeOnoff;
    }
    
    @Autowired
    public void setFakeOpenid(@Value("#{weixin['fake.openid']}") String fakeOpenid) {
    	WeixinProperties.fakeOpenid = fakeOpenid;
    }
    
    @Autowired
    public void setFakeSessionKey(@Value("#{weixin['fake.session_key']}") String fakeSessionKey) {
    	WeixinProperties.fakeSessionKey = fakeSessionKey;
    }
    
    @Autowired
    public void setFakeUserid(@Value("#{weixin['fake.userid']}") String fakeUserid) {
    	WeixinProperties.fakeUserid = fakeUserid;
    }
    
    @Autowired
    public void setAppid(@Value("#{weixin['appid']}") String appid) {
    	WeixinProperties.appid = appid;
    }
    
    @Autowired
    public void setAppsecret(@Value("#{weixin['appsecret']}") String appsecret) {
    	WeixinProperties.appsecret = appsecret;
    }
    
    @Autowired
    public void setUrlCheckcode(@Value("#{weixin['url.checkcode']}") String urlCheckcode) {
    	WeixinProperties.urlCheckcode = urlCheckcode;
    }
    
    
    @Bean("weixin")
	public Properties getProperties() {
		Properties properties = new Properties();
		try {
			properties.load(new ClassPathResource("env/weixin.properties").getInputStream());
		} catch (IOException e) {
			throw new RuntimeException("读取属性文件", e);
		}
		return properties;
	}
}
