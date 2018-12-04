package com.jxyd.nole.web.wx.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxyd.nole.bas.log.Log;
import com.jxyd.nole.bas.log.LogFactory;
import com.jxyd.nole.bas.util.TransferUtils;
import com.jxyd.nole.jpa.mybatis.util.PageUtils;
import com.jxyd.nole.jpa.mysql.alpha.raw.mapper.Nole200UserMapper;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole200User;
import com.jxyd.nole.web.wx.controller.TeamController.BingdingMobileReq;
import com.jxyd.nole.web.wx.controller.TeamController.BingdingMobileRes;
import com.jxyd.nole.web.wx.controller.TeamController.CarApplyReq;
import com.jxyd.nole.web.wx.controller.TeamController.CarApplyRes;
import com.jxyd.nole.web.wx.controller.TeamController.ConfigCarTeamReq;
import com.jxyd.nole.web.wx.controller.TeamController.ConfigCarTeamRes;
import com.jxyd.nole.web.wx.controller.TeamController.ConfigFootTeamReq;
import com.jxyd.nole.web.wx.controller.TeamController.ConfigFootTeamRes;
import com.jxyd.nole.web.wx.controller.TeamController.FootApplyReq;
import com.jxyd.nole.web.wx.controller.TeamController.FootApplyRes;
import com.jxyd.nole.web.wx.controller.TeamController.GetAcitivityListReq;
import com.jxyd.nole.web.wx.controller.TeamController.GetAcitivityListRes;
import com.jxyd.nole.web.wx.controller.TeamController.GetApplyInfoReq;
import com.jxyd.nole.web.wx.controller.TeamController.GetApplyInfoRes;
import com.jxyd.nole.web.wx.controller.TeamController.GetBingdingMobileReq;
import com.jxyd.nole.web.wx.controller.TeamController.GetBingdingMobileRes;
import com.jxyd.nole.web.wx.controller.TeamController.GetBrowserReq;
import com.jxyd.nole.web.wx.controller.TeamController.GetBrowserRes;
import com.jxyd.nole.web.wx.controller.TeamController.GetCarActivityBaseReq;
import com.jxyd.nole.web.wx.controller.TeamController.GetCarActivityBaseRes;
import com.jxyd.nole.web.wx.controller.TeamController.GetFootBaseReq;
import com.jxyd.nole.web.wx.controller.TeamController.GetFootBaseRes;
import com.jxyd.nole.web.wx.controller.TeamController.GetLeaveMessageReq;
import com.jxyd.nole.web.wx.controller.TeamController.GetLeaveMessageRes;
import com.jxyd.nole.web.wx.controller.TeamController.GetMyAcitivityListReq;
import com.jxyd.nole.web.wx.controller.TeamController.GetMyAcitivityListRes;
import com.jxyd.nole.web.wx.dto.ActivityCover;
import com.jxyd.nole.web.wx.dto.ActivityType;
import com.jxyd.nole.web.wx.dto.ActivityVersion;
import com.jxyd.nole.web.wx.dto.CarCondition;
import com.jxyd.nole.web.wx.dto.EquipCondition;
import com.jxyd.nole.web.wx.dto.Leave;
import com.jxyd.nole.web.wx.dto.Schedule;
import com.jxyd.nole.web.wx.dto.Seen;
import com.jxyd.nole.web.wx.dto.Signed;
import com.jxyd.nole.web.wx.mysql.alpha.mapper.ActivityMapper;
import com.jxyd.nole.web.wx.property.CommonProperties;
import com.jxyd.nole.web.wx.service.TeamService;
import com.jxyd.nole.web.wx.service.TeamTransaction;
import com.jxyd.nole.web.wx.util.WeixinMiniUtils;

import net.sf.json.JSONObject;

/** 
 * 说明：03组队 服务实现
 * 创建人：zxg
 * 创建时间：2018
 */
@Service
public class TeamServiceImpl implements TeamService {

	private static final Log log = LogFactory.getLog(TeamServiceImpl.class);
	
	@Autowired
	private TeamTransaction teamTransaction;
	
	@Autowired
	private ActivityMapper activityMapper;

