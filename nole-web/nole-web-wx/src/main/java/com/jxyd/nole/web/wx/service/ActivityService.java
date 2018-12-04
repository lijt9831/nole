package com.jxyd.nole.web.wx.service;

import com.jxyd.nole.web.wx.controller.ActivityController.GetLineCoversReq;
import com.jxyd.nole.web.wx.controller.ActivityController.GetLineCoversRes;
import com.jxyd.nole.web.wx.controller.ActivityController.GetLineDetailReq;
import com.jxyd.nole.web.wx.controller.ActivityController.GetLineDetailRes;
import com.jxyd.nole.web.wx.controller.ActivityController.GetLineAcitivityListReq;
import com.jxyd.nole.web.wx.controller.ActivityController.GetLineAcitivityListRes;
import com.jxyd.nole.web.wx.controller.ActivityController.ClickWantGoReq;
import com.jxyd.nole.web.wx.controller.ActivityController.ClickWantGoRes;

/** 
 * 说明：02活动 服务接口
 * 创建人：zxg
 * 创建时间：2018-05-27
 */
public interface ActivityService {

	GetLineCoversRes getLineCovers(GetLineCoversReq getLineCoversReq);
	
	GetLineDetailRes getLineDetail(GetLineDetailReq getLineDetailReq);
	
	GetLineAcitivityListRes getLineAcitivityList(GetLineAcitivityListReq getLineAcitivityListReq);
	
	ClickWantGoRes clickWantGo(ClickWantGoReq clickWantGoReq);
	
}
