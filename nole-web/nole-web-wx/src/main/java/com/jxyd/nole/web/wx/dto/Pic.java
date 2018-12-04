package com.jxyd.nole.web.wx.dto;

public class Pic {

	private java.lang.String title;
	
	private java.lang.String picPath;
	
	private java.lang.String href;

	public java.lang.String getTitle() {
		return title;
	}

	public void setTitle(java.lang.String title) {
		this.title = title;
	}

	public java.lang.String getPicPath() {
		return picPath;
	}

	public void setPicPath(java.lang.String picPath) {
		this.picPath = picPath;
	}

	public java.lang.String getHref() {
		return href;
	}

	public void setHref(java.lang.String href) {
		this.href = href;
	}

	@Override
	public String toString() {
		return "Pic [title=" + title + ", picPath=" + picPath + ", href=" + href + "]";
	}

	
	
}