	@Autowired
	private Nole200UserMapper nole200UserMapper;

	@Override
	public GetMyAcitivityListRes getMyAcitivityList(GetMyAcitivityListReq getMyAcitivityListReq) {
		GetMyAcitivityListRes getMyAcitivityListRes = new GetMyAcitivityListRes();
		try{
			Long activityTypeId = getMyAcitivityListReq.getActivityTypeId();
			Integer pageNum = getMyAcitivityListReq.getPageNum();
			Integer pageSize = getMyAcitivityListReq.getPageSize();
			Long userId = (Long) SecurityUtils.getSubject().getSession().getAttribute("userId");

			RowBounds rowBounds = PageUtils.getRowBounds(pageNum, pageSize, false);
			List<ActivityCover> listFromDB = activityMapper.selectActivityCoverForUser(userId, activityTypeId, rowBounds);
			List<GetMyAcitivityListRes.ActivityCover> listForPage = new ArrayList<GetMyAcitivityListRes.ActivityCover>();
			for (ActivityCover activityCover : listFromDB) {
				GetMyAcitivityListRes.ActivityCover activityCover_ = TransferUtils.transfer(activityCover, GetMyAcitivityListRes.ActivityCover.class);
				activityCover_.setCoverPicPath(CommonProperties.picVirtualPath + activityCover_.getCoverPicPath());
				listForPage.add(activityCover_);
			}
			getMyAcitivityListRes.setActivityCoverList(listForPage);
			getMyAcitivityListRes.setCode("0");
			getMyAcitivityListRes.setMsg("检索我的活动列表成功");
			
		}catch(Exception e){
			log.error(JSONObject.fromObject(getMyAcitivityListReq).toString(), e);
			getMyAcitivityListRes.setCode("1");
			getMyAcitivityListRes.setMsg("检索我的活动列表失败");
		}
		return getMyAcitivityListRes;
	}
	
	@Override
	public GetAcitivityListRes getAcitivityList(GetAcitivityListReq getAcitivityListReq) {
		GetAcitivityListRes getAcitivityListRes = new GetAcitivityListRes();
		try{
			Long activityTypeId = getAcitivityListReq.getActivityTypeId();
			RowBounds rowBounds = PageUtils.getRowBounds(getAcitivityListReq.getPageNum(), getAcitivityListReq.getPageSize(), false);
			List<GetAcitivityListRes.ActivityCover> listForPage = new ArrayList<GetAcitivityListRes.ActivityCover>();
			List<ActivityCover> listFromDB = activityMapper.selectActivityCoverByTypeId(activityTypeId, rowBounds);
			for (ActivityCover activityCover : listFromDB) {
				GetAcitivityListRes.ActivityCover activityCover_ = TransferUtils.transfer(activityCover, GetAcitivityListRes.ActivityCover.class);
				activityCover_.setCoverPicPath(CommonProperties.picVirtualPath + activityCover_.getCoverPicPath());
				listForPage.add(activityCover_);
			}
			getAcitivityListRes.setActivityCoverList(listForPage);
			getAcitivityListRes.setCode("0");
			getAcitivityListRes.setMsg("检索活动列表成功");
			
		}catch(Exception e){
			log.error(JSONObject.fromObject(getAcitivityListReq).toString(), e);
			getAcitivityListRes.setCode("1");
			getAcitivityListRes.setMsg("检索活动列表失败");
		}
		return getAcitivityListRes;
	}
	
	@Override
	public ConfigCarTeamRes configCarTeam(ConfigCarTeamReq configCarTeamReq) {
		ConfigCarTeamRes configCarTeamRes = new ConfigCarTeamRes();
		try{
			Long userId = (Long)SecurityUtils.getSubject().getSession().getAttribute("userId");
			teamTransaction.configCarTeam(configCarTeamReq,userId);
			
			configCarTeamRes.setCode("0");
			configCarTeamRes.setMsg("配置车辆组队成功");
		}catch(Exception e){
			log.error(JSONObject.fromObject(configCarTeamReq).toString(), e);
			configCarTeamRes.setCode("1");
			configCarTeamRes.setMsg("配置车辆组队失败");
		}
		return configCarTeamRes;
	}
	
