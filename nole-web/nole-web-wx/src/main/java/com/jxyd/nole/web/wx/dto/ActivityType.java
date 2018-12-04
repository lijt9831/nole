package com.jxyd.nole.web.wx.dto;

public class ActivityType {

	private Long id;
	
	private String type;
	
	private String checked;
	
	private String modelCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getChecked() {
		return checked;
	}

	public void setChecked(String checked) {
		this.checked = checked;
	}

	public String getModelCode() {
		return modelCode;
	}

	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

	@Override
	public String toString() {
		return "ActivityType [id=" + id + ", type=" + type + ", checked=" + checked + ", modelCode=" + modelCode + "]";
	}
	
}
