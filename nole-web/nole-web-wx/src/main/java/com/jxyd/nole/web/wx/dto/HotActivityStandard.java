package com.jxyd.nole.web.wx.dto;

import java.util.Date;

public class HotActivityStandard {
	
	private Long activityId;
	private Integer viewNo;
	private Integer applyNo;
	private Date dateEnd;
	
	public Long getActivityId() {
		return activityId;
	}
	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}
	public Integer getViewNo() {
		return viewNo;
	}
	public void setViewNo(Integer viewNo) {
		this.viewNo = viewNo;
	}
	public Integer getApplyNo() {
		return applyNo;
	}
	public void setApplyNo(Integer applyNo) {
		this.applyNo = applyNo;
	}
	public Date getDateEnd() {
		return dateEnd;
	}
	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}
	@Override
	public String toString() {
		return "HotActivityStandard [activityId=" + activityId + ", viewNo=" + viewNo + ", applyNo=" + applyNo
				+ ", dateEnd=" + dateEnd + "]";
	}
	
	
}
