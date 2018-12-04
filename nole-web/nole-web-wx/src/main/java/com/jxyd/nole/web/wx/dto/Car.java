package com.jxyd.nole.web.wx.dto;

public class Car {

	private java.lang.String iconPath;
	
	private java.lang.String car;

	public java.lang.String getIconPath() {
		return iconPath;
	}

	public void setIconPath(java.lang.String iconPath) {
		this.iconPath = iconPath;
	}

	public java.lang.String getCar() {
		return car;
	}

	public void setCar(java.lang.String car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Car [iconPath=" + iconPath + ", car=" + car + "]";
	}
	
	
}
