package com.jxyd.nole.web.wx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jxyd.nole.bas.util.CheckUtils;
import com.jxyd.nole.web.wx.service.ActivityService;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

/** 
 * 说明：02活动
 * 创建人：zxg
 * 创建时间：2018-05-27
 */
@RestController
public class ActivityController {

	@Autowired
	private ActivityService activityService;
	
	// ------------- 方法区 ----------------
	@ApiOperation(value = "01获取路线封面")
	@RequestMapping(value = "/activity/getLineCovers", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private GetLineCoversRes getLineCovers(@RequestBody GetLineCoversReq getLineCoversReq) {
		GetLineCoversRes getLineCoversRes = CheckUtils.checkNull(getLineCoversReq, GetLineCoversRes.class);
		if (getLineCoversRes != null) {
			return getLineCoversRes;
		}
		return activityService.getLineCovers(getLineCoversReq);
	}
	
	@ApiOperation(value = "02获取路线详细")
	@RequestMapping(value = "/activity/getLineDetail", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private GetLineDetailRes getLineDetail(@RequestBody GetLineDetailReq getLineDetailReq) {
		GetLineDetailRes getLineDetailRes = CheckUtils.checkNull(getLineDetailReq, GetLineDetailRes.class);
		if (getLineDetailRes != null) {
			return getLineDetailRes;
		}
		return activityService.getLineDetail(getLineDetailReq);
	}
	
	@ApiOperation(value = "03获取路线组队列表")
	@RequestMapping(value = "/activity/getLineAcitivityList", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private GetLineAcitivityListRes getLineAcitivityList(@RequestBody GetLineAcitivityListReq getLineAcitivityListReq) {
		GetLineAcitivityListRes getLineAcitivityListRes = CheckUtils.checkNull(getLineAcitivityListReq, GetLineAcitivityListRes.class);
		if (getLineAcitivityListRes != null) {
			return getLineAcitivityListRes;
		}
		return activityService.getLineAcitivityList(getLineAcitivityListReq);
	}
	
	@ApiOperation(value = "04点击想去")
	@RequestMapping(value = "/activity/clickWantGo", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private ClickWantGoRes clickWantGo(@RequestBody ClickWantGoReq clickWantGoReq) {
		ClickWantGoRes clickWantGoRes = CheckUtils.checkNull(clickWantGoReq, ClickWantGoRes.class);
		if (clickWantGoRes != null) {
			return clickWantGoRes;
		}
		return activityService.clickWantGo(clickWantGoReq);
	}
	
	// ------------- 实体区 ----------------
	@ApiModel(value="ActivityController.GetLineCoversReq")
	public static class GetLineCoversReq{
	
		@ApiModelProperty(required = true, value = "活动类型")
		private java.lang.Long lineType;
		
		@ApiModelProperty(required = true, value = "每页显示个数")
		private java.lang.Integer pageSize;
		
		@ApiModelProperty(required = true, value = "页数")
		private java.lang.Integer pageNum;
		
		public java.lang.Long getLineType() {return lineType;}
		public void setLineType(java.lang.Long lineType) {this.lineType = lineType;}
		
		public java.lang.Integer getPageSize() {return pageSize;}
		public void setPageSize(java.lang.Integer pageSize) {this.pageSize = pageSize;}
		
		public java.lang.Integer getPageNum() {return pageNum;}
		public void setPageNum(java.lang.Integer pageNum) {this.pageNum = pageNum;}
		
		
	}
	
	@ApiModel(value="ActivityController.GetLineCoversRes")
	public static class GetLineCoversRes{
	
		@ApiModelProperty(required = true, value = "返回码，0代表没有错误")
		private java.lang.String code;
		
		@ApiModelProperty(required = true, value = "返回信息")
		private java.lang.String msg;
		
		@ApiModelProperty(required = true, value = "线路封面列表")
		private java.util.List<Line> lineList;
		
		public java.lang.String getCode() {return code;}
		public void setCode(java.lang.String code) {this.code = code;}
		
		public java.lang.String getMsg() {return msg;}
		public void setMsg(java.lang.String msg) {this.msg = msg;}
		
		public java.util.List<Line> getLineList() {return lineList;}
		public void setLineList(java.util.List<Line> lineList) {this.lineList = lineList;}
		
		public static class Line{
			@ApiModelProperty(required = true, value = "线路ID")
			private java.lang.Long id;
			
			@ApiModelProperty(required = true, value = "线路标题 ")
			private java.lang.String title;
			
			@ApiModelProperty(required = true, value = "线路封面图片地址 ")
			private java.lang.String coverPicPath;
			
			@ApiModelProperty(required = true, value = "看过人数 ")
			private java.lang.Integer eyeNo;
			
			@ApiModelProperty(required = true, value = "热门,普通 ")
			private java.lang.String type;
			
			@ApiModelProperty(required = true, value = "位置信息 ")
			private java.lang.String location;
			
			public java.lang.Long getId() {return id;}
			public void setId(java.lang.Long id) {this.id = id;}
			
			public java.lang.String getTitle() {return title;}
			public void setTitle(java.lang.String title) {this.title = title;}
			
			public java.lang.String getCoverPicPath() {return coverPicPath;}
			public void setCoverPicPath(java.lang.String coverPicPath) {this.coverPicPath = coverPicPath;}
			
			public java.lang.Integer getEyeNo() {return eyeNo;}
			public void setEyeNo(java.lang.Integer eyeNo) {this.eyeNo = eyeNo;}
			
			public java.lang.String getType() {return type;}
			public void setType(java.lang.String type) {this.type = type;}
			
			public java.lang.String getLocation() {return location;}
			public void setLocation(java.lang.String location) {this.location = location;}
			
		}
	}
	
	@ApiModel(value="ActivityController.GetLineDetailReq")
	public static class GetLineDetailReq{
	
		@ApiModelProperty(required = true, value = "线路ID")
		private java.lang.Long lineId;
		
		public java.lang.Long getLineId() {return lineId;}
		public void setLineId(java.lang.Long lineId) {this.lineId = lineId;}
		
		
	}
	
	@ApiModel(value="ActivityController.GetLineDetailRes")
	public static class GetLineDetailRes{
	
		@ApiModelProperty(required = true, value = "返回码，0代表没有错误")
		private java.lang.String code;
		
		@ApiModelProperty(required = true, value = "返回信息")
		private java.lang.String msg;
		
		@ApiModelProperty(required = true, value = "图片列表")
		private java.util.List<Pic> picList;
		
		@ApiModelProperty(required = true, value = "推荐车辆列表，当列表元素数量等于0时不显示")
		private java.util.List<Car> carList;
		
		@ApiModelProperty(required = true, value = "推荐人群列表，当列表元素数量等于0时不显示")
		private java.util.List<Person> personList;
		
		@ApiModelProperty(required = true, value = "推荐装备列表，当列表元素数量等于0时不显示")
		private java.util.List<Equipment> equipmentList;
		
		@ApiModelProperty(required = true, value = "活动类型列表，当列表元素数量等于0时不显示")
		private java.util.List<Fit> fitList;
		
		@ApiModelProperty(required = true, value = "paramLength:长度（千米）,paramMaxGradient:最大坡度（度）,paramElevation:海拔（米）,paramDowntownDistance:距离市中心千米（千米）")
		private java.lang.String lineInfo;
		
		@ApiModelProperty(required = true, value = "paramRoadCondition:路况，百分比")
		private java.lang.String roadCondition;
		
		@ApiModelProperty(required = true, value = "想去的人数")
		private java.lang.Integer wannaNum;
		
		@ApiModelProperty(required = true, value = "0未设置想去，1已设置想去")
		private java.lang.String wanted;
		
		public java.lang.String getCode() {return code;}
		public void setCode(java.lang.String code) {this.code = code;}
		
		public java.lang.String getMsg() {return msg;}
		public void setMsg(java.lang.String msg) {this.msg = msg;}
		
		public java.util.List<Pic> getPicList() {return picList;}
		public void setPicList(java.util.List<Pic> picList) {this.picList = picList;}
		
		public java.util.List<Car> getCarList() {return carList;}
		public void setCarList(java.util.List<Car> carList) {this.carList = carList;}
		
		public java.util.List<Person> getPersonList() {return personList;}
		public void setPersonList(java.util.List<Person> personList) {this.personList = personList;}
		
		public java.util.List<Equipment> getEquipmentList() {return equipmentList;}
		public void setEquipmentList(java.util.List<Equipment> equipmentList) {this.equipmentList = equipmentList;}
		
		public java.util.List<Fit> getFitList() {return fitList;}
		public void setFitList(java.util.List<Fit> fitList) {this.fitList = fitList;}
		
		public java.lang.String getLineInfo() {return lineInfo;}
		public void setLineInfo(java.lang.String lineInfo) {this.lineInfo = lineInfo;}
		
		public java.lang.String getRoadCondition() {return roadCondition;}
		public void setRoadCondition(java.lang.String roadCondition) {this.roadCondition = roadCondition;}
		
		public java.lang.Integer getWannaNum() {return wannaNum;}
		public void setWannaNum(java.lang.Integer wannaNum) {this.wannaNum = wannaNum;}
		
		public java.lang.String getWanted() {return wanted;}
		public void setWanted(java.lang.String wanted) {this.wanted = wanted;}
		
		public static class Pic{
			@ApiModelProperty(required = true, value = "图片地址")
			private java.lang.String picPath;
			
			public java.lang.String getPicPath() {return picPath;}
			public void setPicPath(java.lang.String picPath) {this.picPath = picPath;}
			
		}
		public static class Car{
			@ApiModelProperty(required = true, value = "推荐车型图标链接")
			private java.lang.String iconPath;
			
			@ApiModelProperty(required = true, value = "推荐车型")
			private java.lang.String car;
			
			public java.lang.String getIconPath() {return iconPath;}
			public void setIconPath(java.lang.String iconPath) {this.iconPath = iconPath;}
			
			public java.lang.String getCar() {return car;}
			public void setCar(java.lang.String car) {this.car = car;}
			
		}
		public static class Person{
			@ApiModelProperty(required = true, value = "推荐人群")
			private java.lang.String person;
			
			public java.lang.String getPerson() {return person;}
			public void setPerson(java.lang.String person) {this.person = person;}
			
		}
		public static class Equipment{
			@ApiModelProperty(required = true, value = "推荐装备")
			private java.lang.String equipment;
			
			public java.lang.String getEquipment() {return equipment;}
			public void setEquipment(java.lang.String equipment) {this.equipment = equipment;}
			
		}
		public static class Fit{
			@ApiModelProperty(required = true, value = "适合哪些类型的活动")
			private java.lang.String fit;
			
			public java.lang.String getFit() {return fit;}
			public void setFit(java.lang.String fit) {this.fit = fit;}
			
		}
	}
	
	@ApiModel(value="ActivityController.GetLineAcitivityListReq")
	public static class GetLineAcitivityListReq{
	
		@ApiModelProperty(required = true, value = "活动线路ID")
		private java.lang.Long lineId;
		
		@ApiModelProperty(required = true, value = "每页显示个数")
		private java.lang.Integer pageSize;
		
		@ApiModelProperty(required = true, value = "页数")
		private java.lang.Integer pageNum;
		
		public java.lang.Long getLineId() {return lineId;}
		public void setLineId(java.lang.Long lineId) {this.lineId = lineId;}
		
		public java.lang.Integer getPageSize() {return pageSize;}
		public void setPageSize(java.lang.Integer pageSize) {this.pageSize = pageSize;}
		
		public java.lang.Integer getPageNum() {return pageNum;}
		public void setPageNum(java.lang.Integer pageNum) {this.pageNum = pageNum;}
		
		
	}
	
	@ApiModel(value="ActivityController.GetLineAcitivityListRes")
	public static class GetLineAcitivityListRes{
	
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
			private java.lang.Long id;
			
			@ApiModelProperty(required = true, value = "活动状态，比如：报名中")
			private java.lang.String status;
			
			@ApiModelProperty(required = true, value = "活动封面图片地址")
			private java.lang.String coverPicPath;
			
			@ApiModelProperty(required = true, value = "活动标题")
			private java.lang.String title;
			
			@ApiModelProperty(required = true, value = "活动日期 yyyy-MM-dd")
			private java.lang.String date;
			
			@ApiModelProperty(required = true, value = "报名人数")
			private java.lang.Integer applyCount;
			
			@ApiModelProperty(required = true, value = "领队昵称")
			private java.lang.String leaderNickname;
			
			@ApiModelProperty(required = true, value = "领队头像")
			private java.lang.String leaderHeaderPic;
			
			@ApiModelProperty(required = true, value = "领队认证状态")
			private java.lang.String leaderStatus;
			
			public java.lang.Long getId() {return id;}
			public void setId(java.lang.Long id) {this.id = id;}
			
			public java.lang.String getStatus() {return status;}
			public void setStatus(java.lang.String status) {this.status = status;}
			
			public java.lang.String getCoverPicPath() {return coverPicPath;}
			public void setCoverPicPath(java.lang.String coverPicPath) {this.coverPicPath = coverPicPath;}
			
			public java.lang.String getTitle() {return title;}
			public void setTitle(java.lang.String title) {this.title = title;}
			
			public java.lang.String getDate() {return date;}
			public void setDate(java.lang.String date) {this.date = date;}
			
			public java.lang.Integer getApplyCount() {return applyCount;}
			public void setApplyCount(java.lang.Integer applyCount) {this.applyCount = applyCount;}
			
			public java.lang.String getLeaderNickname() {return leaderNickname;}
			public void setLeaderNickname(java.lang.String leaderNickname) {this.leaderNickname = leaderNickname;}
			
			public java.lang.String getLeaderHeaderPic() {return leaderHeaderPic;}
			public void setLeaderHeaderPic(java.lang.String leaderHeaderPic) {this.leaderHeaderPic = leaderHeaderPic;}
			
			public java.lang.String getLeaderStatus() {return leaderStatus;}
			public void setLeaderStatus(java.lang.String leaderStatus) {this.leaderStatus = leaderStatus;}
			
		}
	}
	
	@ApiModel(value="ActivityController.ClickWantGoReq")
	public static class ClickWantGoReq{
	
		@ApiModelProperty(required = true, value = "线路ID")
		private java.lang.Long lineId;
		
		public java.lang.Long getLineId() {return lineId;}
		public void setLineId(java.lang.Long lineId) {this.lineId = lineId;}
		
		
	}
	
	@ApiModel(value="ActivityController.ClickWantGoRes")
	public static class ClickWantGoRes{
	
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
