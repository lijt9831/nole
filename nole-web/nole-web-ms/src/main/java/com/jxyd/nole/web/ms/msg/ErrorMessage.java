package com.jxyd.nole.web.ms.msg;

public class ErrorMessage extends Message {

	public ErrorMessage(String msg){
		super.setCode(Code.error);
		super.setContent(msg);
	}
}
