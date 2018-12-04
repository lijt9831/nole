package com.jxyd.nole.web.image.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SwaggerController {
	
//  ****** 5. swagger  ***********
	@RequestMapping(value = "/doUrl", method = RequestMethod.GET, produces= {"text/javascript;charset=UTF-8"})
	@ResponseBody
	public Object doUrl(HttpServletRequest req) {
		return "var url='" +  req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + req.getContextPath() + "'"; 
	}
}
