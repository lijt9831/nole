package com.jxyd.nole.web.wx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jxyd.nole.bas.util.CheckUtils;
import com.jxyd.nole.web.wx.service.TeamService;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

/** 
 * 说明：03组队
 * 创建人：zxg
 * 创建时间：2018-07-13
 */
@RestController
public class TeamController {

	@Autowired
	private TeamService teamService;
	
	// ------------- 方法区 ----------------
	@ApiOperation(value = "01获取我发起的组队活动列表")
	@RequestMapping(value = "/team/getMyAcitivityList", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private GetMyAcitivityListRes getMyAcitivityList(@RequestBody GetMyAcitivityListReq getMyAcitivityListReq) {
		GetMyAcitivityListRes getMyAcitivityListRes = CheckUtils.checkNull(getMyAcitivityListReq, GetMyAcitivityListRes.class);
		if (getMyAcitivityListRes != null) {
			return getMyAcitivityListRes;
		}
		return teamService.getMyAcitivityList(getMyAcitivityListReq);
	}
	
	@ApiOperation(value = "02获取组队活动列表")
	@RequestMapping(value = "/team/getAcitivityList", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private GetAcitivityListRes getAcitivityList(@RequestBody GetAcitivityListReq getAcitivityListReq) {
		GetAcitivityListRes getAcitivityListRes = CheckUtils.checkNull(getAcitivityListReq, GetAcitivityListRes.class);
		if (getAcitivityListRes != null) {
			return getAcitivityListRes;
		}
		return teamService.getAcitivityList(getAcitivityListReq);
	}
	
	@ApiOperation(value = "03配置车类组队")
	@RequestMapping(value = "/team/configCarTeam", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private ConfigCarTeamRes configCarTeam(@RequestBody ConfigCarTeamReq configCarTeamReq) {
		ConfigCarTeamRes configCarTeamRes = CheckUtils.checkNull(configCarTeamReq, ConfigCarTeamRes.class);
		if (configCarTeamRes != null) {
			return configCarTeamRes;
		}
		return teamService.configCarTeam(configCarTeamReq);
	}
	
	@ApiOperation(value = "04获取车类组队基本信息")
	@RequestMapping(value = "/team/getCarActivityBase", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private GetCarActivityBaseRes getCarActivityBase(@RequestBody GetCarActivityBaseReq getCarActivityBaseReq) {
		GetCarActivityBaseRes getCarActivityBaseRes = CheckUtils.checkNull(getCarActivityBaseReq, GetCarActivityBaseRes.class);
		if (getCarActivityBaseRes != null) {
			return getCarActivityBaseRes;
		}
		return teamService.getCarActivityBase(getCarActivityBaseReq);
	}
	
	@ApiOperation(value = "05配置徒步组队")
	@RequestMapping(value = "/team/configFootTeam", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private ConfigFootTeamRes configFootTeam(@RequestBody ConfigFootTeamReq configFootTeamReq) {
		ConfigFootTeamRes configFootTeamRes = CheckUtils.checkNull(configFootTeamReq, ConfigFootTeamRes.class);
		if (configFootTeamRes != null) {
			return configFootTeamRes;
		}
		return teamService.configFootTeam(configFootTeamReq);
	}
	
	@ApiOperation(value = "06获取徒步组队基本信息")
	@RequestMapping(value = "/team/getFootBase", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private GetFootBaseRes getFootBase(@RequestBody GetFootBaseReq getFootBaseReq) {
		GetFootBaseRes getFootBaseRes = CheckUtils.checkNull(getFootBaseReq, GetFootBaseRes.class);
		if (getFootBaseRes != null) {
			return getFootBaseRes;
		}
		return teamService.getFootBase(getFootBaseReq);
	}
	
	@ApiOperation(value = "08绑定手机号")
	@RequestMapping(value = "/team/bingdingMobile", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private BingdingMobileRes bingdingMobile(@RequestBody BingdingMobileReq bingdingMobileReq) {
		BingdingMobileRes bingdingMobileRes = CheckUtils.checkNull(bingdingMobileReq, BingdingMobileRes.class);
		if (bingdingMobileRes != null) {
			return bingdingMobileRes;
		}
		return teamService.bingdingMobile(bingdingMobileReq);
	}
	
	@ApiOperation(value = "09报名信息获取")
	@RequestMapping(value = "/team/getApplyInfo", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private GetApplyInfoRes getApplyInfo(@RequestBody GetApplyInfoReq getApplyInfoReq) {
		GetApplyInfoRes getApplyInfoRes = CheckUtils.checkNull(getApplyInfoReq, GetApplyInfoRes.class);
		if (getApplyInfoRes != null) {
			return getApplyInfoRes;
		}
		return teamService.getApplyInfo(getApplyInfoReq);
	}
	
	@ApiOperation(value = "10获取留言列表")
	@RequestMapping(value = "/team/getLeaveMessage", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private GetLeaveMessageRes getLeaveMessage(@RequestBody GetLeaveMessageReq getLeaveMessageReq) {
		GetLeaveMessageRes getLeaveMessageRes = CheckUtils.checkNull(getLeaveMessageReq, GetLeaveMessageRes.class);
		if (getLeaveMessageRes != null) {
			return getLeaveMessageRes;
		}
		return teamService.getLeaveMessage(getLeaveMessageReq);
	}
	
	@ApiOperation(value = "11获取看过的人")
	@RequestMapping(value = "/team/getBrowser", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private GetBrowserRes getBrowser(@RequestBody GetBrowserReq getBrowserReq) {
		GetBrowserRes getBrowserRes = CheckUtils.checkNull(getBrowserReq, GetBrowserRes.class);
		if (getBrowserRes != null) {
			return getBrowserRes;
		}
		return teamService.getBrowser(getBrowserReq);
	}
	
	@ApiOperation(value = "12获取绑定手机号")
	@RequestMapping(value = "/team/getBingdingMobile", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private GetBingdingMobileRes getBingdingMobile(@RequestBody GetBingdingMobileReq getBingdingMobileReq) {
		GetBingdingMobileRes getBingdingMobileRes = CheckUtils.checkNull(getBingdingMobileReq, GetBingdingMobileRes.class);
		if (getBingdingMobileRes != null) {
			return getBingdingMobileRes;
		}
		return teamService.getBingdingMobile(getBingdingMobileReq);
	}
	
	@ApiOperation(value = "13报名车类组队")
	@RequestMapping(value = "/team/carApply", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private CarApplyRes carApply(@RequestBody CarApplyReq carApplyReq) {
		CarApplyRes carApplyRes = CheckUtils.checkNull(carApplyReq, CarApplyRes.class);
		if (carApplyRes != null) {
			return carApplyRes;
		}
		return teamService.carApply(carApplyReq);
	}
	
	@ApiOperation(value = "14报名徒步组队")
	@RequestMapping(value = "/team/footApply", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private FootApplyRes footApply(@RequestBody FootApplyReq footApplyReq) {
		FootApplyRes footApplyRes = CheckUtils.checkNull(footApplyReq, FootApplyRes.class);
		if (footApplyRes != null) {
			return footApplyRes;
		}
		return teamService.footApply(footApplyReq);
	}
	
	// ------------- 实体区 ----------------
	@ApiModel(value="TeamController.GetMyAcitivityListReq")
	public static class GetMyAcitivityListReq{
	
		@ApiModelProperty(required = false, value = "活动类型ID")
		private java.lang.Long activityTypeId;
		
		@ApiModelProperty(required = true, value = "每页显示个数")
		private java.lang.Integer pageSize;
		
		@ApiModelProperty(required = true, value = "页数")
		private java.lang.Integer pageNum;
		
		public java.lang.Long getActivityTypeId() {return activityTypeId;}
		public void setActivityTypeId(java.lang.Long activityTypeId) {this.activityTypeId = activityTypeId;}
		
		public java.lang.Integer getPageSize() {return pageSize;}
		public void setPageSize(java.lang.Integer pageSize) {this.pageSize = pageSize;}
		
		public java.lang.Integer getPageNum() {return pageNum;}
		public void setPageNum(java.lang.Integer pageNum) {this.pageNum = pageNum;}
		
		
	}
	
	@ApiModel(value="TeamController.GetMyAcitivityListRes")
	public static class GetMyAcitivityListRes{
	
		@ApiModelProperty(required = true, value = "返回码，0代表没有错误")
		private java.lang.String code;
		
		@ApiModelProperty(required = true, value = "返回信息")
		private java.lang.String msg;
		
		@ApiModelProperty(required = true, value = "活动封面列表")
		private java.util.List<ActivityCover> activityCoverList;
		
		public java.lang.String getCode() {return code;}
		public void setCode(java.lang.String code) {this.code = code;}
		
		public java.lang.String getMsg() {return msg;}
		public void setMsg(java.lang.String msg) {this.msg = msg;}
		
		public java.util.List<ActivityCover> getActivityCoverList() {return activityCoverList;}
		public void setActivityCoverList(java.util.List<ActivityCover> activityCoverList) {this.activityCoverList = activityCoverList;}
		
		public static class ActivityCover{
			@ApiModelProperty(required = true, value = "活动ID")
			private long id;
			
			@ApiModelProperty(required = true, value = "活动状态，比如：报名中")
			private java.lang.String status;
			
			@ApiModelProperty(required = true, value = "活动封面图片地址")
			private java.lang.String coverPicPath;
			
			@ApiModelProperty(required = true, value = "活动标题")
			private java.lang.String title;
			
			@ApiModelProperty(required = true, value = "活动日期 yyyy-MM-dd")
			private java.lang.String date;
			
			@ApiModelProperty(required = true, value = "领队昵称")
			private java.lang.String leaderNickname;
			
			@ApiModelProperty(required = true, value = "领队头像")
			private java.lang.String leaderHeaderPic;
			
			@ApiModelProperty(required = true, value = "领队认证状态")
			private java.lang.String leaderStatus;
			
			public long getId() {return id;}
			public void setId(long id) {this.id = id;}
			
			public java.lang.String getStatus() {return status;}
			public void setStatus(java.lang.String status) {this.status = status;}
			
			public java.lang.String getCoverPicPath() {return coverPicPath;}
			public void setCoverPicPath(java.lang.String coverPicPath) {this.coverPicPath = coverPicPath;}
			
			public java.lang.String getTitle() {return title;}
			public void setTitle(java.lang.String title) {this.title = title;}
			
			public java.lang.String getDate() {return date;}
			public void setDate(java.lang.String date) {this.date = date;}
			
			public java.lang.String getLeaderNickname() {return leaderNickname;}
			public void setLeaderNickname(java.lang.String leaderNickname) {this.leaderNickname = leaderNickname;}
			
			public java.lang.String getLeaderHeaderPic() {return leaderHeaderPic;}
			public void setLeaderHeaderPic(java.lang.String leaderHeaderPic) {this.leaderHeaderPic = leaderHeaderPic;}
			
			public java.lang.String getLeaderStatus() {return leaderStatus;}
			public void setLeaderStatus(java.lang.String leaderStatus) {this.leaderStatus = leaderStatus;}
			
		}
	}
	
	@ApiModel(value="TeamController.GetAcitivityListReq")
	public static class GetAcitivityListReq{
	
		@ApiModelProperty(required = true, value = "活动类型ID")
		private java.lang.Long activityTypeId;
		
		@ApiModelProperty(required = true, value = "每页显示个数")
		private java.lang.Integer pageSize;
		
		@ApiModelProperty(required = true, value = "页数")
		private java.lang.Integer pageNum;
		
		public java.lang.Long getActivityTypeId() {return activityTypeId;}
		public void setActivityTypeId(java.lang.Long activityTypeId) {this.activityTypeId = activityTypeId;}
		
		public java.lang.Integer getPageSize() {return pageSize;}
		public void setPageSize(java.lang.Integer pageSize) {this.pageSize = pageSize;}
		
		public java.lang.Integer getPageNum() {return pageNum;}
		public void setPageNum(java.lang.Integer pageNum) {this.pageNum = pageNum;}
		
		
	}
	
	@ApiModel(value="TeamController.GetAcitivityListRes")
	public static class GetAcitivityListRes{
	
		@ApiModelProperty(required = true, value = "返回码，0代表没有错误")
		private java.lang.String code;
		
		@ApiModelProperty(required = true, value = "返回信息")
		private java.lang.String msg;
		
		@ApiModelProperty(required = true, value = "活动封面列表")
		private java.util.List<ActivityCover> activityCoverList;
		
		public java.lang.String getCode() {return code;}
		public void setCode(java.lang.String code) {this.code = code;}
		
		public java.lang.String getMsg() {return msg;}
		public void setMsg(java.lang.String msg) {this.msg = msg;}
		
		public java.util.List<ActivityCover> getActivityCoverList() {return activityCoverList;}
		public void setActivityCoverList(java.util.List<ActivityCover> activityCoverList) {this.activityCoverList = activityCoverList;}
		
		public static class ActivityCover{
			@ApiModelProperty(required = true, value = "活动ID")
			private long id;
			
			@ApiModelProperty(required = true, value = "活动状态，比如：报名中")
			private java.lang.String status;
			
			@ApiModelProperty(required = true, value = "活动封面图片地址")
			private java.lang.String coverPicPath;
			
			@ApiModelProperty(required = true, value = "活动标题")
			private java.lang.String title;
			
			@ApiModelProperty(required = true, value = "活动日期 yyyy-MM-dd")
			private java.lang.String date;
			
			@ApiModelProperty(required = true, value = "领队昵称")
			private java.lang.String leaderNickname;
			
			@ApiModelProperty(required = true, value = "领队头像")
			private java.lang.String leaderHeaderPic;
			
			@ApiModelProperty(required = true, value = "领队认证状态")
			private java.lang.String leaderStatus;
			
			public long getId() {return id;}
			public void setId(long id) {this.id = id;}
			
			public java.lang.String getStatus() {return status;}
			public void setStatus(java.lang.String status) {this.status = status;}
			
			public java.lang.String getCoverPicPath() {return coverPicPath;}
			public void setCoverPicPath(java.lang.String coverPicPath) {this.coverPicPath = coverPicPath;}
			
			public java.lang.String getTitle() {return title;}
			public void setTitle(java.lang.String title) {this.title = title;}
			
			public java.lang.String getDate() {return date;}
			public void setDate(java.lang.String date) {this.date = date;}
			
			public java.lang.String getLeaderNickname() {return leaderNickname;}
			public void setLeaderNickname(java.lang.String leaderNickname) {this.leaderNickname = leaderNickname;}
			
			public java.lang.String getLeaderHeaderPic() {return leaderHeaderPic;}
			public void setLeaderHeaderPic(java.lang.String leaderHeaderPic) {this.leaderHeaderPic = leaderHeaderPic;}
			
			public java.lang.String getLeaderStatus() {return leaderStatus;}
			public void setLeaderStatus(java.lang.String leaderStatus) {this.leaderStatus = leaderStatus;}
			
		}
	}
	
	@ApiModel(value="TeamController.ConfigCarTeamReq")
	public static class ConfigCarTeamReq{
	
		@ApiModelProperty(required = true, value = "活动类型Id")
		private java.lang.Long activityTypeId;
		
		@ApiModelProperty(required = false, value = "关联的活动线路Id")
		private java.lang.Long lineId;
		
		@ApiModelProperty(required = true, value = "组队主题")
		private java.lang.String title;
		
		@ApiModelProperty(required = true, value = "活动开始时间")
		private java.lang.String activityStart;
		
		@ApiModelProperty(required = true, value = "活动结束时间")
		private java.lang.String activityEnd;
		
		@ApiModelProperty(required = true, value = "集结时间")
		private java.lang.String gatherTime;
		
		@ApiModelProperty(required = true, value = "集结地点")
		private java.lang.String gatherPoint;
		
		@ApiModelProperty(required = true, value = "联通频段")
		private java.lang.String channel;
		
		@ApiModelProperty(required = true, value = "最大报名车辆数")
		private java.lang.Integer maxCarNo;
		
		@ApiModelProperty(required = true, value = "报名定金，精度分，单位元，比如 1.00 ")
		private java.lang.String frontMoney;
		
		@ApiModelProperty(required = true, value = "报名截止日期")
		private java.lang.String signEnd;
		
		@ApiModelProperty(required = true, value = "车辆要求,选中的")
		private java.util.List<CarCondition> carConditionList;
		
		@ApiModelProperty(required = true, value = "装备要求，选中的")
		private java.util.List<EquipCondition> equipConditionList;
		
		@ApiModelProperty(required = true, value = "备注")
		private java.lang.String remark;
		
		@ApiModelProperty(required = true, value = "行程列表")
		private java.util.List<Schedule> scheduleList;
		
		public java.lang.Long getActivityTypeId() {return activityTypeId;}
		public void setActivityTypeId(java.lang.Long activityTypeId) {this.activityTypeId = activityTypeId;}
		
		public java.lang.Long getLineId() {return lineId;}
		public void setLineId(java.lang.Long lineId) {this.lineId = lineId;}
		
		public java.lang.String getTitle() {return title;}
		public void setTitle(java.lang.String title) {this.title = title;}
		
		public java.lang.String getActivityStart() {return activityStart;}
		public void setActivityStart(java.lang.String activityStart) {this.activityStart = activityStart;}
		
		public java.lang.String getActivityEnd() {return activityEnd;}
		public void setActivityEnd(java.lang.String activityEnd) {this.activityEnd = activityEnd;}
		
		public java.lang.String getGatherTime() {return gatherTime;}
		public void setGatherTime(java.lang.String gatherTime) {this.gatherTime = gatherTime;}
		
		public java.lang.String getGatherPoint() {return gatherPoint;}
		public void setGatherPoint(java.lang.String gatherPoint) {this.gatherPoint = gatherPoint;}
		
		public java.lang.String getChannel() {return channel;}
		public void setChannel(java.lang.String channel) {this.channel = channel;}
		
		public java.lang.Integer getMaxCarNo() {return maxCarNo;}
		public void setMaxCarNo(java.lang.Integer maxCarNo) {this.maxCarNo = maxCarNo;}
		
		public java.lang.String getFrontMoney() {return frontMoney;}
		public void setFrontMoney(java.lang.String frontMoney) {this.frontMoney = frontMoney;}
		
		public java.lang.String getSignEnd() {return signEnd;}
		public void setSignEnd(java.lang.String signEnd) {this.signEnd = signEnd;}
		
		public java.util.List<CarCondition> getCarConditionList() {return carConditionList;}
		public void setCarConditionList(java.util.List<CarCondition> carConditionList) {this.carConditionList = carConditionList;}
		
		public java.util.List<EquipCondition> getEquipConditionList() {return equipConditionList;}
		public void setEquipConditionList(java.util.List<EquipCondition> equipConditionList) {this.equipConditionList = equipConditionList;}
		
		public java.lang.String getRemark() {return remark;}
		public void setRemark(java.lang.String remark) {this.remark = remark;}
		
		public java.util.List<Schedule> getScheduleList() {return scheduleList;}
		public void setScheduleList(java.util.List<Schedule> scheduleList) {this.scheduleList = scheduleList;}
		
		public static class CarCondition{
			@ApiModelProperty(required = true, value = "车辆ID")
			private java.lang.Long id;
			
			public java.lang.Long getId() {return id;}
			public void setId(java.lang.Long id) {this.id = id;}
			
		}
		public static class EquipCondition{
			@ApiModelProperty(required = true, value = "装备ID")
			private java.lang.Long id;
			
			public java.lang.Long getId() {return id;}
			public void setId(java.lang.Long id) {this.id = id;}
			
		}
		public static class Schedule{
			@ApiModelProperty(required = true, value = "第几天")
			private java.lang.Integer day;
			
			@ApiModelProperty(required = true, value = "地图定位参数 json 字符串")
			private java.lang.String destination;
			
			@ApiModelProperty(required = true, value = "行程描述")
			private java.lang.String desc;
			
			public java.lang.Integer getDay() {return day;}
			public void setDay(java.lang.Integer day) {this.day = day;}
			
			public java.lang.String getDestination() {return destination;}
			public void setDestination(java.lang.String destination) {this.destination = destination;}
			
			public java.lang.String getDesc() {return desc;}
			public void setDesc(java.lang.String desc) {this.desc = desc;}
			
		}
		
	}
	
	@ApiModel(value="TeamController.ConfigCarTeamRes")
	public static class ConfigCarTeamRes{
	
		@ApiModelProperty(required = true, value = "返回码，0代表没有错误")
		private java.lang.String code;
		
		@ApiModelProperty(required = true, value = "返回信息")
		private java.lang.String msg;
		
		public java.lang.String getCode() {return code;}
		public void setCode(java.lang.String code) {this.code = code;}
		
		public java.lang.String getMsg() {return msg;}
		public void setMsg(java.lang.String msg) {this.msg = msg;}
		
	}
	
	@ApiModel(value="TeamController.GetCarActivityBaseReq")
	public static class GetCarActivityBaseReq{
	
		@ApiModelProperty(required = true, value = "活动ID")
		private java.lang.Long activityId;
		
		public java.lang.Long getActivityId() {return activityId;}
		public void setActivityId(java.lang.Long activityId) {this.activityId = activityId;}
		
		
	}
	
	@ApiModel(value="TeamController.GetCarActivityBaseRes")
	public static class GetCarActivityBaseRes{
	
		@ApiModelProperty(required = true, value = "活动类型，单选，只能是驾车的")
		private java.util.List<ActivityType> activityTypeList;
		
		@ApiModelProperty(required = true, value = "组队主题")
		private java.lang.String title;
		
		@ApiModelProperty(required = true, value = "活动开始时间")
		private java.lang.String activityStart;
		
		@ApiModelProperty(required = true, value = "活动结束时间")
		private java.lang.String activityEnd;
		
		@ApiModelProperty(required = true, value = "联通频段")
		private java.lang.String channel;
		
		@ApiModelProperty(required = true, value = "集结时间")
		private java.lang.String gatherTime;
		
		@ApiModelProperty(required = true, value = "集结地点")
		private java.lang.String gatherPoint;
		
		@ApiModelProperty(required = true, value = "最大报名车辆数")
		private java.lang.String maxCarNo;
		
		@ApiModelProperty(required = true, value = "报名定金")
		private java.lang.String frontMoney;
		
		@ApiModelProperty(required = true, value = "报名截止日期")
		private java.lang.String signEnd;
		
		@ApiModelProperty(required = true, value = "车辆要求")
		private java.util.List<CarCondition> carConditionList;
		
		@ApiModelProperty(required = true, value = "装备要求")
		private java.util.List<EquipCondition> equipConditionList;
		
		@ApiModelProperty(required = true, value = "备注")
		private java.lang.String remark;
		
		@ApiModelProperty(required = true, value = "行程列表")
		private java.util.List<Schedule> scheduleList;
		
		public java.util.List<ActivityType> getActivityTypeList() {return activityTypeList;}
		public void setActivityTypeList(java.util.List<ActivityType> activityTypeList) {this.activityTypeList = activityTypeList;}
		
		public java.lang.String getTitle() {return title;}
		public void setTitle(java.lang.String title) {this.title = title;}
		
		public java.lang.String getActivityStart() {return activityStart;}
		public void setActivityStart(java.lang.String activityStart) {this.activityStart = activityStart;}
		
		public java.lang.String getActivityEnd() {return activityEnd;}
		public void setActivityEnd(java.lang.String activityEnd) {this.activityEnd = activityEnd;}
		
		public java.lang.String getChannel() {return channel;}
		public void setChannel(java.lang.String channel) {this.channel = channel;}
		
		public java.lang.String getGatherTime() {return gatherTime;}
		public void setGatherTime(java.lang.String gatherTime) {this.gatherTime = gatherTime;}
		
		public java.lang.String getGatherPoint() {return gatherPoint;}
		public void setGatherPoint(java.lang.String gatherPoint) {this.gatherPoint = gatherPoint;}
		
		public java.lang.String getMaxCarNo() {return maxCarNo;}
		public void setMaxCarNo(java.lang.String maxCarNo) {this.maxCarNo = maxCarNo;}
		
		public java.lang.String getFrontMoney() {return frontMoney;}
		public void setFrontMoney(java.lang.String frontMoney) {this.frontMoney = frontMoney;}
		
		public java.lang.String getSignEnd() {return signEnd;}
		public void setSignEnd(java.lang.String signEnd) {this.signEnd = signEnd;}
		
		public java.util.List<CarCondition> getCarConditionList() {return carConditionList;}
		public void setCarConditionList(java.util.List<CarCondition> carConditionList) {this.carConditionList = carConditionList;}
		
		public java.util.List<EquipCondition> getEquipConditionList() {return equipConditionList;}
		public void setEquipConditionList(java.util.List<EquipCondition> equipConditionList) {this.equipConditionList = equipConditionList;}
		
		public java.lang.String getRemark() {return remark;}
		public void setRemark(java.lang.String remark) {this.remark = remark;}
		
		public java.util.List<Schedule> getScheduleList() {return scheduleList;}
		public void setScheduleList(java.util.List<Schedule> scheduleList) {this.scheduleList = scheduleList;}
		
		public static class ActivityType{
			@ApiModelProperty(required = true, value = "活动类型ID")
			private java.lang.Long id;
			
			@ApiModelProperty(required = true, value = "活动类型")
			private java.lang.String activityTypeName;
			
			@ApiModelProperty(required = true, value = "0未选中，1已选中")
			private java.lang.String checked;
			
			public java.lang.Long getId() {return id;}
			public void setId(java.lang.Long id) {this.id = id;}
			
			public java.lang.String getActivityTypeName() {return activityTypeName;}
			public void setActivityTypeName(java.lang.String activityTypeName) {this.activityTypeName = activityTypeName;}
			
			public java.lang.String getChecked() {return checked;}
			public void setChecked(java.lang.String checked) {this.checked = checked;}
			
		}
		public static class CarCondition{
			@ApiModelProperty(required = true, value = "车辆ID")
			private java.lang.Long id;
			
			@ApiModelProperty(required = true, value = "车辆名")
			private java.lang.String car;
			
			@ApiModelProperty(required = true, value = "0未选中，1已选中")
			private java.lang.String checked;
			
			public java.lang.Long getId() {return id;}
			public void setId(java.lang.Long id) {this.id = id;}
			
			public java.lang.String getCar() {return car;}
			public void setCar(java.lang.String car) {this.car = car;}
			
			public java.lang.String getChecked() {return checked;}
			public void setChecked(java.lang.String checked) {this.checked = checked;}
			
		}
		public static class EquipCondition{
			@ApiModelProperty(required = true, value = "装备ID")
			private java.lang.Long id;
			
			@ApiModelProperty(required = true, value = "装备名")
			private java.lang.String equip;
			
			@ApiModelProperty(required = true, value = "0未选中，1已选中")
			private java.lang.String checked;
			
			public java.lang.Long getId() {return id;}
			public void setId(java.lang.Long id) {this.id = id;}
			
			public java.lang.String getEquip() {return equip;}
			public void setEquip(java.lang.String equip) {this.equip = equip;}
			
			public java.lang.String getChecked() {return checked;}
			public void setChecked(java.lang.String checked) {this.checked = checked;}
			
		}
		public static class Schedule{
			@ApiModelProperty(required = true, value = "第几天")
			private java.lang.Integer day;
			
			@ApiModelProperty(required = true, value = "地图定位参数 json 字符串")
			private java.lang.String destination;
			
			@ApiModelProperty(required = true, value = "行程描述")
			private java.lang.String desc;
			
			public java.lang.Integer getDay() {return day;}
			public void setDay(java.lang.Integer day) {this.day = day;}
			
			public java.lang.String getDestination() {return destination;}
			public void setDestination(java.lang.String destination) {this.destination = destination;}
			
			public java.lang.String getDesc() {return desc;}
			public void setDesc(java.lang.String desc) {this.desc = desc;}
			
		}
	}
	
	@ApiModel(value="TeamController.ConfigFootTeamReq")
	public static class ConfigFootTeamReq{
	
		@ApiModelProperty(required = true, value = "活动类型Id")
		private java.lang.Long activityTypeId;
		
		@ApiModelProperty(required = false, value = "关联的活动线路Id")
		private java.lang.Long lineId;
		
		@ApiModelProperty(required = true, value = "组队主题")
		private java.lang.String title;
		
		@ApiModelProperty(required = true, value = "活动开始时间")
		private java.lang.String activityStart;
		
		@ApiModelProperty(required = true, value = "活动结束时间")
		private java.lang.String activityEnd;
		
		@ApiModelProperty(required = true, value = "集结时间")
		private java.lang.String gatherTime;
		
		@ApiModelProperty(required = true, value = "集结地点")
		private java.lang.String gatherPoint;
		
		@ApiModelProperty(required = true, value = "最大报名人数")
		private java.lang.String maxPeopleNo;
		
		@ApiModelProperty(required = true, value = "报名定金，精度分，单位元，比如 1.00")
		private java.lang.String frontMoney;
		
		@ApiModelProperty(required = true, value = "报名截止日期")
		private java.lang.String signEnd;
		
		@ApiModelProperty(required = true, value = "体力要求")
		private java.lang.String powerCondition;
		
		@ApiModelProperty(required = true, value = "装备要求，选中的列表")
		private java.util.List<EquipCondition> equipConditionList;
		
		@ApiModelProperty(required = true, value = "备注")
		private java.lang.String remark;
		
		@ApiModelProperty(required = true, value = "行程列表")
		private java.util.List<Schedule> scheduleList;
		
		public java.lang.Long getActivityTypeId() {return activityTypeId;}
		public void setActivityTypeId(java.lang.Long activityTypeId) {this.activityTypeId = activityTypeId;}
		
		public java.lang.Long getLineId() {return lineId;}
		public void setLineId(java.lang.Long lineId) {this.lineId = lineId;}
		
		public java.lang.String getTitle() {return title;}
		public void setTitle(java.lang.String title) {this.title = title;}
		
		public java.lang.String getActivityStart() {return activityStart;}
		public void setActivityStart(java.lang.String activityStart) {this.activityStart = activityStart;}
		
		public java.lang.String getActivityEnd() {return activityEnd;}
		public void setActivityEnd(java.lang.String activityEnd) {this.activityEnd = activityEnd;}
		
		public java.lang.String getGatherTime() {return gatherTime;}
		public void setGatherTime(java.lang.String gatherTime) {this.gatherTime = gatherTime;}
		
		public java.lang.String getGatherPoint() {return gatherPoint;}
		public void setGatherPoint(java.lang.String gatherPoint) {this.gatherPoint = gatherPoint;}
		
		public java.lang.String getMaxPeopleNo() {return maxPeopleNo;}
		public void setMaxPeopleNo(java.lang.String maxPeopleNo) {this.maxPeopleNo = maxPeopleNo;}
		
		public java.lang.String getFrontMoney() {return frontMoney;}
		public void setFrontMoney(java.lang.String frontMoney) {this.frontMoney = frontMoney;}
		
		public java.lang.String getSignEnd() {return signEnd;}
		public void setSignEnd(java.lang.String signEnd) {this.signEnd = signEnd;}
		
		public java.lang.String getPowerCondition() {return powerCondition;}
		public void setPowerCondition(java.lang.String powerCondition) {this.powerCondition = powerCondition;}
		
		public java.util.List<EquipCondition> getEquipConditionList() {return equipConditionList;}
		public void setEquipConditionList(java.util.List<EquipCondition> equipConditionList) {this.equipConditionList = equipConditionList;}
		
		public java.lang.String getRemark() {return remark;}
		public void setRemark(java.lang.String remark) {this.remark = remark;}
		
		public java.util.List<Schedule> getScheduleList() {return scheduleList;}
		public void setScheduleList(java.util.List<Schedule> scheduleList) {this.scheduleList = scheduleList;}
		
		public static class EquipCondition{
			@ApiModelProperty(required = true, value = "装备ID")
			private java.lang.Long id;
			
			public java.lang.Long getId() {return id;}
			public void setId(java.lang.Long id) {this.id = id;}
			
		}
		public static class Schedule{
			@ApiModelProperty(required = true, value = "第几天")
			private java.lang.Integer day;
			
			@ApiModelProperty(required = true, value = "地图定位参数 json 字符串")
			private java.lang.String destination;
			
			@ApiModelProperty(required = true, value = "行程描述")
			private java.lang.String desc;
			
			public java.lang.Integer getDay() {return day;}
			public void setDay(java.lang.Integer day) {this.day = day;}
			
			public java.lang.String getDestination() {return destination;}
			public void setDestination(java.lang.String destination) {this.destination = destination;}
			
			public java.lang.String getDesc() {return desc;}
			public void setDesc(java.lang.String desc) {this.desc = desc;}
			
		}
		
	}
	
	@ApiModel(value="TeamController.ConfigFootTeamRes")
	public static class ConfigFootTeamRes{
	
		@ApiModelProperty(required = true, value = "返回码，0代表没有错误")
		private java.lang.String code;
		
		@ApiModelProperty(required = true, value = "返回信息")
		private java.lang.String msg;
		
		public java.lang.String getCode() {return code;}
		public void setCode(java.lang.String code) {this.code = code;}
		
		public java.lang.String getMsg() {return msg;}
		public void setMsg(java.lang.String msg) {this.msg = msg;}
		
	}
	
	@ApiModel(value="TeamController.GetFootBaseReq")
	public static class GetFootBaseReq{
	
		@ApiModelProperty(required = true, value = "活动ID")
		private java.lang.Long activityId;
		
		public java.lang.Long getActivityId() {return activityId;}
		public void setActivityId(java.lang.Long activityId) {this.activityId = activityId;}
		
		
	}
	
	@ApiModel(value="TeamController.GetFootBaseRes")
	public static class GetFootBaseRes{
	
		@ApiModelProperty(required = true, value = "活动类型，单选，只能是徒步的")
		private java.util.List<ActivityType> activityTypeList;
		
		@ApiModelProperty(required = true, value = "组队主题")
		private java.lang.String title;
		
		@ApiModelProperty(required = true, value = "活动开始时间")
		private java.lang.String activityStart;
		
		@ApiModelProperty(required = true, value = "活动结束时间")
		private java.lang.String activityEnd;
		
		@ApiModelProperty(required = true, value = "集结时间")
		private java.lang.String gatherTime;
		
		@ApiModelProperty(required = true, value = "集结地点")
		private java.lang.String gatherPoint;
		
		@ApiModelProperty(required = true, value = "最大报名人数")
		private java.lang.String maxPeopleNo;
		
		@ApiModelProperty(required = true, value = "报名定金，精度分，单位元，比如 1.00")
		private java.lang.String frontMoney;
		
		@ApiModelProperty(required = true, value = "报名截止日期")
		private java.lang.String signEnd;
		
		@ApiModelProperty(required = true, value = "体力要求")
		private java.lang.String powerCondition;
		
		@ApiModelProperty(required = true, value = "装备要求")
		private java.util.List<EquipCondition> equipConditionList;
		
		@ApiModelProperty(required = true, value = "备注")
		private java.lang.String remark;
		
		@ApiModelProperty(required = true, value = "行程列表")
		private java.util.List<Schedule> scheduleList;
		
		public java.util.List<ActivityType> getActivityTypeList() {return activityTypeList;}
		public void setActivityTypeList(java.util.List<ActivityType> activityTypeList) {this.activityTypeList = activityTypeList;}
		
		public java.lang.String getTitle() {return title;}
		public void setTitle(java.lang.String title) {this.title = title;}
		
		public java.lang.String getActivityStart() {return activityStart;}
		public void setActivityStart(java.lang.String activityStart) {this.activityStart = activityStart;}
		
		public java.lang.String getActivityEnd() {return activityEnd;}
		public void setActivityEnd(java.lang.String activityEnd) {this.activityEnd = activityEnd;}
		
		public java.lang.String getGatherTime() {return gatherTime;}
		public void setGatherTime(java.lang.String gatherTime) {this.gatherTime = gatherTime;}
		
		public java.lang.String getGatherPoint() {return gatherPoint;}
		public void setGatherPoint(java.lang.String gatherPoint) {this.gatherPoint = gatherPoint;}
		
		public java.lang.String getMaxPeopleNo() {return maxPeopleNo;}
		public void setMaxPeopleNo(java.lang.String maxPeopleNo) {this.maxPeopleNo = maxPeopleNo;}
		
		public java.lang.String getFrontMoney() {return frontMoney;}
		public void setFrontMoney(java.lang.String frontMoney) {this.frontMoney = frontMoney;}
		
		public java.lang.String getSignEnd() {return signEnd;}
		public void setSignEnd(java.lang.String signEnd) {this.signEnd = signEnd;}
		
		public java.lang.String getPowerCondition() {return powerCondition;}
		public void setPowerCondition(java.lang.String powerCondition) {this.powerCondition = powerCondition;}
		
		public java.util.List<EquipCondition> getEquipConditionList() {return equipConditionList;}
		public void setEquipConditionList(java.util.List<EquipCondition> equipConditionList) {this.equipConditionList = equipConditionList;}
		
		public java.lang.String getRemark() {return remark;}
		public void setRemark(java.lang.String remark) {this.remark = remark;}
		
		public java.util.List<Schedule> getScheduleList() {return scheduleList;}
		public void setScheduleList(java.util.List<Schedule> scheduleList) {this.scheduleList = scheduleList;}
		
		public static class ActivityType{
			@ApiModelProperty(required = true, value = "活动类型ID")
			private java.lang.Long id;
			
			@ApiModelProperty(required = true, value = "活动类型")
			private java.lang.String activityTypeName;
			
			@ApiModelProperty(required = true, value = "0未选中，1是选中")
			private java.lang.String checked;
			
			public java.lang.Long getId() {return id;}
			public void setId(java.lang.Long id) {this.id = id;}
			
			public java.lang.String getActivityTypeName() {return activityTypeName;}
			public void setActivityTypeName(java.lang.String activityTypeName) {this.activityTypeName = activityTypeName;}
			
			public java.lang.String getChecked() {return checked;}
			public void setChecked(java.lang.String checked) {this.checked = checked;}
			
		}
		public static class EquipCondition{
			@ApiModelProperty(required = true, value = "装备ID")
			private java.lang.Long id;
			
			@ApiModelProperty(required = true, value = "装备名")
			private java.lang.String equip;
			
			@ApiModelProperty(required = true, value = "0未选中，1是选中")
			private java.lang.String checked;
			
			public java.lang.Long getId() {return id;}
			public void setId(java.lang.Long id) {this.id = id;}
			
			public java.lang.String getEquip() {return equip;}
			public void setEquip(java.lang.String equip) {this.equip = equip;}
			
			public java.lang.String getChecked() {return checked;}
			public void setChecked(java.lang.String checked) {this.checked = checked;}
			
		}
		public static class Schedule{
			@ApiModelProperty(required = true, value = "第几天")
			private java.lang.Integer day;
			
			@ApiModelProperty(required = true, value = "地图定位参数 json 字符串")
			private java.lang.String destination;
			
			@ApiModelProperty(required = true, value = "行程描述")
			private java.lang.String desc;
			
			public java.lang.Integer getDay() {return day;}
			public void setDay(java.lang.Integer day) {this.day = day;}
			
			public java.lang.String getDestination() {return destination;}
			public void setDestination(java.lang.String destination) {this.destination = destination;}
			
			public java.lang.String getDesc() {return desc;}
			public void setDesc(java.lang.String desc) {this.desc = desc;}
			
		}
	}
	
	@ApiModel(value="TeamController.BingdingMobileReq")
	public static class BingdingMobileReq{
	
		@ApiModelProperty(required = true, value = "包括敏感数据在内的完整用户信息的加密数据，详细见加密数据解密算法")
		private java.lang.String encryptedData;
		
		@ApiModelProperty(required = true, value = "加密算法的初始向量，详细见加密数据解密算法")
		private java.lang.String iv;
		
		public java.lang.String getEncryptedData() {return encryptedData;}
		public void setEncryptedData(java.lang.String encryptedData) {this.encryptedData = encryptedData;}
		
		public java.lang.String getIv() {return iv;}
		public void setIv(java.lang.String iv) {this.iv = iv;}
		
		
	}
	
	@ApiModel(value="TeamController.BingdingMobileRes")
	public static class BingdingMobileRes{
	
		@ApiModelProperty(required = true, value = "返回码，0代表没有错误")
		private java.lang.String code;
		
		@ApiModelProperty(required = true, value = "返回信息")
		private java.lang.String msg;
		
		@ApiModelProperty(required = true, value = "解密获取的手机号")
		private java.lang.String mobile;
		
		public java.lang.String getCode() {return code;}
		public void setCode(java.lang.String code) {this.code = code;}
		
		public java.lang.String getMsg() {return msg;}
		public void setMsg(java.lang.String msg) {this.msg = msg;}
		
		public java.lang.String getMobile() {return mobile;}
		public void setMobile(java.lang.String mobile) {this.mobile = mobile;}
		
	}
	
	@ApiModel(value="TeamController.GetApplyInfoReq")
	public static class GetApplyInfoReq{
	
		@ApiModelProperty(required = true, value = "活动ID")
		private java.lang.Long activityId;
		
		public java.lang.Long getActivityId() {return activityId;}
		public void setActivityId(java.lang.Long activityId) {this.activityId = activityId;}
		
		
	}
	
	@ApiModel(value="TeamController.GetApplyInfoRes")
	public static class GetApplyInfoRes{
	
		@ApiModelProperty(required = true, value = "已报名人数")
		private java.lang.Integer signedNo;
		
		@ApiModelProperty(required = true, value = "最大报名人数")
		private java.lang.Integer signMaxNo;
		
		@ApiModelProperty(required = true, value = "已报名列表")
		private java.util.List<Signed> signedList;
		
		public java.lang.Integer getSignedNo() {return signedNo;}
		public void setSignedNo(java.lang.Integer signedNo) {this.signedNo = signedNo;}
		
		public java.lang.Integer getSignMaxNo() {return signMaxNo;}
		public void setSignMaxNo(java.lang.Integer signMaxNo) {this.signMaxNo = signMaxNo;}
		
		public java.util.List<Signed> getSignedList() {return signedList;}
		public void setSignedList(java.util.List<Signed> signedList) {this.signedList = signedList;}
		
		public static class Signed{
			@ApiModelProperty(required = true, value = "昵称")
			private java.lang.String nickname;
			
			@ApiModelProperty(required = true, value = "微信头像")
			private java.lang.String headerPic;
			
			public java.lang.String getNickname() {return nickname;}
			public void setNickname(java.lang.String nickname) {this.nickname = nickname;}
			
			public java.lang.String getHeaderPic() {return headerPic;}
			public void setHeaderPic(java.lang.String headerPic) {this.headerPic = headerPic;}
			
		}
	}
	
	@ApiModel(value="TeamController.GetLeaveMessageReq")
	public static class GetLeaveMessageReq{
	
		@ApiModelProperty(required = true, value = "活动ID")
		private java.lang.Long activityId;
		
		public java.lang.Long getActivityId() {return activityId;}
		public void setActivityId(java.lang.Long activityId) {this.activityId = activityId;}
		
		
	}
	
	@ApiModel(value="TeamController.GetLeaveMessageRes")
	public static class GetLeaveMessageRes{
	
		@ApiModelProperty(required = true, value = "留言列表")
		private java.util.List<Msg> msgList;
		
		public java.util.List<Msg> getMsgList() {return msgList;}
		public void setMsgList(java.util.List<Msg> msgList) {this.msgList = msgList;}
		
		public static class Msg{
			@ApiModelProperty(required = true, value = "活动ID")
			private java.lang.Long activityId;
			
			@ApiModelProperty(required = true, value = "留言人昵称")
			private java.lang.String leftnickname;
			
			@ApiModelProperty(required = false, value = "回复哪个评论")
			private java.lang.Long talkId;
			
			@ApiModelProperty(required = true, value = "被留言人昵称")
			private java.lang.String beleftnickname;
			
			@ApiModelProperty(required = false, value = "文本评论")
			private java.lang.String content;
			
			@ApiModelProperty(required = false, value = "图片评论")
			private java.lang.String pic;
			
			@ApiModelProperty(required = true, value = "留言时间 yyyy-MM-dd HH:mm")
			private java.lang.String date;
			
			public java.lang.Long getActivityId() {return activityId;}
			public void setActivityId(java.lang.Long activityId) {this.activityId = activityId;}
			
			public java.lang.String getLeftnickname() {return leftnickname;}
			public void setLeftnickname(java.lang.String leftnickname) {this.leftnickname = leftnickname;}
			
			public java.lang.Long getTalkId() {return talkId;}
			public void setTalkId(java.lang.Long talkId) {this.talkId = talkId;}
			
			public java.lang.String getBeleftnickname() {return beleftnickname;}
			public void setBeleftnickname(java.lang.String beleftnickname) {this.beleftnickname = beleftnickname;}
			
			public java.lang.String getContent() {return content;}
			public void setContent(java.lang.String content) {this.content = content;}
			
			public java.lang.String getPic() {return pic;}
			public void setPic(java.lang.String pic) {this.pic = pic;}
			
			public java.lang.String getDate() {return date;}
			public void setDate(java.lang.String date) {this.date = date;}
			
		}
	}
	
	@ApiModel(value="TeamController.GetBrowserReq")
	public static class GetBrowserReq{
	
		@ApiModelProperty(required = true, value = "活动ID")
		private java.lang.Long activityId;
		
		public java.lang.Long getActivityId() {return activityId;}
		public void setActivityId(java.lang.Long activityId) {this.activityId = activityId;}
		
		
	}
	
	@ApiModel(value="TeamController.GetBrowserRes")
	public static class GetBrowserRes{
	
		@ApiModelProperty(required = true, value = "看过的人")
		private java.util.List<Seen> seenList;
		
		public java.util.List<Seen> getSeenList() {return seenList;}
		public void setSeenList(java.util.List<Seen> seenList) {this.seenList = seenList;}
		
		public static class Seen{
			@ApiModelProperty(required = true, value = "昵称")
			private java.lang.String nickname;
			
			@ApiModelProperty(required = true, value = "微信头像")
			private java.lang.String headerPic;
			
			public java.lang.String getNickname() {return nickname;}
			public void setNickname(java.lang.String nickname) {this.nickname = nickname;}
			
			public java.lang.String getHeaderPic() {return headerPic;}
			public void setHeaderPic(java.lang.String headerPic) {this.headerPic = headerPic;}
			
		}
	}
	
	@ApiModel(value="TeamController.GetBingdingMobileReq")
	public static class GetBingdingMobileReq{
	
		
	}
	
	@ApiModel(value="TeamController.GetBingdingMobileRes")
	public static class GetBingdingMobileRes{
	
		@ApiModelProperty(required = true, value = "返回码，0代表没有错误")
		private java.lang.String code;
		
		@ApiModelProperty(required = true, value = "返回信息")
		private java.lang.String msg;
		
		@ApiModelProperty(required = true, value = "认证的手机号，为空时用户未认证，显示绑定手机号按钮")
		private java.lang.String mobile;
		
		public java.lang.String getCode() {return code;}
		public void setCode(java.lang.String code) {this.code = code;}
		
		public java.lang.String getMsg() {return msg;}
		public void setMsg(java.lang.String msg) {this.msg = msg;}
		
		public java.lang.String getMobile() {return mobile;}
		public void setMobile(java.lang.String mobile) {this.mobile = mobile;}
		
	}
	
	@ApiModel(value="TeamController.CarApplyReq")
	public static class CarApplyReq{
	
		@ApiModelProperty(required = true, value = "参与的活动ID")
		private java.lang.Long activityId;
		
		@ApiModelProperty(required = true, value = "填入报名车型")
		private java.lang.String carType;
		
		@ApiModelProperty(required = false, value = "附言")
		private java.lang.String remark;
		
		public java.lang.Long getActivityId() {return activityId;}
		public void setActivityId(java.lang.Long activityId) {this.activityId = activityId;}
		
		public java.lang.String getCarType() {return carType;}
		public void setCarType(java.lang.String carType) {this.carType = carType;}
		
		public java.lang.String getRemark() {return remark;}
		public void setRemark(java.lang.String remark) {this.remark = remark;}
		
		
	}
	
	@ApiModel(value="TeamController.CarApplyRes")
	public static class CarApplyRes{
	
		@ApiModelProperty(required = true, value = "返回码，0代表没有错误")
		private java.lang.String code;
		
		@ApiModelProperty(required = true, value = "返回信息")
		private java.lang.String msg;
		
		public java.lang.String getCode() {return code;}
		public void setCode(java.lang.String code) {this.code = code;}
		
		public java.lang.String getMsg() {return msg;}
		public void setMsg(java.lang.String msg) {this.msg = msg;}
		
	}
	
	@ApiModel(value="TeamController.FootApplyReq")
	public static class FootApplyReq{
	
		@ApiModelProperty(required = true, value = "参与的活动ID")
		private java.lang.Long activityId;
		
		@ApiModelProperty(required = true, value = "填入真实姓名")
		private java.lang.String trueName;
		
		@ApiModelProperty(required = false, value = "附言")
		private java.lang.String remark;
		
		public java.lang.Long getActivityId() {return activityId;}
		public void setActivityId(java.lang.Long activityId) {this.activityId = activityId;}
		
		public java.lang.String getTrueName() {return trueName;}
		public void setTrueName(java.lang.String trueName) {this.trueName = trueName;}
		
		public java.lang.String getRemark() {return remark;}
		public void setRemark(java.lang.String remark) {this.remark = remark;}
		
		
	}
	
	@ApiModel(value="TeamController.FootApplyRes")
	public static class FootApplyRes{
	
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
