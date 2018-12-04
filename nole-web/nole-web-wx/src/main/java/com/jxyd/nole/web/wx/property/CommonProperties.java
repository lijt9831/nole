package com.jxyd.nole.web.wx.property;

import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

/** 
 * 说明：CommonProperties
 * 创建人：zxg
 * 创建时间：2018
 */
@Component
public class CommonProperties {

	/**
	 * 图片地址前半段 
	 */
	public static String picVirtualPath;
	
    @Autowired
    public void setPicVirtualPath(@Value("#{common['pic.virtual.path']}") String picVirtualPath) {
    	CommonProperties.picVirtualPath = picVirtualPath;
    }
    
    
    @Bean("common")
	public Properties getProperties() {
		Properties properties = new Properties();
		try {
			properties.load(new ClassPathResource("env/common.properties").getInputStream());
		} catch (IOException e) {
			throw new RuntimeException("读取属性文件", e);
		}
		return properties;
	}
}
