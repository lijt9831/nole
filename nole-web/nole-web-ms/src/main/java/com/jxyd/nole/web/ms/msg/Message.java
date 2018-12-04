package com.jxyd.nole.web.ms.msg;

public abstract class Message {
	
	private Code code;
	private String content;
	
	public Code getCode() {
		return code;
	}
	public void setCode(Code code) {
		this.code = code;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
