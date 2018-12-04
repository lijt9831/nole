package com.jxyd.nole.web.wx.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxyd.nole.bas.log.Log;
import com.jxyd.nole.bas.log.LogFactory;
import com.jxyd.nole.bas.util.TransferUtils;
import com.jxyd.nole.jpa.mybatis.util.PageUtils;
import com.jxyd.nole.jpa.mysql.alpha.raw.mapper.Nole401WantoMapper;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole401Wanto;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole401WantoExample;
import com.jxyd.nole.web.wx.controller.ActivityController.ClickWantGoReq;
import com.jxyd.nole.web.wx.controller.ActivityController.ClickWantGoRes;
import com.jxyd.nole.web.wx.controller.ActivityController.GetLineAcitivityListReq;
import com.jxyd.nole.web.wx.controller.ActivityController.GetLineAcitivityListRes;
import com.jxyd.nole.web.wx.controller.ActivityController.GetLineCoversReq;
import com.jxyd.nole.web.wx.controller.ActivityController.GetLineCoversRes;
import com.jxyd.nole.web.wx.controller.ActivityController.GetLineDetailReq;
import com.jxyd.nole.web.wx.controller.ActivityController.GetLineDetailRes;
import com.jxyd.nole.web.wx.dto.ActivityCover;
import com.jxyd.nole.web.wx.dto.ActivityType;
import com.jxyd.nole.web.wx.dto.Car;
import com.jxyd.nole.web.wx.dto.Equipment;
import com.jxyd.nole.web.wx.dto.Fit;
import com.jxyd.nole.web.wx.dto.Line;
import com.jxyd.nole.web.wx.dto.LineCover;
import com.jxyd.nole.web.wx.dto.Person;
import com.jxyd.nole.web.wx.dto.Pic;
import com.jxyd.nole.web.wx.mysql.alpha.mapper.ActivityMapper;
import com.jxyd.nole.web.wx.mysql.alpha.mapper.LineMapper;
import com.jxyd.nole.web.wx.property.CommonProperties;
import com.jxyd.nole.web.wx.service.ActivityService;

import net.sf.json.JSONObject;

/** 
 * 说明：02活动 服务实现
 * 创建人：zxg
 * 创建时间：2018
 */
@Service
public class ActivityServiceImpl implements ActivityService {

	private static final Log log = LogFactory.getLog(ActivityServiceImpl.class);
	
	@Autowired
	private LineMapper lineMapper;
	@Autowired
	private ActivityMapper activityMapper;
	@Autowired
	private Nole401WantoMapper nole401WantoMapper;
	
	@Override
	public GetLineCoversRes getLineCovers(GetLineCoversReq getLineCoversReq) {
		GetLineCoversRes getLineCoversRes = new GetLineCoversRes();
		try{
			Long lineType = getLineCoversReq.getLineType();
			RowBounds rowBounds = PageUtils.getRowBounds(getLineCoversReq.getPageNum(), getLineCoversReq.getPageSize(), false);
			List<LineCover> listFromDB = lineMapper.selectLineCoverByTypeId(lineType, rowBounds);
			List<GetLineCoversRes.Line> listForPage = new ArrayList<GetLineCoversRes.Line>();
			for (LineCover lineCover : listFromDB) {
				GetLineCoversRes.Line transfer = TransferUtils.transfer(lineCover, GetLineCoversRes.Line.class);
				transfer.setCoverPicPath(CommonProperties.picVirtualPath + transfer.getCoverPicPath());
				//TODO 热门，普通 的规则待定
				transfer.setType("普通");
				listForPage.add(transfer);
			}
			getLineCoversRes.setLineList(listForPage);
			getLineCoversRes.setCode("0");
			getLineCoversRes.setMsg("检索线路列表成功");
		}catch(Exception e){
			log.error(JSONObject.fromObject(getLineCoversReq).toString(), e);
			getLineCoversRes.setCode("0");
			getLineCoversRes.setMsg("检索线路列表失败");
		}
		return getLineCoversRes;
	}
	
