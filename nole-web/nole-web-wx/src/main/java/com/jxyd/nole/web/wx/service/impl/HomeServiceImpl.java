package com.jxyd.nole.web.wx.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxyd.nole.bas.log.Log;
import com.jxyd.nole.bas.log.LogFactory;
import com.jxyd.nole.bas.util.TransferUtils;
import com.jxyd.nole.jpa.mybatis.util.PageUtils;
import com.jxyd.nole.jpa.mysql.alpha.raw.mapper.Nole017LoopMapper;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole017Loop;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole017LoopExample;
import com.jxyd.nole.web.wx.controller.HomeController.GetAcitivityHotReq;
import com.jxyd.nole.web.wx.controller.HomeController.GetAcitivityHotRes;
import com.jxyd.nole.web.wx.controller.HomeController.GetAcitivityHotRes.ActivityCover;
import com.jxyd.nole.web.wx.controller.HomeController.GetLineNewReq;
import com.jxyd.nole.web.wx.controller.HomeController.GetLineNewRes;
import com.jxyd.nole.web.wx.controller.HomeController.GetLineNewRes.Line;
import com.jxyd.nole.web.wx.controller.HomeController.GetLoopPicsReq;
import com.jxyd.nole.web.wx.controller.HomeController.GetLoopPicsRes;
import com.jxyd.nole.web.wx.controller.HomeController.GetMemoirCoversReq;
import com.jxyd.nole.web.wx.controller.HomeController.GetMemoirCoversRes;
import com.jxyd.nole.web.wx.controller.HomeController.SearchReq;
import com.jxyd.nole.web.wx.controller.HomeController.SearchRes;
import com.jxyd.nole.web.wx.dto.HotActivityStandard;
import com.jxyd.nole.web.wx.dto.HotLineStandard;
import com.jxyd.nole.web.wx.dto.LineCover;
import com.jxyd.nole.web.wx.mysql.alpha.mapper.ActivityMapper;
import com.jxyd.nole.web.wx.mysql.alpha.mapper.LineMapper;
import com.jxyd.nole.web.wx.property.CommonProperties;
import com.jxyd.nole.web.wx.service.HomeService;

import net.sf.json.JSONObject;

/** 
 * 说明：01首页 服务实现
 * 创建人：zxg
 * 创建时间：2018
 */
@Service
public class HomeServiceImpl implements HomeService {

	private static final Log log = LogFactory.getLog(HomeServiceImpl.class);
	
	@Autowired
	private ActivityMapper activityMapper;
	@Autowired
	private LineMapper lineMapper;
	@Autowired
	private Nole017LoopMapper nole017LoopMapper;
	
	@Override
	public GetLoopPicsRes getLoopPics(GetLoopPicsReq getLoopPicsReq) {
		GetLoopPicsRes getLoopPicsRes = new GetLoopPicsRes();
		try{
			Nole017LoopExample example = new Nole017LoopExample();
			List<Nole017Loop> loops = nole017LoopMapper.selectByExample(example);
			List<GetLoopPicsRes.LoopPic> list = new ArrayList<GetLoopPicsRes.LoopPic>();
			for (Nole017Loop nole017Loop : loops) {
				GetLoopPicsRes.LoopPic loopPic = new GetLoopPicsRes.LoopPic();
				loopPic.setHref(nole017Loop.getPicHref());
				loopPic.setPath(CommonProperties.picVirtualPath + nole017Loop.getPicPath());
				loopPic.setTitle(nole017Loop.getPicTitle());
				list.add(loopPic);
			}
			getLoopPicsRes.setLoopPicList(list);
			getLoopPicsRes.setCode("0");
			getLoopPicsRes.setMsg("检索轮播图成功");
		}catch(Exception e){
			log.error(JSONObject.fromObject(getLoopPicsReq).toString(), e);
			getLoopPicsRes.setCode("1");
			getLoopPicsRes.setMsg("检索轮播图失败");
		}
		return getLoopPicsRes;
	}
	
	@Override
	public GetAcitivityHotRes getAcitivityHot(GetAcitivityHotReq getAcitivityHotReq) {
		GetAcitivityHotRes getAcitivityHotRes = new GetAcitivityHotRes();
		try{
			// 照浏览量+报名数+截止日期近
			RowBounds rowBounds = PageUtils.getRowBounds(getAcitivityHotReq.getPageNum(), getAcitivityHotReq.getPageSize(), false);
			List<HotActivityStandard> hotList = activityMapper.selectHotList(rowBounds);
			
			List<GetAcitivityHotRes.ActivityCover> list = new ArrayList<GetAcitivityHotRes.ActivityCover>();
			for (HotActivityStandard hotActivityStandard : hotList) {
				com.jxyd.nole.web.wx.dto.ActivityCover cover = activityMapper.selectActivityCoverById(hotActivityStandard.getActivityId());
				ActivityCover transfer = TransferUtils.transfer(cover, GetAcitivityHotRes.ActivityCover.class);
				transfer.setCoverPicPath(CommonProperties.picVirtualPath + transfer.getCoverPicPath());
				list.add(transfer);
			}
			getAcitivityHotRes.setActivityCoverList(list);
			getAcitivityHotRes.setCode("0");
			getAcitivityHotRes.setMsg("检索热门组队成功");
		}catch(Exception e){
			log.error(JSONObject.fromObject(getAcitivityHotReq).toString(), e);
			getAcitivityHotRes.setCode("1");
			getAcitivityHotRes.setMsg("检索热门组队失败");
		}
		return getAcitivityHotRes;
	}
	
	@Override
	public GetLineNewRes getLineNew(GetLineNewReq getLineNewReq) {
		GetLineNewRes getLineNewRes = new GetLineNewRes();
		try{
			RowBounds rowBounds = PageUtils.getRowBounds(getLineNewReq.getPageNum(), getLineNewReq.getPageSize(), false);
			List<HotLineStandard> hotList = lineMapper.selectHotList(rowBounds);
			
			List<GetLineNewRes.Line> list = new ArrayList<GetLineNewRes.Line>();
			for (HotLineStandard hotLineStandard : hotList) {
				LineCover cover = lineMapper.selectLineCoverById(hotLineStandard.getLineId());
				Line transfer = TransferUtils.transfer(cover, GetLineNewRes.Line.class);
				transfer.setCoverPicPath(CommonProperties.picVirtualPath + transfer.getCoverPicPath());
				list.add(transfer);
				getLineNewRes.setLineList(list);
				getLineNewRes.setCode("0");
				getLineNewRes.setMsg("检索最新线路成功");
			}
		}catch(Exception e){
			log.error(JSONObject.fromObject(getLineNewReq).toString(), e);
			getLineNewRes.setCode("1");
			getLineNewRes.setMsg("检索最新线路失败");
		}
		return getLineNewRes;
	}
	
	@Override
	public GetMemoirCoversRes getMemoirCovers(GetMemoirCoversReq getMemoirCoversReq) {
		GetMemoirCoversRes getMemoirCoversRes = new GetMemoirCoversRes();
		try{
			//TODO 
		}catch(Exception e){
			log.error(JSONObject.fromObject(getMemoirCoversReq).toString(), e);
		}
		return getMemoirCoversRes;
	}
	
	@Override
	public SearchRes search(SearchReq searchReq) {
		SearchRes searchRes = new SearchRes();
		try{
			//TODO 
		}catch(Exception e){
			log.error(JSONObject.fromObject(searchReq).toString(), e);
		}
		return searchRes;
	}
	

}
