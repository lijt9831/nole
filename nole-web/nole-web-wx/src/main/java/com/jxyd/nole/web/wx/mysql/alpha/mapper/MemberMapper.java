package com.jxyd.nole.web.wx.mysql.alpha.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jxyd.nole.web.wx.dto.Msg;

public interface MemberMapper {

	/**
	 * 未读排在前<br>
	 * 时间新排在前
	 * 
	 * @param userId
	 * @return
	 */
	List<Msg> selectMsgs(@Param("userId") Long userId);
	
}
