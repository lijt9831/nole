package com.jxyd.nole.web.wx.dto;

public class LineCover {
	
	private java.lang.Long id;
	
	private java.lang.String title;
	
	private java.lang.String coverPicPath;
	
	private java.lang.Integer eyeNo;
	
	private java.lang.String type;
	
	private java.lang.String location;

	public java.lang.Long getId() {
		return id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getTitle() {
		return title;
	}

	public void setTitle(java.lang.String title) {
		this.title = title;
	}

	public java.lang.String getCoverPicPath() {
		return coverPicPath;
	}

	public void setCoverPicPath(java.lang.String coverPicPath) {
		this.coverPicPath = coverPicPath;
	}

	public java.lang.Integer getEyeNo() {
		return eyeNo;
	}

	public void setEyeNo(java.lang.Integer eyeNo) {
		this.eyeNo = eyeNo;
	}

	public java.lang.String getType() {
		return type;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}

	public java.lang.String getLocation() {
		return location;
	}

	public void setLocation(java.lang.String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "LineCover [id=" + id + ", title=" + title + ", coverPicPath=" + coverPicPath + ", eyeNo=" + eyeNo
				+ ", type=" + type + ", location=" + location + "]";
	}
	
}