	@Override
	public GetCarActivityBaseRes getCarActivityBase(GetCarActivityBaseReq getCarActivityBaseReq) {
		GetCarActivityBaseRes getCarActivityBaseRes = new GetCarActivityBaseRes();
		try{
			Long activityId = getCarActivityBaseReq.getActivityId();
			
			Long userId = (Long)SecurityUtils.getSubject().getSession().getAttribute("userId");
			
			// 可用版本应该只有一个
			ActivityVersion version = activityMapper.selectActivityVersionByActivityId(activityId);
			TransferUtils.transfer(version, getCarActivityBaseRes);
			
			// 所属活动类型
			List<ActivityType> activityTypeList = activityMapper.selectActivityTypeByActivityId(activityId);
			List<GetCarActivityBaseRes.ActivityType> activityTypeList_ = TransferUtils.transfer2list(activityTypeList, GetCarActivityBaseRes.ActivityType.class);
			getCarActivityBaseRes.setActivityTypeList(activityTypeList_);
			
			Long versionId = version.getVersionId();
			// 车辆要求
			List<CarCondition> carConditionList = activityMapper.selectCarConditionByVersionId(versionId);
			List<GetCarActivityBaseRes.CarCondition> carConditionList_ = TransferUtils.transfer2list(carConditionList, GetCarActivityBaseRes.CarCondition.class);
			getCarActivityBaseRes.setCarConditionList(carConditionList_);
			// 装备要求
			List<EquipCondition> equipConditionList = activityMapper.selectEquipConditionByVersionId(versionId, userId);
			List<GetCarActivityBaseRes.EquipCondition> equipConditionList_ = TransferUtils.transfer2list(equipConditionList, GetCarActivityBaseRes.EquipCondition.class);
			getCarActivityBaseRes.setEquipConditionList(equipConditionList_);
			// 行程列表
			List<Schedule> scheduleList = activityMapper.selectScheduleByVersionId(versionId);
			List<GetCarActivityBaseRes.Schedule> scheduleList_ = TransferUtils.transfer2list(scheduleList, GetCarActivityBaseRes.Schedule.class);
			getCarActivityBaseRes.setScheduleList(scheduleList_);
			
		}catch(Exception e){
			log.error(JSONObject.fromObject(getCarActivityBaseReq).toString(), e);
		}
		return getCarActivityBaseRes;
	}
	
	@Override
	public ConfigFootTeamRes configFootTeam(ConfigFootTeamReq configFootTeamReq) {
		ConfigFootTeamRes configFootTeamRes = new ConfigFootTeamRes();
		try{
			Long userId = (Long)SecurityUtils.getSubject().getSession().getAttribute("userId");
			teamTransaction.configFootTeam(configFootTeamReq,userId);
			
			configFootTeamRes.setCode("0");
			configFootTeamRes.setMsg("配置车辆组队成功");
		}catch(Exception e){
			log.error(JSONObject.fromObject(configFootTeamReq).toString(), e);
			configFootTeamRes.setCode("1");
			configFootTeamRes.setMsg("配置徒步组队失败");
		}
		return configFootTeamRes;
	}
	
	@Override
	public GetFootBaseRes getFootBase(GetFootBaseReq getFootBaseReq) {
		GetFootBaseRes getFootBaseRes = new GetFootBaseRes();
		try{
			Long activityId = getFootBaseReq.getActivityId();
			
			Long userId = (Long)SecurityUtils.getSubject().getSession().getAttribute("userId");
			
			// 可用版本应该只有一个
			ActivityVersion version = activityMapper.selectActivityVersionByActivityId(activityId);
			TransferUtils.transfer(version, getFootBaseRes);
			
			// 所属活动类型
			List<ActivityType> activityTypeList = activityMapper.selectActivityTypeByActivityId(activityId);
			List<GetFootBaseRes.ActivityType> activityTypeList_ = TransferUtils.transfer2list(activityTypeList, GetFootBaseRes.ActivityType.class);
			getFootBaseRes.setActivityTypeList(activityTypeList_);
			
			Long versionId = version.getVersionId();
			// 装备要求
			List<EquipCondition> equipConditionList = activityMapper.selectEquipConditionByVersionId(versionId, userId);
			List<GetFootBaseRes.EquipCondition> equipConditionList_ = TransferUtils.transfer2list(equipConditionList, GetFootBaseRes.EquipCondition.class);
			getFootBaseRes.setEquipConditionList(equipConditionList_);
			// 行程列表
			List<Schedule> scheduleList = activityMapper.selectScheduleByVersionId(versionId);
			List<GetFootBaseRes.Schedule> scheduleList_ = TransferUtils.transfer2list(scheduleList, GetFootBaseRes.Schedule.class);
			getFootBaseRes.setScheduleList(scheduleList_);
		}catch(Exception e){
			log.error(JSONObject.fromObject(getFootBaseReq).toString(), e);
		}
		return getFootBaseRes;
	}
	
