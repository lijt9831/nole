package com.jxyd.nole.web.wx.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxyd.nole.bas.log.Log;
import com.jxyd.nole.bas.log.LogFactory;
import com.jxyd.nole.bas.util.StringUtils;
import com.jxyd.nole.bas.util.TransferUtils;
import com.jxyd.nole.jpa.mysql.alpha.raw.mapper.Nole200UserMapper;
import com.jxyd.nole.jpa.mysql.alpha.raw.mapper.Nole207MsgsendMapper;
import com.jxyd.nole.jpa.mysql.alpha.raw.mapper.Nole309ActivityApplyMapper;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole200User;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole207MsgsendExample;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole309ActivityApply;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole309ActivityApplyExample;
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
import com.jxyd.nole.web.wx.dto.Msg;
import com.jxyd.nole.web.wx.mysql.alpha.mapper.MemberMapper;
import com.jxyd.nole.web.wx.controller.MemberController.CaptainNotifyReq;
import com.jxyd.nole.web.wx.controller.MemberController.CaptainNotifyRes;
import com.jxyd.nole.web.wx.service.MemberService;
import com.jxyd.nole.web.wx.service.MemberTransaction;

import net.sf.json.JSONObject;

/** 
 * 说明：05我的 服务实现
 * 创建人：zxg
 * 创建时间：2018
 */
@Service
public class MemberServiceImpl implements MemberService {

	private static final Log log = LogFactory.getLog(MemberServiceImpl.class);
	
	@Autowired
	private Nole200UserMapper nole200UserMapper;
	@Autowired
	private Nole207MsgsendMapper nole207MsgsendMapper;
	@Autowired
	private Nole309ActivityApplyMapper nole309ActivityApplyMapper;
	@Autowired
	private MemberMapper memberMapper;
	@Autowired
	private MemberTransaction memberTransaction;
	
	@Override
	public GetBasicInfoRes getBasicInfo(GetBasicInfoReq getBasicInfoReq) {
		GetBasicInfoRes getBasicInfoRes = new GetBasicInfoRes();
		try{
			Long userId = (Long)SecurityUtils.getSubject().getSession().getAttribute("userId");
			Nole200User user = nole200UserMapper.selectByPrimaryKey(userId);
			if(user == null) {
				getBasicInfoRes.setCode("1");
				getBasicInfoRes.setMsg("用户不存在");
				return getBasicInfoRes;
			}
			String availableOrNot = user.getAvailableOrNot();
			
			if(!"Y".equals(availableOrNot)) {
				getBasicInfoRes.setCode("1");
				getBasicInfoRes.setMsg("用户已被封禁");
				return getBasicInfoRes;
			}
			String nickname = user.getNickname();
			String wxAvatarUrl = user.getWxAvatarUrl();
			String mobile = user.getMobile();
		
			getBasicInfoRes.setNickname(nickname);
			getBasicInfoRes.setMobile(mobile);
			getBasicInfoRes.setHeaderPic(wxAvatarUrl);
			getBasicInfoRes.setCode("0");
			getBasicInfoRes.setMsg("获取用户信息成功");
			
		}catch(Exception e){
			log.error(JSONObject.fromObject(getBasicInfoReq).toString(), e);
			getBasicInfoRes.setCode("1");
			getBasicInfoRes.setMsg("获取用户信息失败");
		}
		return getBasicInfoRes;
	}
	
	@Override
	public GetMsgsRes getMsgs(GetMsgsReq getMsgsReq) {
		GetMsgsRes getMsgsRes = new GetMsgsRes();
		try{
			Long userId = (Long)SecurityUtils.getSubject().getSession().getAttribute("userId");
			List<Msg> msgsFromDB = memberMapper.selectMsgs(userId);
			List<GetMsgsRes.Msg> listForPage = new ArrayList<GetMsgsRes.Msg>();
			for (Msg msg : msgsFromDB) {
				listForPage.add(TransferUtils.transfer(msg, GetMsgsRes.Msg.class));
			}
			getMsgsRes.setMsgList(listForPage);
			getMsgsRes.setCode("0");
			getMsgsRes.setMsg("检索消息列表成功");
			
		}catch(Exception e){
			log.error(JSONObject.fromObject(getMsgsReq).toString(), e);
			getMsgsRes.setCode("1");
			getMsgsRes.setMsg("检索消息列表失败");
		}
		return getMsgsRes;
	}
	
