package com.jxyd.nole.web.wx.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxyd.nole.bas.log.Log;
import com.jxyd.nole.bas.log.LogFactory;
import com.jxyd.nole.bas.util.TransferUtils;
import com.jxyd.nole.jpa.mysql.alpha.raw.mapper.Nole200UserMapper;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole200User;
import com.jxyd.nole.web.wx.controller.CommonController;
import com.jxyd.nole.web.wx.controller.CommonController.ConfigMyFavorsReq;
import com.jxyd.nole.web.wx.controller.CommonController.ConfigMyFavorsRes;
import com.jxyd.nole.web.wx.controller.CommonController.GetActivityTypesReq;
import com.jxyd.nole.web.wx.controller.CommonController.GetActivityTypesRes;
import com.jxyd.nole.web.wx.controller.CommonController.GetFavActivityTypesReq;
import com.jxyd.nole.web.wx.controller.CommonController.GetFavActivityTypesRes;
import com.jxyd.nole.web.wx.controller.CommonController.LoginReq;
import com.jxyd.nole.web.wx.controller.CommonController.LoginRes;
import com.jxyd.nole.web.wx.controller.CommonController.LogoutReq;
import com.jxyd.nole.web.wx.controller.CommonController.LogoutRes;
import com.jxyd.nole.web.wx.dto.ActivityType;
import com.jxyd.nole.web.wx.mysql.alpha.mapper.ActivityMapper;
import com.jxyd.nole.web.wx.property.WeixinProperties;
import com.jxyd.nole.web.wx.service.CommonService;
import com.jxyd.nole.web.wx.service.CommonTransaction;
import com.jxyd.nole.web.wx.util.WeixinMiniUtils;

import net.sf.json.JSONObject;

/** 
 * 说明：00通用 服务实现
 * 创建人：zxg
 * 创建时间：2018
 */
@Service
public class CommonServiceImpl implements CommonService {

	private static final Log log = LogFactory.getLog(CommonServiceImpl.class);
	
	@Autowired
	private Nole200UserMapper nole200UserMapper;
	@Autowired
	private ActivityMapper activityMapper;
	@Autowired
	private CommonTransaction commonTransaction;
	
	@Override
	public LoginRes login(LoginReq loginReq) {
		
		// 假登录 
//		if(WeixinProperties.fakeOnoff) {
//			return fakeLogin();
//		}
		
		LoginRes loginRes = new LoginRes();
		
		try{
			String code = loginReq.getCode();
			
			Map<String, String> checkCode = WeixinMiniUtils.checkCode(code);
			if(!"0".equals(checkCode.get("code"))){
				loginRes.setCode(checkCode.get("code"));
				loginRes.setMsg(checkCode.get("msg"));
				return loginRes;
			}
			
			String session_key = checkCode.get("session_key");
			
			String rawData = loginReq.getRawData();
			String encryptedData = loginReq.getEncryptedData();
			String signature = loginReq.getSignature();
			String iv = loginReq.getIv();
			boolean checkSignature = WeixinMiniUtils.checkSignature(rawData, session_key, signature);
			
			if(!checkSignature) {
				loginRes.setCode("1");
				loginRes.setMsg("签名校验失败");
				return loginRes;
			}
			
			/* 
				{
				    "openId": "OPENID",
				    "nickName": "NICKNAME",
				    "gender": GENDER,
				    "city": "CITY",
				    "province": "PROVINCE",
				    "country": "COUNTRY",
				    "avatarUrl": "AVATARURL",
				    "unionId": "UNIONID",
				    "watermark":
				    {
				        "appid":"APPID",
				        "timestamp":TIMESTAMP
				    }
				} 
			 
			 * */
			
			String decrypted = WeixinMiniUtils.decrypt(encryptedData, session_key, iv);
			JSONObject json = JSONObject.fromObject(decrypted);
			
			String openId = json.getString("openId");
			
			Nole200User user = nole200UserMapper.selectByIndex1(openId);
			Date date = new Date();
			int sql = 0;
			Long userId;
			if(user == null) {
				// 新增
				Nole200User nole200User4insert = new Nole200User();
				nole200User4insert.setWxOpenid(openId);
				nole200User4insert.setWxSessionKey(session_key);
				nole200User4insert.setWxNickName(json.getString("nickName"));
				nole200User4insert.setWxAvatarUrl(json.getString("avatarUrl"));
				nole200User4insert.setWxGender(json.getString("gender"));
				nole200User4insert.setWxCity(json.getString("city"));
				nole200User4insert.setWxProvince(json.getString("province"));
				nole200User4insert.setWxCountry(json.getString("country"));
				nole200User4insert.setNickname(json.getString("nickName"));
				nole200User4insert.setVerifiedOrNot("N");
				nole200User4insert.setAvailableOrNot("Y");
				nole200User4insert.setGmtCreate(date);
				nole200User4insert.setGmtModified(date);
				sql = nole200UserMapper.insert(nole200User4insert);
				userId = nole200User4insert.getId();
			} else {
				// 编辑
				Nole200User nole200User4update = new Nole200User();
				nole200User4update.setId(user.getId());
				nole200User4update.setWxSessionKey(session_key);
				nole200User4update.setWxNickName(json.getString("nickName"));
				nole200User4update.setWxAvatarUrl(json.getString("avatarUrl"));
				nole200User4update.setWxGender(json.getString("gender"));
				nole200User4update.setWxCity(json.getString("city"));
				nole200User4update.setWxProvince(json.getString("province"));
				nole200User4update.setWxCountry(json.getString("country"));
				nole200User4update.setNickname(json.getString("nickName"));
				nole200User4update.setGmtModified(date);
				sql = nole200UserMapper.updateByPrimaryKeySelective(nole200User4update);
				userId = user.getId();
			}
			
			if(sql == 1) {
				// 登录 
				Subject subject = SecurityUtils.getSubject();
				AuthenticationToken authenticationToken = new UsernamePasswordToken(openId,session_key);
				subject.login(authenticationToken);
				Session session = subject.getSession();
				session.setAttribute("openId", openId);
				session.setAttribute("session_key", session_key);
				session.setAttribute("userId", userId);
				loginRes.setCode("0");
				loginRes.setMsg("登录成功");
			} else {
				loginRes.setCode("1");
				loginRes.setMsg("入库失败");
			}
			
		}catch(Exception e){
			log.error(JSONObject.fromObject(loginReq).toString(), e);
			loginRes.setCode("9");
			loginRes.setMsg("登录失败");
		}
		return loginRes;
	}

