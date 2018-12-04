package com.jxyd.nole.web.wx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jxyd.nole.bas.util.CheckUtils;
import com.jxyd.nole.web.wx.service.HomeService;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

/** 
 * 说明：01首页
 * 创建人：zxg
 * 创建时间：2018-05-27
 */
@RestController
public class HomeController {

	@Autowired
	private HomeService homeService;
	
	// ------------- 方法区 ----------------
	@ApiOperation(value = "01获取轮播图")
	@RequestMapping(value = "/home/getLoopPics", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private GetLoopPicsRes getLoopPics(@RequestBody GetLoopPicsReq getLoopPicsReq) {
		GetLoopPicsRes getLoopPicsRes = CheckUtils.checkNull(getLoopPicsReq, GetLoopPicsRes.class);
		if (getLoopPicsRes != null) {
			return getLoopPicsRes;
		}
		return homeService.getLoopPics(getLoopPicsReq);
	}
	
	@ApiOperation(value = "02获取热门组队")
	@RequestMapping(value = "/home/getAcitivityHot", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private GetAcitivityHotRes getAcitivityHot(@RequestBody GetAcitivityHotReq getAcitivityHotReq) {
		GetAcitivityHotRes getAcitivityHotRes = CheckUtils.checkNull(getAcitivityHotReq, GetAcitivityHotRes.class);
		if (getAcitivityHotRes != null) {
			return getAcitivityHotRes;
		}
		return homeService.getAcitivityHot(getAcitivityHotReq);
	}
	
	@ApiOperation(value = "03获取最新活动线路")
	@RequestMapping(value = "/home/getLineNew", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private GetLineNewRes getLineNew(@RequestBody GetLineNewReq getLineNewReq) {
		GetLineNewRes getLineNewRes = CheckUtils.checkNull(getLineNewReq, GetLineNewRes.class);
		if (getLineNewRes != null) {
			return getLineNewRes;
		}
		return homeService.getLineNew(getLineNewReq);
	}
	
	@ApiOperation(value = "05获取精彩瞬间封面")
	@RequestMapping(value = "/home/getMemoirCovers", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private GetMemoirCoversRes getMemoirCovers(@RequestBody GetMemoirCoversReq getMemoirCoversReq) {
		GetMemoirCoversRes getMemoirCoversRes = CheckUtils.checkNull(getMemoirCoversReq, GetMemoirCoversRes.class);
		if (getMemoirCoversRes != null) {
			return getMemoirCoversRes;
		}
		return homeService.getMemoirCovers(getMemoirCoversReq);
	}
	
	@ApiOperation(value = "07模糊搜索")
	@RequestMapping(value = "/home/search", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private SearchRes search(@RequestBody SearchReq searchReq) {
		SearchRes searchRes = CheckUtils.checkNull(searchReq, SearchRes.class);
		if (searchRes != null) {
			return searchRes;
		}
		return homeService.search(searchReq);
	}
	
	// ------------- 实体区 ----------------
	@ApiModel(value="HomeController.GetLoopPicsReq")
	public static class GetLoopPicsReq{
	
		
	}
	
	@ApiModel(value="HomeController.GetLoopPicsRes")
	public static class GetLoopPicsRes{
	
		@ApiModelProperty(required = true, value = "返回码，0代表没有错误")
		private java.lang.String code;
		
		@ApiModelProperty(required = true, value = "返回信息")
		private java.lang.String msg;
		
		@ApiModelProperty(required = true, value = "轮播图列表")
		private java.util.List<LoopPic> loopPicList;
		
		public java.lang.String getCode() {return code;}
		public void setCode(java.lang.String code) {this.code = code;}
		
		public java.lang.String getMsg() {return msg;}
		public void setMsg(java.lang.String msg) {this.msg = msg;}
		
		public java.util.List<LoopPic> getLoopPicList() {return loopPicList;}
		public void setLoopPicList(java.util.List<LoopPic> loopPicList) {this.loopPicList = loopPicList;}
		
		public static class LoopPic{
			@ApiModelProperty(required = true, value = "轮播图标题")
			private java.lang.String title;
			
			@ApiModelProperty(required = true, value = "轮播图图片地址")
			private java.lang.String path;
			
			@ApiModelProperty(required = false, value = "轮播图链接")
			private java.lang.String href;
			
			public java.lang.String getTitle() {return title;}
			public void setTitle(java.lang.String title) {this.title = title;}
			
			public java.lang.String getPath() {return path;}
			public void setPath(java.lang.String path) {this.path = path;}
			
			public java.lang.String getHref() {return href;}
			public void setHref(java.lang.String href) {this.href = href;}
			
		}
	}
	
	@ApiModel(value="HomeController.GetAcitivityHotReq")
	public static class GetAcitivityHotReq{
	
		@ApiModelProperty(required = true, value = "每页显示个数")
		private java.lang.Integer pageSize;
		
		@ApiModelProperty(required = true, value = "页数")
		private java.lang.Integer pageNum;
		
		public java.lang.Integer getPageSize() {return pageSize;}
		public void setPageSize(java.lang.Integer pageSize) {this.pageSize = pageSize;}
		
		public java.lang.Integer getPageNum() {return pageNum;}
		public void setPageNum(java.lang.Integer pageNum) {this.pageNum = pageNum;}
		
		
	}
	
	@ApiModel(value="HomeController.GetAcitivityHotRes")
	public static class GetAcitivityHotRes{
	
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
	
	@ApiModel(value="HomeController.GetLineNewReq")
	public static class GetLineNewReq{
	
		@ApiModelProperty(required = true, value = "每页显示个数")
		private java.lang.Integer pageSize;
		
		@ApiModelProperty(required = true, value = "页数")
		private java.lang.Integer pageNum;
		
		public java.lang.Integer getPageSize() {return pageSize;}
		public void setPageSize(java.lang.Integer pageSize) {this.pageSize = pageSize;}
		
		public java.lang.Integer getPageNum() {return pageNum;}
		public void setPageNum(java.lang.Integer pageNum) {this.pageNum = pageNum;}
		
		
	}
	
	@ApiModel(value="HomeController.GetLineNewRes")
	public static class GetLineNewRes{
	
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
			
			@ApiModelProperty(required = true, value = "线路标题")
			private java.lang.String title;
			
			@ApiModelProperty(required = true, value = "线路封面图片地址")
			private java.lang.String coverPicPath;
			
			@ApiModelProperty(required = true, value = "看过人数 ")
			private java.lang.Integer eyeNo;
			
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
			
			public java.lang.String getLocation() {return location;}
			public void setLocation(java.lang.String location) {this.location = location;}
			
		}
	}
	
	@ApiModel(value="HomeController.GetMemoirCoversReq")
	public static class GetMemoirCoversReq{
	
		
	}
	
	@ApiModel(value="HomeController.GetMemoirCoversRes")
	public static class GetMemoirCoversRes{
	
		@ApiModelProperty(required = true, value = "返回码，0代表没有错误")
		private java.lang.String code;
		
		@ApiModelProperty(required = true, value = "返回信息")
		private java.lang.String msg;
		
		@ApiModelProperty(required = true, value = "精彩瞬间封面列表")
		private java.util.List<Moment> momentList;
		
		public java.lang.String getCode() {return code;}
		public void setCode(java.lang.String code) {this.code = code;}
		
		public java.lang.String getMsg() {return msg;}
		public void setMsg(java.lang.String msg) {this.msg = msg;}
		
		public java.util.List<Moment> getMomentList() {return momentList;}
		public void setMomentList(java.util.List<Moment> momentList) {this.momentList = momentList;}
		
		public static class Moment{
			@ApiModelProperty(required = true, value = "精彩瞬间ID")
			private long id;
			
			@ApiModelProperty(required = true, value = "精彩瞬间标题")
			private java.lang.String title;
			
			@ApiModelProperty(required = true, value = "精彩瞬间封面")
			private java.lang.String coverPicPath;
			
			@ApiModelProperty(required = true, value = "领队昵称")
			private java.lang.String leaderNickname;
			
			@ApiModelProperty(required = true, value = "领队头像")
			private java.lang.String leaderHeaderPic;
			
			@ApiModelProperty(required = true, value = "领队认证状态")
			private java.lang.String leaderStatus;
			
			public long getId() {return id;}
			public void setId(long id) {this.id = id;}
			
			public java.lang.String getTitle() {return title;}
			public void setTitle(java.lang.String title) {this.title = title;}
			
			public java.lang.String getCoverPicPath() {return coverPicPath;}
			public void setCoverPicPath(java.lang.String coverPicPath) {this.coverPicPath = coverPicPath;}
			
			public java.lang.String getLeaderNickname() {return leaderNickname;}
			public void setLeaderNickname(java.lang.String leaderNickname) {this.leaderNickname = leaderNickname;}
			
			public java.lang.String getLeaderHeaderPic() {return leaderHeaderPic;}
			public void setLeaderHeaderPic(java.lang.String leaderHeaderPic) {this.leaderHeaderPic = leaderHeaderPic;}
			
			public java.lang.String getLeaderStatus() {return leaderStatus;}
			public void setLeaderStatus(java.lang.String leaderStatus) {this.leaderStatus = leaderStatus;}
			
		}
	}
	
	@ApiModel(value="HomeController.SearchReq")
	public static class SearchReq{
	
		@ApiModelProperty(required = true, value = "搜索关键词")
		private java.lang.String keyword;
		
		public java.lang.String getKeyword() {return keyword;}
		public void setKeyword(java.lang.String keyword) {this.keyword = keyword;}
		
		
	}
	
	@ApiModel(value="HomeController.SearchRes")
	public static class SearchRes{
	
		@ApiModelProperty(required = true, value = "返回码，0代表没有错误")
		private java.lang.String code;
		
		@ApiModelProperty(required = true, value = "返回信息")
		private java.lang.String msg;
		
		@ApiModelProperty(required = true, value = "匹配项列表")
		private java.util.List<Match> matchList;
		
		public java.lang.String getCode() {return code;}
		public void setCode(java.lang.String code) {this.code = code;}
		
		public java.lang.String getMsg() {return msg;}
		public void setMsg(java.lang.String msg) {this.msg = msg;}
		
		public java.util.List<Match> getMatchList() {return matchList;}
		public void setMatchList(java.util.List<Match> matchList) {this.matchList = matchList;}
		
		public static class Match{
			@ApiModelProperty(required = true, value = "项ID")
			private long id;
			
			@ApiModelProperty(required = true, value = "项标题")
			private java.lang.String title;
			
			@ApiModelProperty(required = true, value = "项类型")
			private java.lang.String type;
			
			public long getId() {return id;}
			public void setId(long id) {this.id = id;}
			
			public java.lang.String getTitle() {return title;}
			public void setTitle(java.lang.String title) {this.title = title;}
			
			public java.lang.String getType() {return type;}
			public void setType(java.lang.String type) {this.type = type;}
			
		}
	}
	
}
