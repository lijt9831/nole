package com.jxyd.nole.web.wx.dto;

import java.util.Date;

public class HotLineStandard {
	
	private Long lineId;
	private Integer wantNo;
	private Integer viewNo;
	private Date date;
	
	public Long getLineId() {
		return lineId;
	}
	public void setLineId(Long lineId) {
		this.lineId = lineId;
	}
	public Integer getWantNo() {
		return wantNo;
	}
	public void setWantNo(Integer wantNo) {
		this.wantNo = wantNo;
	}
	public Integer getViewNo() {
		return viewNo;
	}
	public void setViewNo(Integer viewNo) {
		this.viewNo = viewNo;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "HotLineStandard [lineId=" + lineId + ", wantNo=" + wantNo + ", viewNo=" + viewNo + ", date=" + date
				+ "]";
	}
	
	
	
}
