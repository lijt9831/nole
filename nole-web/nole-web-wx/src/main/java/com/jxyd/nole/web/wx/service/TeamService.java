package com.jxyd.nole.web.wx.service;

import com.jxyd.nole.web.wx.controller.TeamController.GetMyAcitivityListReq;
import com.jxyd.nole.web.wx.controller.TeamController.GetMyAcitivityListRes;
import com.jxyd.nole.web.wx.controller.TeamController.GetAcitivityListReq;
import com.jxyd.nole.web.wx.controller.TeamController.GetAcitivityListRes;
import com.jxyd.nole.web.wx.controller.TeamController.ConfigCarTeamReq;
import com.jxyd.nole.web.wx.controller.TeamController.ConfigCarTeamRes;
import com.jxyd.nole.web.wx.controller.TeamController.GetCarActivityBaseReq;
import com.jxyd.nole.web.wx.controller.TeamController.GetCarActivityBaseRes;
import com.jxyd.nole.web.wx.controller.TeamController.ConfigFootTeamReq;
import com.jxyd.nole.web.wx.controller.TeamController.ConfigFootTeamRes;
import com.jxyd.nole.web.wx.controller.TeamController.GetFootBaseReq;
import com.jxyd.nole.web.wx.controller.TeamController.GetFootBaseRes;
import com.jxyd.nole.web.wx.controller.TeamController.BingdingMobileReq;
import com.jxyd.nole.web.wx.controller.TeamController.BingdingMobileRes;
import com.jxyd.nole.web.wx.controller.TeamController.GetApplyInfoReq;
import com.jxyd.nole.web.wx.controller.TeamController.GetApplyInfoRes;
import com.jxyd.nole.web.wx.controller.TeamController.GetLeaveMessageReq;
import com.jxyd.nole.web.wx.controller.TeamController.GetLeaveMessageRes;
import com.jxyd.nole.web.wx.controller.TeamController.GetBrowserReq;
import com.jxyd.nole.web.wx.controller.TeamController.GetBrowserRes;
import com.jxyd.nole.web.wx.controller.TeamController.GetBingdingMobileReq;
import com.jxyd.nole.web.wx.controller.TeamController.GetBingdingMobileRes;
import com.jxyd.nole.web.wx.controller.TeamController.CarApplyReq;
import com.jxyd.nole.web.wx.controller.TeamController.CarApplyRes;
import com.jxyd.nole.web.wx.controller.TeamController.FootApplyReq;
import com.jxyd.nole.web.wx.controller.TeamController.FootApplyRes;

/** 
 * 说明：03组队 服务接口
 * 创建人：zxg
 * 创建时间：2018-05-27
 */
public interface TeamService {

	GetMyAcitivityListRes getMyAcitivityList(GetMyAcitivityListReq getMyAcitivityListReq);
	
	GetAcitivityListRes getAcitivityList(GetAcitivityListReq getAcitivityListReq);
	
	ConfigCarTeamRes configCarTeam(ConfigCarTeamReq configCarTeamReq);
	
	GetCarActivityBaseRes getCarActivityBase(GetCarActivityBaseReq getCarActivityBaseReq);
	
	ConfigFootTeamRes configFootTeam(ConfigFootTeamReq configFootTeamReq);
	
	GetFootBaseRes getFootBase(GetFootBaseReq getFootBaseReq);
	
	BingdingMobileRes bingdingMobile(BingdingMobileReq bingdingMobileReq);
	
	GetApplyInfoRes getApplyInfo(GetApplyInfoReq getApplyInfoReq);
	
	GetLeaveMessageRes getLeaveMessage(GetLeaveMessageReq getLeaveMessageReq);
	
	GetBrowserRes getBrowser(GetBrowserReq getBrowserReq);
	
	GetBingdingMobileRes getBingdingMobile(GetBingdingMobileReq getBingdingMobileReq);
	
	CarApplyRes carApply(CarApplyReq carApplyReq);
	
	FootApplyRes footApply(FootApplyReq footApplyReq);
	
}
