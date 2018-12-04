package com.jxyd.nole.web.wx.dto;

public class Line {
	
	private Long id;
	private String paramLength;
	private String paramMaxGradient;
	private String paramElevation;
	private String paramDowntownDistance;
	private String paramRoadCondition;
	private Integer wantNo;
	private String wanted;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getParamLength() {
		return paramLength;
	}
	public void setParamLength(String paramLength) {
		this.paramLength = paramLength;
	}
	public String getParamMaxGradient() {
		return paramMaxGradient;
	}
	public void setParamMaxGradient(String paramMaxGradient) {
		this.paramMaxGradient = paramMaxGradient;
	}
	public String getParamElevation() {
		return paramElevation;
	}
	public void setParamElevation(String paramElevation) {
		this.paramElevation = paramElevation;
	}
	public String getParamDowntownDistance() {
		return paramDowntownDistance;
	}
	public void setParamDowntownDistance(String paramDowntownDistance) {
		this.paramDowntownDistance = paramDowntownDistance;
	}
	public String getParamRoadCondition() {
		return paramRoadCondition;
	}
	public void setParamRoadCondition(String paramRoadCondition) {
		this.paramRoadCondition = paramRoadCondition;
	}
	public Integer getWantNo() {
		return wantNo;
	}
	public void setWantNo(Integer wantNo) {
		this.wantNo = wantNo;
	}
	public String getWanted() {
		return wanted;
	}
	public void setWanted(String wanted) {
		this.wanted = wanted;
	}
	@Override
	public String toString() {
		return "Line [id=" + id + ", paramLength=" + paramLength + ", paramMaxGradient=" + paramMaxGradient
				+ ", paramElevation=" + paramElevation + ", paramDowntownDistance=" + paramDowntownDistance
				+ ", paramRoadCondition=" + paramRoadCondition + ", wantNo=" + wantNo + ", wanted=" + wanted + "]";
	}
	
	
}
