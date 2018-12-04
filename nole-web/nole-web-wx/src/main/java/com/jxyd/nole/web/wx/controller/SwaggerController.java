package com.jxyd.nole.web.wx.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SwaggerController {
	
//  ******  swagger  ***********
//	@RequestMapping(value = "/doUrl", method = RequestMethod.GET, produces= {"text/javascript;charset=UTF-8"})
//	@ResponseBody
//	public Object doUrl(HttpServletRequest req) {
//		return "var url='" +  req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + req.getContextPath() + "'"; 
//	}
	
	@RequestMapping(value = "/info", method = RequestMethod.GET, produces= {"application/json;charset=UTF-8"})
	@ResponseBody
	public Object info() {
		Map<String, String> map = new HashMap<String,String>();
		Subject subject = SecurityUtils.getSubject();
		if(subject.isAuthenticated()){
			map.put("code", "0");
			map.put("msg", "Login successfully");
		}else{
			map.put("code", "1");
			map.put("msg", "Please login first");
		}
		return map; 
	}
	
	@RequestMapping(value = "/swagger-ui.html", method = RequestMethod.GET)
	public Object waggerUi(HttpServletRequest req) {
		return "/META-INF/resources/swagger-ui.html"; 
	}
}
