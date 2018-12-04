package com.jxyd.nole.web.wx.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jxyd.nole.jpa.mysql.alpha.raw.mapper.Nole206MessageMapper;
import com.jxyd.nole.jpa.mysql.alpha.raw.mapper.Nole207MsgsendMapper;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole206Message;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole207Msgsend;
import com.jxyd.nole.web.wx.service.MemberTransaction;

/** 
 * 说明：05我的 事务实现
 * 创建人：zxg
 * 创建时间：2018
 */
@Service
@Transactional
public class MemberTransactionImpl implements MemberTransaction {

	@Autowired
	private Nole206MessageMapper nole206MessageMapper;
	@Autowired
	private Nole207MsgsendMapper nole207MsgsendMapper;
	
	@Override
	public void sendMsg(List<Long> userIdList, String msgContent, Long senderId) {
		Date date = new Date();
		Nole206Message nole206Message = new Nole206Message();
		nole206Message.setAvailableOrNot("Y");
		nole206Message.setContent(msgContent);
		nole206Message.setGmtCreate(date);
		nole206Message.setNole200Id(senderId);
		nole206Message.setType("USER");
		nole206MessageMapper.insert(nole206Message);
		
		Long msgId = nole206Message.getId();
		for (Long userId : userIdList) {
			Nole207Msgsend nole207Msgsend = new Nole207Msgsend();
			nole207Msgsend.setGmtCreate(date);
			nole207Msgsend.setNole200Id(userId);
			nole207Msgsend.setNole206Id(msgId);
			nole207Msgsend.setStatus("UNREAD");
			nole207MsgsendMapper.insert(nole207Msgsend);
		}
		
	}

	

}
