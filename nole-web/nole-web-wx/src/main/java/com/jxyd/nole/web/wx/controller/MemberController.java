package com.jxyd.nole.web.wx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jxyd.nole.bas.util.CheckUtils;
import com.jxyd.nole.web.wx.service.MemberService;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

/** 
 * 说明：05我的
 * 创建人：zxg
 * 创建时间：2018-05-28
 */
@RestController
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	// ------------- 方法区 ----------------
	@ApiOperation(value = "01获取基本信息")
	@RequestMapping(value = "/member/getBasicInfo", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private GetBasicInfoRes getBasicInfo(@RequestBody GetBasicInfoReq getBasicInfoReq) {
		GetBasicInfoRes getBasicInfoRes = CheckUtils.checkNull(getBasicInfoReq, GetBasicInfoRes.class);
		if (getBasicInfoRes != null) {
			return getBasicInfoRes;
		}
		return memberService.getBasicInfo(getBasicInfoReq);
	}
	
	@ApiOperation(value = "02获取我的消息")
	@RequestMapping(value = "/member/getMsgs", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private GetMsgsRes getMsgs(@RequestBody GetMsgsReq getMsgsReq) {
		GetMsgsRes getMsgsRes = CheckUtils.checkNull(getMsgsReq, GetMsgsRes.class);
		if (getMsgsRes != null) {
			return getMsgsRes;
		}
		return memberService.getMsgs(getMsgsReq);
	}
	
	@ApiOperation(value = "03获取未读消息数")
	@RequestMapping(value = "/member/getUnreadMsgNum", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private GetUnreadMsgNumRes getUnreadMsgNum(@RequestBody GetUnreadMsgNumReq getUnreadMsgNumReq) {
		GetUnreadMsgNumRes getUnreadMsgNumRes = CheckUtils.checkNull(getUnreadMsgNumReq, GetUnreadMsgNumRes.class);
		if (getUnreadMsgNumRes != null) {
			return getUnreadMsgNumRes;
		}
		return memberService.getUnreadMsgNum(getUnreadMsgNumReq);
	}
	
	@ApiOperation(value = "04意见反馈")
	@RequestMapping(value = "/member/feedback", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private FeedbackRes feedback(@RequestBody FeedbackReq feedbackReq) {
		FeedbackRes feedbackRes = CheckUtils.checkNull(feedbackReq, FeedbackRes.class);
		if (feedbackRes != null) {
			return feedbackRes;
		}
		return memberService.feedback(feedbackReq);
	}
	
	@ApiOperation(value = "06展示活动")
	@RequestMapping(value = "/member/showTeam", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private ShowTeamRes showTeam(@RequestBody ShowTeamReq showTeamReq) {
		ShowTeamRes showTeamRes = CheckUtils.checkNull(showTeamReq, ShowTeamRes.class);
		if (showTeamRes != null) {
			return showTeamRes;
		}
		return memberService.showTeam(showTeamReq);
	}
	
	@ApiOperation(value = "08群通知")
	@RequestMapping(value = "/member/captainNotify", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private CaptainNotifyRes captainNotify(@RequestBody CaptainNotifyReq captainNotifyReq) {
		CaptainNotifyRes captainNotifyRes = CheckUtils.checkNull(captainNotifyReq, CaptainNotifyRes.class);
		if (captainNotifyRes != null) {
			return captainNotifyRes;
		}
		return memberService.captainNotify(captainNotifyReq);
	}
	
	// ------------- 实体区 ----------------
	@ApiModel(value="MemberController.GetBasicInfoReq")
	public static class GetBasicInfoReq{
	
		
	}
	
	@ApiModel(value="MemberController.GetBasicInfoRes")
	public static class GetBasicInfoRes{
	
		@ApiModelProperty(required = true, value = "返回码，0代表没有错误")
		private java.lang.String code;
		
		@ApiModelProperty(required = true, value = "返回信息")
		private java.lang.String msg;
		
		@ApiModelProperty(required = true, value = "昵称")
		private java.lang.String nickname;
		
		@ApiModelProperty(required = true, value = "微信头像")
		private java.lang.String headerPic;
		
		@ApiModelProperty(required = false, value = "手机号")
		private java.lang.String mobile;
		
		public java.lang.String getCode() {return code;}
		public void setCode(java.lang.String code) {this.code = code;}
		
		public java.lang.String getMsg() {return msg;}
		public void setMsg(java.lang.String msg) {this.msg = msg;}
		
		public java.lang.String getNickname() {return nickname;}
		public void setNickname(java.lang.String nickname) {this.nickname = nickname;}
		
		public java.lang.String getHeaderPic() {return headerPic;}
		public void setHeaderPic(java.lang.String headerPic) {this.headerPic = headerPic;}
		
		public java.lang.String getMobile() {return mobile;}
		public void setMobile(java.lang.String mobile) {this.mobile = mobile;}
		
	}
	
	@ApiModel(value="MemberController.GetMsgsReq")
	public static class GetMsgsReq{
	
		
	}
	
	@ApiModel(value="MemberController.GetMsgsRes")
	public static class GetMsgsRes{
	
		@ApiModelProperty(required = true, value = "返回码，0代表没有错误")
		private java.lang.String code;
		
		@ApiModelProperty(required = true, value = "返回信息")
		private java.lang.String msg;
		
		@ApiModelProperty(required = true, value = "消息列表")
		private java.util.List<Msg> msgList;
		
		public java.lang.String getCode() {return code;}
		public void setCode(java.lang.String code) {this.code = code;}
		
		public java.lang.String getMsg() {return msg;}
		public void setMsg(java.lang.String msg) {this.msg = msg;}
		
		public java.util.List<Msg> getMsgList() {return msgList;}
		public void setMsgList(java.util.List<Msg> msgList) {this.msgList = msgList;}
		
		public static class Msg{
			@ApiModelProperty(required = true, value = "消息ID")
			private java.lang.Long id;
			
			@ApiModelProperty(required = true, value = "消息内容")
			private java.lang.String content;
			
			@ApiModelProperty(required = true, value = "消息时间")
			private java.lang.String date;
			
			@ApiModelProperty(required = true, value = "消息类型：1为系统消息（系统自动发送的消息提醒，如留言评论提醒，活动提醒），2为用户消息（用户发送的消息，如领队群通知）")
			private java.lang.String type;
			
			@ApiModelProperty(required = true, value = "消息状态，0未读1已读")
			private java.lang.String status;
			
			public java.lang.Long getId() {return id;}
			public void setId(java.lang.Long id) {this.id = id;}
			
			public java.lang.String getContent() {return content;}
			public void setContent(java.lang.String content) {this.content = content;}
			
			public java.lang.String getDate() {return date;}
			public void setDate(java.lang.String date) {this.date = date;}
			
			public java.lang.String getType() {return type;}
			public void setType(java.lang.String type) {this.type = type;}
			
			public java.lang.String getStatus() {return status;}
			public void setStatus(java.lang.String status) {this.status = status;}
			
		}
	}
	
	@ApiModel(value="MemberController.GetUnreadMsgNumReq")
	public static class GetUnreadMsgNumReq{
	
		
	}
	
	@ApiModel(value="MemberController.GetUnreadMsgNumRes")
	public static class GetUnreadMsgNumRes{
	
		@ApiModelProperty(required = true, value = "返回码，0代表没有错误")
		private java.lang.String code;
		
		@ApiModelProperty(required = true, value = "返回信息")
		private java.lang.String msg;
		
		@ApiModelProperty(required = true, value = "未读消息总数")
		private java.lang.Integer unreadMessageNo;
		
		public java.lang.String getCode() {return code;}
		public void setCode(java.lang.String code) {this.code = code;}
		
		public java.lang.String getMsg() {return msg;}
		public void setMsg(java.lang.String msg) {this.msg = msg;}
		
		public java.lang.Integer getUnreadMessageNo() {return unreadMessageNo;}
		public void setUnreadMessageNo(java.lang.Integer unreadMessageNo) {this.unreadMessageNo = unreadMessageNo;}
		
	}
	
	@ApiModel(value="MemberController.FeedbackReq")
	public static class FeedbackReq{
	
		@ApiModelProperty(required = true, value = "意见")
		private java.lang.String feedback;
		
		public java.lang.String getFeedback() {return feedback;}
		public void setFeedback(java.lang.String feedback) {this.feedback = feedback;}
		
		
	}
	
	@ApiModel(value="MemberController.FeedbackRes")
	public static class FeedbackRes{
	
		@ApiModelProperty(required = true, value = "返回码，0代表没有错误")
		private java.lang.String code;
		
		@ApiModelProperty(required = true, value = "返回信息")
		private java.lang.String msg;
		
		public java.lang.String getCode() {return code;}
		public void setCode(java.lang.String code) {this.code = code;}
		
		public java.lang.String getMsg() {return msg;}
		public void setMsg(java.lang.String msg) {this.msg = msg;}
		
	}
	
	@ApiModel(value="MemberController.ShowTeamReq")
	public static class ShowTeamReq{
	
		@ApiModelProperty(required = true, value = "领队评星")
		private java.lang.Integer leaderMark;
		
		@ApiModelProperty(required = true, value = "活动评星")
		private java.lang.Integer activityMark;
		
		@ApiModelProperty(required = true, value = "路线评星")
		private java.lang.Integer lineMark;
		
		@ApiModelProperty(required = true, value = "文本评论")
		private java.lang.String content;
		
		@ApiModelProperty(required = true, value = "图片相对地址列表")
		private java.util.List<Pic> picList;
		
		public java.lang.Integer getLeaderMark() {return leaderMark;}
		public void setLeaderMark(java.lang.Integer leaderMark) {this.leaderMark = leaderMark;}
		
		public java.lang.Integer getActivityMark() {return activityMark;}
		public void setActivityMark(java.lang.Integer activityMark) {this.activityMark = activityMark;}
		
		public java.lang.Integer getLineMark() {return lineMark;}
		public void setLineMark(java.lang.Integer lineMark) {this.lineMark = lineMark;}
		
		public java.lang.String getContent() {return content;}
		public void setContent(java.lang.String content) {this.content = content;}
		
		public java.util.List<Pic> getPicList() {return picList;}
		public void setPicList(java.util.List<Pic> picList) {this.picList = picList;}
		
		public static class Pic{
			@ApiModelProperty(required = true, value = "图片相对地址")
			private java.lang.String pic;
			
			public java.lang.String getPic() {return pic;}
			public void setPic(java.lang.String pic) {this.pic = pic;}
			
		}
		
	}
	
	@ApiModel(value="MemberController.ShowTeamRes")
	public static class ShowTeamRes{
	
		@ApiModelProperty(required = true, value = "返回码，0代表没有错误")
		private java.lang.String code;
		
		@ApiModelProperty(required = true, value = "返回信息")
		private java.lang.String msg;
		
		public java.lang.String getCode() {return code;}
		public void setCode(java.lang.String code) {this.code = code;}
		
		public java.lang.String getMsg() {return msg;}
		public void setMsg(java.lang.String msg) {this.msg = msg;}
		
	}
	
	@ApiModel(value="MemberController.CaptainNotifyReq")
	public static class CaptainNotifyReq{
	
		@ApiModelProperty(required = true, value = "活动ID")
		private java.lang.Long activityId;
		
		@ApiModelProperty(required = true, value = "文本通知")
		private java.lang.String content;
		
		public java.lang.Long getActivityId() {return activityId;}
		public void setActivityId(java.lang.Long activityId) {this.activityId = activityId;}
		
		public java.lang.String getContent() {return content;}
		public void setContent(java.lang.String content) {this.content = content;}
		
		
	}
	
	@ApiModel(value="MemberController.CaptainNotifyRes")
	public static class CaptainNotifyRes{
	
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