	@Override
	public GetUnreadMsgNumRes getUnreadMsgNum(GetUnreadMsgNumReq getUnreadMsgNumReq) {
		GetUnreadMsgNumRes getUnreadMsgNumRes = new GetUnreadMsgNumRes();
		try{
			Long userId = (Long)SecurityUtils.getSubject().getSession().getAttribute("userId");
			Nole207MsgsendExample example = new Nole207MsgsendExample();
			example.createCriteria().andNole200IdEqualTo(userId).andStatusEqualTo("UNREAD");
			Long cnt = nole207MsgsendMapper.countByExample(example);
			getUnreadMsgNumRes.setCode("0");
			getUnreadMsgNumRes.setMsg("检索未读消息总数成功");
			getUnreadMsgNumRes.setUnreadMessageNo(cnt.intValue());
		}catch(Exception e){
			log.error(JSONObject.fromObject(getUnreadMsgNumReq).toString(), e);
			getUnreadMsgNumRes.setCode("1");
			getUnreadMsgNumRes.setMsg("检索未读消息总数失败");
		}
		return getUnreadMsgNumRes;
	}
	
	@Override
	public FeedbackRes feedback(FeedbackReq feedbackReq) {
		FeedbackRes feedbackRes = new FeedbackRes();
		try{
			//TODO 
		}catch(Exception e){
			log.error(JSONObject.fromObject(feedbackReq).toString(), e);
		}
		return feedbackRes;
	}
	
	@Override
	public ShowTeamRes showTeam(ShowTeamReq showTeamReq) {
		ShowTeamRes showTeamRes = new ShowTeamRes();
		try{
			//TODO 
		}catch(Exception e){
			log.error(JSONObject.fromObject(showTeamReq).toString(), e);
		}
		return showTeamRes;
	}
	
	@Override
	public CaptainNotifyRes captainNotify(CaptainNotifyReq captainNotifyReq) {
		CaptainNotifyRes captainNotifyRes = new CaptainNotifyRes();
		try{
			Long userId = (Long)SecurityUtils.getSubject().getSession().getAttribute("userId");
			Long activityId = captainNotifyReq.getActivityId();
			String content = captainNotifyReq.getContent();
			
			if(StringUtils.isBlank(content)) {
				captainNotifyRes.setCode("1");
				captainNotifyRes.setMsg("群发消息内容不能为空");
				return captainNotifyRes;
			}
			
			// 获取报名用户ID列表
			Nole309ActivityApplyExample example = new Nole309ActivityApplyExample();
			example.createCriteria().andNole301IdEqualTo(activityId);
			List<Nole309ActivityApply> applyListFromDB = nole309ActivityApplyMapper.selectByExample(example);
			List<Long> userIdList = new ArrayList<Long>();
			for (Nole309ActivityApply nole309ActivityApply : applyListFromDB) {
				Long nole200Id = nole309ActivityApply.getNole200Id();
				userIdList.add(nole200Id);
			}
			if(!userIdList.isEmpty()) {
				// 群发消息 
				memberTransaction.sendMsg(userIdList, content, userId);
			}
			captainNotifyRes.setCode("0");
			captainNotifyRes.setMsg("群发成功");
		}catch(Exception e){
			log.error(JSONObject.fromObject(captainNotifyReq).toString(), e);
			captainNotifyRes.setCode("1");
			captainNotifyRes.setMsg("群发失败");
		}
		return captainNotifyRes;
	}
	

}
