package com.jxyd.nole.web.wx.dto;

public class Msg {
	
	private java.lang.Long id;

	// 消息内容
	private java.lang.String content;

	// 消息时间
	private java.lang.String date;

	// 消息类型：1为系统消息（系统自动发送的消息提醒，如留言评论提醒，活动提醒），2为用户消息（用户发送的消息，如领队群通知）
	private java.lang.String type;

	// 消息状态，0未读1已读
	private java.lang.String status;

	public java.lang.Long getId() {
		return id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getContent() {
		return content;
	}

	public void setContent(java.lang.String content) {
		this.content = content;
	}

	public java.lang.String getDate() {
		return date;
	}

	public void setDate(java.lang.String date) {
		this.date = date;
	}

	public java.lang.String getType() {
		return type;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}

	public java.lang.String getStatus() {
		return status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}
}
