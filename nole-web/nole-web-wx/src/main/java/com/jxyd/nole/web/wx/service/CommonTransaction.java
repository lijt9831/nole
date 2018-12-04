package com.jxyd.nole.web.wx.service;

import com.jxyd.nole.web.wx.controller.CommonController.ConfigMyFavorsReq;

/** 
 * 说明：00通用 事务接口
 * 创建人：zxg
 * 创建时间：2018
 */
public interface CommonTransaction {

	void configMyFavors(ConfigMyFavorsReq configMyFavorsReq);
}
