package com.jxyd.nole.web.ms.msg;

public class WarningMessage extends Message {

	public WarningMessage(String msg){
		super.setCode(Code.warning);
		super.setContent(msg);
	}
}