	@Override
	public BingdingMobileRes bingdingMobile(BingdingMobileReq bingdingMobileReq) {
		BingdingMobileRes bingdingMobileRes = new BingdingMobileRes();
		try{
			String encryptedData = bingdingMobileReq.getEncryptedData();
			String iv = bingdingMobileReq.getIv();
			Session session = SecurityUtils.getSubject().getSession();
			Long userId = (Long)session.getAttribute("userId");
			String sessionKey = (String)session.getAttribute("session_key");
			String decrypted = WeixinMiniUtils.decrypt(encryptedData, sessionKey, iv);
			/* 
			{
			    "phoneNumber": "13580006666",  
			    "purePhoneNumber": "13580006666", 
			    "countryCode": "86",
			    "watermark":
			    {
			        "appid":"APPID",
			        "timestamp":TIMESTAMP
			    }
			}
			*/
			JSONObject json = JSONObject.fromObject(decrypted);
			String phoneNumber = json.getString("purePhoneNumber");
			Nole200User nole200User4update = new Nole200User();
			nole200User4update.setId(userId);
			nole200User4update.setGmtModified(new Date());
			nole200User4update.setMobile(phoneNumber);
			nole200UserMapper.updateByPrimaryKeySelective(nole200User4update);
			// 返回 
			bingdingMobileRes.setCode("0");
			bingdingMobileRes.setMsg("绑定手机号成功");
			bingdingMobileRes.setMobile(phoneNumber);
		}catch(Exception e){
			log.error(JSONObject.fromObject(bingdingMobileReq).toString(), e);
			bingdingMobileRes.setCode("1");
			bingdingMobileRes.setMsg("绑定手机号失败");
		}
		return bingdingMobileRes;
	}
	
	@Override
	public GetApplyInfoRes getApplyInfo(GetApplyInfoReq getApplyInfoReq) {
		GetApplyInfoRes getApplyInfoRes = new GetApplyInfoRes();
		try{
			Long activityId = getApplyInfoReq.getActivityId();
			ActivityVersion version = activityMapper.selectActivityVersionByActivityId(activityId);
			
			getApplyInfoRes.setSignedNo(version.getApplyNo());
			getApplyInfoRes.setSignMaxNo(version.getMaxNo());
			
			List<Signed> applyList = activityMapper.selectApplyByActivityId(activityId);
			List<GetApplyInfoRes.Signed> applyList_ = TransferUtils.transfer2list(applyList, GetApplyInfoRes.Signed.class);
			getApplyInfoRes.setSignedList(applyList_);
			
		}catch(Exception e){
			log.error(JSONObject.fromObject(getApplyInfoReq).toString(), e);
		}
		return getApplyInfoRes;
	}
	
	@Override
	public GetLeaveMessageRes getLeaveMessage(GetLeaveMessageReq getLeaveMessageReq) {
		GetLeaveMessageRes getLeaveMessageRes = new GetLeaveMessageRes();
		try{
			Long activityId = getLeaveMessageReq.getActivityId();
			List<Leave> msgList = activityMapper.selectActivityLeaveMsg(activityId);
			List<GetLeaveMessageRes.Msg> msgList_ = TransferUtils.transfer2list(msgList, GetLeaveMessageRes.Msg.class);
			for (GetLeaveMessageRes.Msg msg : msgList_) {
				String pic = msg.getPic();
				if(pic != null) {
					msg.setPic(CommonProperties.picVirtualPath + pic);
				}
			}
			getLeaveMessageRes.setMsgList(msgList_);
		}catch(Exception e){
			log.error(JSONObject.fromObject(getLeaveMessageReq).toString(), e);
		}
		return getLeaveMessageRes;
	}
	
