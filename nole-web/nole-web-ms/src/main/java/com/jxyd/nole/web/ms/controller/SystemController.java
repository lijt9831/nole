package com.jxyd.nole.web.ms.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys02Role;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys04User;
import com.jxyd.nole.web.ms.msg.ErrorMessage;
import com.jxyd.nole.web.ms.msg.SuccessMessage;
import com.jxyd.nole.web.ms.sys.SystemService;

import net.sf.json.JSONArray;

@Controller
public class SystemController {

	@Autowired
	private SystemService systemService;

	// ╭────────────────────────────────────╮

	@RequestMapping(path = "/login")
	public String login(Model model) {
		Subject subject = SecurityUtils.getSubject();
		if (subject.isAuthenticated()) {
			return "redirect:main";
		}
		return "login";
	}

	@RequestMapping(path = "/logining")
	@ResponseBody
	public Object logining(String username, String password, String captcha) {
		if (username == null || password == null) {
			return new ErrorMessage("参数值缺失");
		}
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();
		String sessionCaptcha = (String) session.getAttribute("captcha");
		if (sessionCaptcha != null && !sessionCaptcha.equalsIgnoreCase(captcha)) {
			return new ErrorMessage("验证码错误");
		}
		try {
			subject.login(new UsernamePasswordToken(username, password));
		} catch (AuthenticationException e) {
			return new ErrorMessage("用户名或密码错误");
		}
		session.removeAttribute("captcha");
		return new SuccessMessage("login success");
	}

	@RequestMapping(path = "/logout")
	public String logout() {
		SecurityUtils.getSubject().logout();
		return "redirect:login";
	}

	@RequestMapping(path = "/main")
	public String main() {
		return "main";
	}

	@RequestMapping(path = "/unauthorized")
	public String unauthorized() {
		return "unauthorized";
	}

	// ╰━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━╯

	@RequestMapping(path = "/sys/menu")
	public String menu() {
		return "sys/menu";
	}

	@RequestMapping(path = "/sys/permission")
	public String permission() {
		return "sys/permission";
	}

	@RequestMapping(path = "/sys/roleAdd")
	public String roleAdd() {
		return "sys/roleAdd";
	}

	@RequestMapping(path = "/sys/roleEdit")
	public String roleEdit(int id, Model model) {
		Sys02Role role = systemService.getRole(id);
		model.addAttribute("id", id);
		model.addAttribute("role", role.getRole());
		model.addAttribute("isAvailable", role.getIsAvailable());
		return "sys/roleEdit";
	}

	@RequestMapping(path = "/sys/roleList")
	public String roleList() {
		return "sys/roleList";
	}
	
	@RequestMapping(path = "/sys/userAdd")
	public String userAdd(Model model) {
		//全部角色，未选中
		JSONArray roleArray = systemService.getRoleArray(-1);
		model.addAttribute("roleArray", roleArray);
		return "sys/userAdd";
	}
	
	//TODO 打开一个编辑页面，里面有一个选中的角色，在另一个页面删除这个角色，然后保存
	@RequestMapping(path = "/sys/userEdit")
	public String userEdit(int id, Model model) {
		Sys04User user =systemService.getUser(id);
		model.addAttribute("user", user);
		// 全部角色和部分选中的 
		JSONArray roleArray = systemService.getRoleArray(id);
		model.addAttribute("roleArray", roleArray);
		return "sys/userEdit";
	}
	
	@RequestMapping(path = "/sys/userList")
	public String userList() {
		return "sys/userList";
	}

}
