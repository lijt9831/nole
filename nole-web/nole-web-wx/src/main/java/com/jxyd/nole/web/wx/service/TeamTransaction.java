package com.jxyd.nole.web.wx.service;

import com.jxyd.nole.web.wx.controller.TeamController.CarApplyReq;
import com.jxyd.nole.web.wx.controller.TeamController.ConfigCarTeamReq;
import com.jxyd.nole.web.wx.controller.TeamController.ConfigFootTeamReq;
import com.jxyd.nole.web.wx.controller.TeamController.FootApplyReq;

/** 
 * 说明：03组队 事务接口
 * 创建人：zxg
 * 创建时间：2018
 */
public interface TeamTransaction {
	
	void configCarTeam(ConfigCarTeamReq configCarTeamReq,Long userId);
	void configFootTeam(ConfigFootTeamReq configFootTeamReq,Long userId);
	
	void footApply(FootApplyReq FootApplyReq, Long userId);
	void carApply(CarApplyReq carApplyReq, Long userId);
}
