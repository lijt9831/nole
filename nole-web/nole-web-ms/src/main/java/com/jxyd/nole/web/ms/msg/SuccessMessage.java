package com.jxyd.nole.web.ms.msg;

public class SuccessMessage extends Message {
	public SuccessMessage(String msg) {
		super.setCode(Code.success);
		super.setContent(msg);
	}
}