	@Override
	public LogoutRes logout(LogoutReq logoutReq) {
		LogoutRes logoutRes = new LogoutRes();
		try{
			Subject subject = SecurityUtils.getSubject();
			subject.logout();
			logoutRes.setCode("0");
			logoutRes.setMsg("您已退出登录");
		}catch(Exception e){
			log.error(JSONObject.fromObject(logoutReq).toString(), e);
			logoutRes.setCode("1");
			logoutRes.setMsg("登出失败");
		}
		return logoutRes;
	}
	
	@Override
	public GetActivityTypesRes getActivityTypes(GetActivityTypesReq getActivityTypesReq) {
		GetActivityTypesRes getActivityTypesRes = new GetActivityTypesRes();
		try{
			Long lineId = getActivityTypesReq.getLineId();
			if(lineId == null) {
				getActivityTypesRes.setCode("1");
				getActivityTypesRes.setMsg("参数缺失");
				return getActivityTypesRes;
			}
			List<ActivityType> activityTypeList = activityMapper.selectActivityTypeByLineId(lineId);
			List<CommonController.GetActivityTypesRes.ActivityType> list = new ArrayList<CommonController.GetActivityTypesRes.ActivityType>();
			for (ActivityType activityType : activityTypeList) {
				list.add(TransferUtils.transfer(activityType, CommonController.GetActivityTypesRes.ActivityType.class));
			}
			getActivityTypesRes.setActivityTypeList(list);
			getActivityTypesRes.setCode("0");
			getActivityTypesRes.setMsg("获取数据成功");
		}catch(Exception e){
			log.error(JSONObject.fromObject(getActivityTypesReq).toString(), e);
			getActivityTypesRes.setCode("1");
			getActivityTypesRes.setMsg("获取数据失败");
		}
		return getActivityTypesRes;
	}
	
	@Override
	public GetFavActivityTypesRes getFavActivityTypes(GetFavActivityTypesReq getFavActivityTypesReq) {
		GetFavActivityTypesRes getFavActivityTypesRes = new GetFavActivityTypesRes();
		try{
			Subject subject = SecurityUtils.getSubject();
			Long userId = (Long)subject.getSession().getAttribute("userId");
			List<ActivityType> activityTypeList = activityMapper.selectActivityTypeByUserId(userId);
			List<CommonController.GetFavActivityTypesRes.ActivityType> list = new ArrayList<CommonController.GetFavActivityTypesRes.ActivityType>();
			for (ActivityType activityType : activityTypeList) {
				list.add(TransferUtils.transfer(activityType, CommonController.GetFavActivityTypesRes.ActivityType.class));
			}
			getFavActivityTypesRes.setActivityTypeList(list);
			getFavActivityTypesRes.setCode("0");
			getFavActivityTypesRes.setMsg("获取数据成功");
		}catch(Exception e){
			log.error(JSONObject.fromObject(getFavActivityTypesReq).toString(), e);
			getFavActivityTypesRes.setCode("1");
			getFavActivityTypesRes.setMsg("获取数据失败");
		}
		return getFavActivityTypesRes;
	}
	
	@Override
	public ConfigMyFavorsRes configMyFavors(ConfigMyFavorsReq configMyFavorsReq) {
		ConfigMyFavorsRes configMyFavorsRes = new ConfigMyFavorsRes();
		try{
			commonTransaction.configMyFavors(configMyFavorsReq);
			configMyFavorsRes.setCode("0");
			configMyFavorsRes.setMsg("配置爱好成功");
		}catch(Exception e){
			log.error(JSONObject.fromObject(configMyFavorsReq).toString(), e);
			configMyFavorsRes.setCode("1");
			configMyFavorsRes.setMsg("配置爱好失败");
		}
		return configMyFavorsRes;
	}
	
	
	private LoginRes fakeLogin() {
		log.warn("You are faking login, this scene just for testing.");
		Subject subject = SecurityUtils.getSubject();
		AuthenticationToken authenticationToken = new UsernamePasswordToken(WeixinProperties.fakeOpenid, WeixinProperties.fakeSessionKey);
		subject.login(authenticationToken);
		Session session = subject.getSession();
		session.setAttribute("openId", WeixinProperties.fakeOpenid);
		session.setAttribute("session_key", WeixinProperties.fakeSessionKey);
		session.setAttribute("userId", Long.valueOf(WeixinProperties.fakeUserid));
		LoginRes loginRes = new LoginRes();
		loginRes.setCode("0");
		loginRes.setMsg("登录成功");
		return loginRes;
	}

}
