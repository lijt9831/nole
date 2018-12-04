package com.jxyd.nole.web.ms.controller;

import java.awt.image.BufferedImage;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jxyd.nole.bas.util.CaptchaUtils;


@RestController
@RequestMapping(path = "/img")
public class ImageRestController {

	@RequestMapping(path = "/getCaptcha", method = RequestMethod.GET, headers = "Accept=image/jpeg, image/jpg, image/png, image/gif")
	public BufferedImage getCaptcha() {
		String captcha = CaptchaUtils.generate(4);
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();
		session.setAttribute("captcha", captcha);
		return CaptchaUtils.captcha2imge(captcha);
	}

}
