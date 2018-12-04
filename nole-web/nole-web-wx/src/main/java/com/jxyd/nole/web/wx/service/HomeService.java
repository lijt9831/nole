package com.jxyd.nole.web.wx.service;

import com.jxyd.nole.web.wx.controller.HomeController.GetLoopPicsReq;
import com.jxyd.nole.web.wx.controller.HomeController.GetLoopPicsRes;
import com.jxyd.nole.web.wx.controller.HomeController.GetAcitivityHotReq;
import com.jxyd.nole.web.wx.controller.HomeController.GetAcitivityHotRes;
import com.jxyd.nole.web.wx.controller.HomeController.GetLineNewReq;
import com.jxyd.nole.web.wx.controller.HomeController.GetLineNewRes;
import com.jxyd.nole.web.wx.controller.HomeController.GetMemoirCoversReq;
import com.jxyd.nole.web.wx.controller.HomeController.GetMemoirCoversRes;
import com.jxyd.nole.web.wx.controller.HomeController.SearchReq;
import com.jxyd.nole.web.wx.controller.HomeController.SearchRes;

/** 
 * 说明：01首页 服务接口
 * 创建人：zxg
 * 创建时间：2018-05-27
 */
public interface HomeService {

	GetLoopPicsRes getLoopPics(GetLoopPicsReq getLoopPicsReq);
	
	GetAcitivityHotRes getAcitivityHot(GetAcitivityHotReq getAcitivityHotReq);
	
	GetLineNewRes getLineNew(GetLineNewReq getLineNewReq);
	
	GetMemoirCoversRes getMemoirCovers(GetMemoirCoversReq getMemoirCoversReq);
	
	SearchRes search(SearchReq searchReq);
	
}