	@Override
	public GetLineDetailRes getLineDetail(GetLineDetailReq getLineDetailReq) {
		GetLineDetailRes getLineDetailRes = new GetLineDetailRes();
		try{
			// 参数
			Long lineId = getLineDetailReq.getLineId();
			Long userId = (Long)SecurityUtils.getSubject().getSession().getAttribute("userId");
			
			// 获取基本信息
			Line line = lineMapper.selectLine(lineId, userId);
			
			// 获取附属列表 
			List<GetLineDetailRes.Car> carList = new ArrayList<GetLineDetailRes.Car>();
			List<Car> carListFromDB = lineMapper.selectCar(lineId);
			for (Car car : carListFromDB) {
				GetLineDetailRes.Car transfer = TransferUtils.transfer(car, GetLineDetailRes.Car.class);
				transfer.setIconPath(CommonProperties.picVirtualPath + transfer.getIconPath());
				carList.add(transfer);
			}
			getLineDetailRes.setCarList(carList);
			
			List<GetLineDetailRes.Equipment> equipmentList = new ArrayList<GetLineDetailRes.Equipment>();
			List<Equipment> equipmentListFromDB = lineMapper.selectEquipment(lineId);
			for (Equipment equipment : equipmentListFromDB) {
				GetLineDetailRes.Equipment transfer = TransferUtils.transfer(equipment, GetLineDetailRes.Equipment.class);
				equipmentList.add(transfer);
			}
			getLineDetailRes.setEquipmentList(equipmentList);
			
			List<GetLineDetailRes.Fit> fitList = new ArrayList<GetLineDetailRes.Fit>();
			List<Fit> fitListFromDB = lineMapper.selectFit(lineId);
			for (Fit fit : fitListFromDB) {
				GetLineDetailRes.Fit transfer = TransferUtils.transfer(fit, GetLineDetailRes.Fit.class);
				fitList.add(transfer);
			}
			getLineDetailRes.setFitList(fitList);
			
			
			List<GetLineDetailRes.Person> personList = new ArrayList<GetLineDetailRes.Person>();
			List<Person> personListFromDB = lineMapper.selectPerson(lineId);
			for (Person person : personListFromDB) {
				GetLineDetailRes.Person transfer = TransferUtils.transfer(person, GetLineDetailRes.Person.class);
				personList.add(transfer);
			}
			getLineDetailRes.setPersonList(personList);
			
			List<GetLineDetailRes.Pic> picList = new ArrayList<GetLineDetailRes.Pic>();
			List<Pic> picListFromDB = lineMapper.selectPic(lineId);
			for (Pic pic : picListFromDB) {
				GetLineDetailRes.Pic transfer = TransferUtils.transfer(pic, GetLineDetailRes.Pic.class);
				picList.add(transfer);
			}
			getLineDetailRes.setPicList(picList);
			
			// 线路信息 json 字符串 
			JSONObject lineInfo = new JSONObject();
			lineInfo.put("paramLength", line.getParamLength());
			lineInfo.put("paramMaxGradient", line.getParamMaxGradient());
			lineInfo.put("paramElevation", line.getParamElevation());
			lineInfo.put("paramDowntownDistance", line.getParamDowntownDistance());
			getLineDetailRes.setLineInfo(lineInfo.toString());
			// 路况信息 json 字符串 
			JSONObject roadCondition = new JSONObject();
			roadCondition.put("paramRoadCondition", line.getParamRoadCondition());
			getLineDetailRes.setRoadCondition(roadCondition.toString());
			getLineDetailRes.setWannaNum(line.getWantNo());
			getLineDetailRes.setWanted(line.getWanted());
			
			getLineDetailRes.setCode("0");
			getLineDetailRes.setMsg("获取线路详细信息成功");
			
		}catch(Exception e){
			log.error(JSONObject.fromObject(getLineDetailReq).toString(), e);
			getLineDetailRes.setCode("0");
			getLineDetailRes.setMsg("获取线路详细信息失败");
		}
		return getLineDetailRes;
	}
	
	@Override
	public GetLineAcitivityListRes getLineAcitivityList(GetLineAcitivityListReq getLineAcitivityListReq) {
		GetLineAcitivityListRes getLineAcitivityListRes = new GetLineAcitivityListRes();
		try{
			Long lineId = getLineAcitivityListReq.getLineId();
			RowBounds rowBounds = PageUtils.getRowBounds(getLineAcitivityListReq.getPageNum(), getLineAcitivityListReq.getPageSize(), false);
			List<ActivityType> types = activityMapper.selectActivityTypeByLineId(lineId);
			List<Long> typeIdList = new ArrayList<Long>();
			for (ActivityType activityType : types) {
				typeIdList.add(activityType.getId());
			}
			List<GetLineAcitivityListRes.ActivityCover> listForPage = new ArrayList<GetLineAcitivityListRes.ActivityCover>();
			if (!typeIdList.isEmpty()) {
				List<ActivityCover> listFromDB = activityMapper.selectActivityCoverByTypeIds(typeIdList, rowBounds);
				for (ActivityCover activityCover : listFromDB) {
					listForPage.add(TransferUtils.transfer(activityCover, GetLineAcitivityListRes.ActivityCover.class));
				}
			}
			getLineAcitivityListRes.setActivityCoverList(listForPage);
			getLineAcitivityListRes.setCode("0");
			getLineAcitivityListRes.setMsg("检索线路对应的活动列表成功");
		}catch(Exception e){
			log.error(JSONObject.fromObject(getLineAcitivityListReq).toString(), e);
			getLineAcitivityListRes.setCode("1");
			getLineAcitivityListRes.setMsg("检索线路对应的活动列表失败");
		}
		return getLineAcitivityListRes;
	}
	
	@Override
	public ClickWantGoRes clickWantGo(ClickWantGoReq clickWantGoReq) {
		ClickWantGoRes clickWantGoRes = new ClickWantGoRes();
		try{
			Long lineId = clickWantGoReq.getLineId();
			Long userId = (Long)SecurityUtils.getSubject().getSession().getAttribute("userId");
			
			Nole401WantoExample nole401WantoExample = new Nole401WantoExample();
			nole401WantoExample.createCriteria().andNole200IdEqualTo(userId).andNole400IdEqualTo(lineId);
			long cnt = nole401WantoMapper.countByExample(nole401WantoExample);
			// 已存在，则操作为取消“想去”
			if(cnt > 0) {
				nole401WantoMapper.deleteByExample(nole401WantoExample);
			} 
			// 不存在，则设置为“想去”
			else {
				Nole401Wanto nole401Wanto = new Nole401Wanto();
				nole401Wanto.setNole200Id(userId);
				nole401Wanto.setNole400Id(lineId);
				nole401Wanto.setGmtCreate(new Date());
				nole401WantoMapper.insert(nole401Wanto);
				clickWantGoRes.setCode("0");
				clickWantGoRes.setMsg("操作成功");
			}
		}catch(Exception e){
			log.error(JSONObject.fromObject(clickWantGoReq).toString(), e);
			clickWantGoRes.setCode("1");
			clickWantGoRes.setMsg("操作失败");
		}
		return clickWantGoRes;
	}
	

}
