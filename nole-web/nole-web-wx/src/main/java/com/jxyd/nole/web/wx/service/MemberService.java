package com.jxyd.nole.web.wx.service;

import com.jxyd.nole.web.wx.controller.MemberController.GetBasicInfoReq;
import com.jxyd.nole.web.wx.controller.MemberController.GetBasicInfoRes;
import com.jxyd.nole.web.wx.controller.MemberController.GetMsgsReq;
import com.jxyd.nole.web.wx.controller.MemberController.GetMsgsRes;
import com.jxyd.nole.web.wx.controller.MemberController.GetUnreadMsgNumReq;
import com.jxyd.nole.web.wx.controller.MemberController.GetUnreadMsgNumRes;
import com.jxyd.nole.web.wx.controller.MemberController.FeedbackReq;
import com.jxyd.nole.web.wx.controller.MemberController.FeedbackRes;
import com.jxyd.nole.web.wx.controller.MemberController.ShowTeamReq;
import com.jxyd.nole.web.wx.controller.MemberController.ShowTeamRes;
import com.jxyd.nole.web.wx.controller.MemberController.CaptainNotifyReq;
import com.jxyd.nole.web.wx.controller.MemberController.CaptainNotifyRes;

/** 
 * 说明：05我的 服务接口
 * 创建人：zxg
 * 创建时间：2018-05-27
 */
public interface MemberService {

	GetBasicInfoRes getBasicInfo(GetBasicInfoReq getBasicInfoReq);
	
	GetMsgsRes getMsgs(GetMsgsReq getMsgsReq);
	
	GetUnreadMsgNumRes getUnreadMsgNum(GetUnreadMsgNumReq getUnreadMsgNumReq);
	
	FeedbackRes feedback(FeedbackReq feedbackReq);
	
	ShowTeamRes showTeam(ShowTeamReq showTeamReq);
	
	CaptainNotifyRes captainNotify(CaptainNotifyReq captainNotifyReq);
	
}
