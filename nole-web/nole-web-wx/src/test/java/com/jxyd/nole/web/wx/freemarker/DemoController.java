package com.jxyd.nole.web.wx.freemarker;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

@RestController
public class DemoController {

	// ------------- 方法区 ----------------
	
	@ApiOperation(value = "登录")
	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private LoginRes login(@RequestBody LoginReq loginReq) {
		// TODO
		LoginRes loginRes = new LoginRes();
		return loginRes;
	}
	
	// ------------- 实体区 ----------------

	@ApiModel(value="CommonController.LoginReq")
	public static class LoginReq{
		@ApiModelProperty(required = true, value = "用户登录凭证（有效期五分钟）。开发者需要在开发者服务器后台调用 api，使用 code 换取 openid 和 session_key 等信息")
		private java.lang.String code;
		public java.lang.String getCode() {return code;}
		public void setCode(java.lang.String code) {this.code = code;}
	}
	
	@ApiModel(value="CommonController.LoginRes")
	public static class LoginRes{
		
		@ApiModelProperty(required = true, value = "返回码，0代表没有错误")
		private java.lang.String code;
		public java.lang.String getCode() {return code;}
		public void setCode(java.lang.String code) {this.code = code;}
		
		@ApiModelProperty(required = true, value = "返回信息")
		private java.lang.String msg;
		public java.lang.String getMsg() {return msg;}
		public void setMsg(java.lang.String msg) {this.msg = msg;}
		
		@ApiModelProperty(required = false, value = "令牌,登录凭证,令牌失效需要重新登录")
		private java.lang.String token;
		public java.lang.String getToken() {return token;}
		public void setToken(java.lang.String token) {this.token = token;}
	}
}
