package com.jxyd.nole.web.wx.service;

import java.util.List;

/** 
 * 说明：05我的 事务接口
 * 创建人：zxg
 * 创建时间：2018
 */
public interface MemberTransaction {

	void sendMsg(List<Long> userIdList,String msgContent,Long senderId);
}
