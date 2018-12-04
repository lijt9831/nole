package com.jxyd.nole.web.wx.dto;

public class Leave {

	private Long activityId;
	
	private String leftnickname;
	
	private Long talkId;
	
	private String beleftnickname;
	
	private String content;
	
	private String pic;
	
	//	留言时间 yyyy-MM-dd HH:mm 
	private String date;

	public Long getActivityId() {
		return activityId;
	}

	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

	public String getLeftnickname() {
		return leftnickname;
	}

	public void setLeftnickname(String leftnickname) {
		this.leftnickname = leftnickname;
	}

	public Long getTalkId() {
		return talkId;
	}

	public void setTalkId(Long talkId) {
		this.talkId = talkId;
	}

	public String getBeleftnickname() {
		return beleftnickname;
	}

	public void setBeleftnickname(String beleftnickname) {
		this.beleftnickname = beleftnickname;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
}
