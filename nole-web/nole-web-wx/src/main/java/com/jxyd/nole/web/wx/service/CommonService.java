package com.jxyd.nole.web.wx.service;

import com.jxyd.nole.web.wx.controller.CommonController.LoginReq;
import com.jxyd.nole.web.wx.controller.CommonController.LoginRes;
import com.jxyd.nole.web.wx.controller.CommonController.LogoutReq;
import com.jxyd.nole.web.wx.controller.CommonController.LogoutRes;
import com.jxyd.nole.web.wx.controller.CommonController.GetActivityTypesReq;
import com.jxyd.nole.web.wx.controller.CommonController.GetActivityTypesRes;
import com.jxyd.nole.web.wx.controller.CommonController.GetFavActivityTypesReq;
import com.jxyd.nole.web.wx.controller.CommonController.GetFavActivityTypesRes;
import com.jxyd.nole.web.wx.controller.CommonController.ConfigMyFavorsReq;
import com.jxyd.nole.web.wx.controller.CommonController.ConfigMyFavorsRes;

/** 
 * 说明：00通用 服务接口
 * 创建人：zxg
 * 创建时间：2018-05-27
 */
public interface CommonService {

	LoginRes login(LoginReq loginReq);
	
	LogoutRes logout(LogoutReq logoutReq);
	
	GetActivityTypesRes getActivityTypes(GetActivityTypesReq getActivityTypesReq);
	
	GetFavActivityTypesRes getFavActivityTypes(GetFavActivityTypesReq getFavActivityTypesReq);
	
	ConfigMyFavorsRes configMyFavors(ConfigMyFavorsReq configMyFavorsReq);
	
}
