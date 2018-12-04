package com.jxyd.nole.web.wx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jxyd.nole.bas.util.CheckUtils;
import com.jxyd.nole.web.wx.service.CommonService;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

/** 
 * 说明：00通用
 * 创建人：zxg
 * 创建时间：2018-05-27
 */
@RestController
public class CommonController {

	@Autowired
	private CommonService commonService;
	
	// ------------- 方法区 ----------------
	@ApiOperation(value = "01登录")
	@RequestMapping(value = "/common/login", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private LoginRes login(@RequestBody LoginReq loginReq) {
		LoginRes loginRes = CheckUtils.checkNull(loginReq, LoginRes.class);
		if (loginRes != null) {
			return loginRes;
		}
		return commonService.login(loginReq);
	}
	
	@ApiOperation(value = "02登出")
	@RequestMapping(value = "/common/logout", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private LogoutRes logout(@RequestBody LogoutReq logoutReq) {
		LogoutRes logoutRes = CheckUtils.checkNull(logoutReq, LogoutRes.class);
		if (logoutRes != null) {
			return logoutRes;
		}
		return commonService.logout(logoutReq);
	}
	
	@ApiOperation(value = "03获取活动类别")
	@RequestMapping(value = "/common/getActivityTypes", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private GetActivityTypesRes getActivityTypes(@RequestBody GetActivityTypesReq getActivityTypesReq) {
		GetActivityTypesRes getActivityTypesRes = CheckUtils.checkNull(getActivityTypesReq, GetActivityTypesRes.class);
		if (getActivityTypesRes != null) {
			return getActivityTypesRes;
		}
		return commonService.getActivityTypes(getActivityTypesReq);
	}
	
	@ApiOperation(value = "04获取活动类别偏好")
	@RequestMapping(value = "/common/getFavActivityTypes", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private GetFavActivityTypesRes getFavActivityTypes(@RequestBody GetFavActivityTypesReq getFavActivityTypesReq) {
		GetFavActivityTypesRes getFavActivityTypesRes = CheckUtils.checkNull(getFavActivityTypesReq, GetFavActivityTypesRes.class);
		if (getFavActivityTypesRes != null) {
			return getFavActivityTypesRes;
		}
		return commonService.getFavActivityTypes(getFavActivityTypesReq);
	}
	
	@ApiOperation(value = "05配置我的爱好")
	@RequestMapping(value = "/common/configMyFavors", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private ConfigMyFavorsRes configMyFavors(@RequestBody ConfigMyFavorsReq configMyFavorsReq) {
		ConfigMyFavorsRes configMyFavorsRes = CheckUtils.checkNull(configMyFavorsReq, ConfigMyFavorsRes.class);
		if (configMyFavorsRes != null) {
			return configMyFavorsRes;
		}
		return commonService.configMyFavors(configMyFavorsReq);
	}
	
	// ------------- 实体区 ----------------
	@ApiModel(value="CommonController.LoginReq")
	public static class LoginReq{
	
		@ApiModelProperty(required = true, value = "用户登录凭证（有效期五分钟）。开发者需要在开发者服务器后台调用 api，使用 code 换取 openid 和 session_key 等信息")
		private java.lang.String code;
		
		@ApiModelProperty(required = true, value = "不包括敏感信息的原始数据字符串，用于计算签名。")
		private java.lang.String rawData;
		
		@ApiModelProperty(required = true, value = "使用 sha1( rawData + sessionkey ) 得到字符串，用于校验用户信息")
		private java.lang.String signature;
		
		@ApiModelProperty(required = true, value = "包括敏感数据在内的完整用户信息的加密数据")
		private java.lang.String encryptedData;
		
		@ApiModelProperty(required = true, value = "加密算法的初始向量")
		private java.lang.String iv;
		
		public java.lang.String getCode() {return code;}
		public void setCode(java.lang.String code) {this.code = code;}
		
		public java.lang.String getRawData() {return rawData;}
		public void setRawData(java.lang.String rawData) {this.rawData = rawData;}
		
		public java.lang.String getSignature() {return signature;}
		public void setSignature(java.lang.String signature) {this.signature = signature;}
		
		public java.lang.String getEncryptedData() {return encryptedData;}
		public void setEncryptedData(java.lang.String encryptedData) {this.encryptedData = encryptedData;}
		
		public java.lang.String getIv() {return iv;}
		public void setIv(java.lang.String iv) {this.iv = iv;}
		
		
	}
	
	@ApiModel(value="CommonController.LoginRes")
	public static class LoginRes{
	
		@ApiModelProperty(required = true, value = "返回码，0代表没有错误")
		private java.lang.String code;
		
		@ApiModelProperty(required = true, value = "返回信息")
		private java.lang.String msg;
		
		public java.lang.String getCode() {return code;}
		public void setCode(java.lang.String code) {this.code = code;}
		
		public java.lang.String getMsg() {return msg;}
		public void setMsg(java.lang.String msg) {this.msg = msg;}
		
	}
	
	@ApiModel(value="CommonController.LogoutReq")
	public static class LogoutReq{
	
		
	}
	
	@ApiModel(value="CommonController.LogoutRes")
	public static class LogoutRes{
	
		@ApiModelProperty(required = true, value = "返回码，0代表没有错误")
		private java.lang.String code;
		
		@ApiModelProperty(required = true, value = "返回信息")
		private java.lang.String msg;
		
		public java.lang.String getCode() {return code;}
		public void setCode(java.lang.String code) {this.code = code;}
		
		public java.lang.String getMsg() {return msg;}
		public void setMsg(java.lang.String msg) {this.msg = msg;}
		
	}
	
	@ApiModel(value="CommonController.GetActivityTypesReq")
	public static class GetActivityTypesReq{
	
		@ApiModelProperty(required = true, value = "活动线路ID")
		private java.lang.Long lineId;
		
		public java.lang.Long getLineId() {return lineId;}
		public void setLineId(java.lang.Long lineId) {this.lineId = lineId;}
		
		
	}
	
	@ApiModel(value="CommonController.GetActivityTypesRes")
	public static class GetActivityTypesRes{
	
		@ApiModelProperty(required = true, value = "返回码，0代表没有错误")
		private java.lang.String code;
		
		@ApiModelProperty(required = true, value = "返回信息")
		private java.lang.String msg;
		
		@ApiModelProperty(required = true, value = "活动类别列表")
		private java.util.List<ActivityType> activityTypeList;
		
		public java.lang.String getCode() {return code;}
		public void setCode(java.lang.String code) {this.code = code;}
		
		public java.lang.String getMsg() {return msg;}
		public void setMsg(java.lang.String msg) {this.msg = msg;}
		
		public java.util.List<ActivityType> getActivityTypeList() {return activityTypeList;}
		public void setActivityTypeList(java.util.List<ActivityType> activityTypeList) {this.activityTypeList = activityTypeList;}
		
		public static class ActivityType{
			@ApiModelProperty(required = true, value = "活动类型ID")
			private java.lang.Long id;
			
			@ApiModelProperty(required = true, value = "活动类型")
			private java.lang.String type;
			
			@ApiModelProperty(required = true, value = "活动模板号")
			private java.lang.String modelCode;
			
			public java.lang.Long getId() {return id;}
			public void setId(java.lang.Long id) {this.id = id;}
			
			public java.lang.String getType() {return type;}
			public void setType(java.lang.String type) {this.type = type;}
			
			public java.lang.String getModelCode() {return modelCode;}
			public void setModelCode(java.lang.String modelCode) {this.modelCode = modelCode;}
			
		}
	}
	
	@ApiModel(value="CommonController.GetFavActivityTypesReq")
	public static class GetFavActivityTypesReq{
	
		
	}
	
	@ApiModel(value="CommonController.GetFavActivityTypesRes")
	public static class GetFavActivityTypesRes{
	
		@ApiModelProperty(required = true, value = "返回码，0代表没有错误")
		private java.lang.String code;
		
		@ApiModelProperty(required = true, value = "返回信息")
		private java.lang.String msg;
		
		@ApiModelProperty(required = true, value = "活动类别列表")
		private java.util.List<ActivityType> activityTypeList;
		
		public java.lang.String getCode() {return code;}
		public void setCode(java.lang.String code) {this.code = code;}
		
		public java.lang.String getMsg() {return msg;}
		public void setMsg(java.lang.String msg) {this.msg = msg;}
		
		public java.util.List<ActivityType> getActivityTypeList() {return activityTypeList;}
		public void setActivityTypeList(java.util.List<ActivityType> activityTypeList) {this.activityTypeList = activityTypeList;}
		
		public static class ActivityType{
			@ApiModelProperty(required = true, value = "活动类型ID")
			private java.lang.Long id;
			
			@ApiModelProperty(required = true, value = "活动类型")
			private java.lang.String type;
			
			@ApiModelProperty(required = true, value = "内容为0时，为用户未选中的偏好类型;内容为1时，为用户已选中的偏好类型")
			private java.lang.String checked;
			
			public java.lang.Long getId() {return id;}
			public void setId(java.lang.Long id) {this.id = id;}
			
			public java.lang.String getType() {return type;}
			public void setType(java.lang.String type) {this.type = type;}
			
			public java.lang.String getChecked() {return checked;}
			public void setChecked(java.lang.String checked) {this.checked = checked;}
			
		}
	}
	
	@ApiModel(value="CommonController.ConfigMyFavorsReq")
	public static class ConfigMyFavorsReq{
	
		@ApiModelProperty(required = true, value = "删除的活动类型ID列表")
		private java.util.List<Del> delList;
		
		@ApiModelProperty(required = true, value = "添加的活动类型ID列表")
		private java.util.List<Add> addList;
		
		public java.util.List<Del> getDelList() {return delList;}
		public void setDelList(java.util.List<Del> delList) {this.delList = delList;}
		
		public java.util.List<Add> getAddList() {return addList;}
		public void setAddList(java.util.List<Add> addList) {this.addList = addList;}
		
		public static class Del{
			@ApiModelProperty(required = true, value = "删除的活动类型ID")
			private java.lang.Long id;
			
			public java.lang.Long getId() {return id;}
			public void setId(java.lang.Long id) {this.id = id;}
			
		}
		public static class Add{
			@ApiModelProperty(required = true, value = "添加的活动类型ID")
			private java.lang.Long id;
			
			public java.lang.Long getId() {return id;}
			public void setId(java.lang.Long id) {this.id = id;}
			
		}
		
	}
	
	@ApiModel(value="CommonController.ConfigMyFavorsRes")
	public static class ConfigMyFavorsRes{
	
		@ApiModelProperty(required = true, value = "返回码，0代表没有错误")
		private java.lang.String code;
		
		@ApiModelProperty(required = true, value = "返回信息")
		private java.lang.String msg;
		
		public java.lang.String getCode() {return code;}
		public void setCode(java.lang.String code) {this.code = code;}
		
		public java.lang.String getMsg() {return msg;}
		public void setMsg(java.lang.String msg) {this.msg = msg;}
		
	}
	
}
