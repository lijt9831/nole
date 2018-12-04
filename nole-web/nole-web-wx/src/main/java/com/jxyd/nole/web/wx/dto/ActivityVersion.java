package com.jxyd.nole.web.wx.dto;

public class ActivityVersion {

	// ------- 共通 ---------
	private Long versionId; 
	private String title;
	private String activityStart;
	private String activityEnd;
	private String gatherTime;
	private String gatherPoint;
	private String frontMoney;
	private String signEnd;
	private String remark;
	private Integer maxNo;
	private Integer applyNo;
	
	// ---- 徒步 ----
	private String maxPeopleNo;
	private String powerCondition;
	
	// ---- 车辆 ----
	private String channel;
	private String maxCarNo;

	public Long getVersionId() {
		return versionId;
	}

	public void setVersionId(Long versionId) {
		this.versionId = versionId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getActivityStart() {
		return activityStart;
	}

	public void setActivityStart(String activityStart) {
		this.activityStart = activityStart;
	}

	public String getActivityEnd() {
		return activityEnd;
	}

	public void setActivityEnd(String activityEnd) {
		this.activityEnd = activityEnd;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getGatherTime() {
		return gatherTime;
	}

	public void setGatherTime(String gatherTime) {
		this.gatherTime = gatherTime;
	}

	public String getGatherPoint() {
		return gatherPoint;
	}

	public void setGatherPoint(String gatherPoint) {
		this.gatherPoint = gatherPoint;
	}

	public String getFrontMoney() {
		return frontMoney;
	}

	public void setFrontMoney(String frontMoney) {
		this.frontMoney = frontMoney;
	}

	public String getSignEnd() {
		return signEnd;
	}

	public void setSignEnd(String signEnd) {
		this.signEnd = signEnd;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getMaxPeopleNo() {
		return maxPeopleNo;
	}

	public void setMaxPeopleNo(String maxPeopleNo) {
		this.maxPeopleNo = maxPeopleNo;
	}

	public String getPowerCondition() {
		return powerCondition;
	}

	public void setPowerCondition(String powerCondition) {
		this.powerCondition = powerCondition;
	}

	public String getMaxCarNo() {
		return maxCarNo;
	}

	public void setMaxCarNo(String maxCarNo) {
		this.maxCarNo = maxCarNo;
	}

	public Integer getMaxNo() {
		return maxNo;
	}

	public void setMaxNo(Integer maxNo) {
		this.maxNo = maxNo;
	}

	public Integer getApplyNo() {
		return applyNo;
	}

	public void setApplyNo(Integer applyNo) {
		this.applyNo = applyNo;
	}

	
	
	
	
}