	@Override
	public GetBrowserRes getBrowser(GetBrowserReq getBrowserReq) {
		GetBrowserRes getBrowserRes = new GetBrowserRes();
		try{
			Long activityId = getBrowserReq.getActivityId();
			List<Seen> seenList = activityMapper.selectSeenByActivityId(activityId);
			List<GetBrowserRes.Seen> seenList_ = TransferUtils.transfer2list(seenList, GetBrowserRes.Seen.class);
			getBrowserRes.setSeenList(seenList_);
		}catch(Exception e){
			log.error(JSONObject.fromObject(getBrowserReq).toString(), e);
		}
		return getBrowserRes;
	}
	
	@Override
	public GetBingdingMobileRes getBingdingMobile(GetBingdingMobileReq getBingdingMobileReq) {
		GetBingdingMobileRes getBingdingMobileRes = new GetBingdingMobileRes();
		try{
			Session session = SecurityUtils.getSubject().getSession();
			Long userId = (Long)session.getAttribute("userId");
			Nole200User nole200User = nole200UserMapper.selectByPrimaryKey(userId);
			String mobile = nole200User.getMobile();
			
			getBingdingMobileRes.setCode("0");
			getBingdingMobileRes.setMsg(mobile == null ? "获取绑定手机成功" : "未绑定手机");
			getBingdingMobileRes.setMobile(mobile);
		}catch(Exception e){
			log.error(JSONObject.fromObject(getBingdingMobileReq).toString(), e);
			getBingdingMobileRes.setCode("1");
			getBingdingMobileRes.setMsg("获取绑定手机号码失败");
		}
		return getBingdingMobileRes;
	}
	
	@Override
	public CarApplyRes carApply(CarApplyReq carApplyReq) {
		CarApplyRes carApplyRes = new CarApplyRes();
		try{
			Long activityId = carApplyReq.getActivityId();
			// 校验是否可以报名
			String status = activityMapper.selectActivityStatus(activityId);
			if(!"报名中".equals(status)) {
				carApplyRes.setCode("0");
				carApplyRes.setMsg("当前不能报名");
				return carApplyRes;
			}
			
			Session session = SecurityUtils.getSubject().getSession();
			Long userId = (Long)session.getAttribute("userId");
			teamTransaction.carApply(carApplyReq,userId);
			// 结果
			carApplyRes.setCode("0");
			carApplyRes.setMsg("报名成功");
			
		}catch(Exception e){
			log.error(JSONObject.fromObject(carApplyReq).toString(), e);
			carApplyRes.setCode("1");
			carApplyRes.setMsg("报名失败");
		}
		return carApplyRes;
	}
	
	@Override
	public FootApplyRes footApply(FootApplyReq footApplyReq) {
		FootApplyRes footApplyRes = new FootApplyRes();
		try{
			Long activityId = footApplyReq.getActivityId();
			
			// 校验是否可以报名
			String status = activityMapper.selectActivityStatus(activityId);
			if(!"报名中".equals(status)) {
				footApplyRes.setCode("0");
				footApplyRes.setMsg("当前不能报名");
				return footApplyRes;
			}
			
			
			Session session = SecurityUtils.getSubject().getSession();
			Long userId = (Long)session.getAttribute("userId");
			// 事务 
			teamTransaction.footApply(footApplyReq, userId);
			// 结果
			footApplyRes.setCode("0");
			footApplyRes.setMsg("报名成功");
		}catch(Exception e){
			log.error(JSONObject.fromObject(footApplyReq).toString(), e);
			footApplyRes.setCode("1");
			footApplyRes.setMsg("报名失败");
		}
		return footApplyRes;
	}
	

}
