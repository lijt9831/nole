package com.jxyd.nole.web.wx.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jxyd.nole.bas.util.DateUtils;
import com.jxyd.nole.jpa.mysql.alpha.raw.mapper.Nole200UserMapper;
import com.jxyd.nole.jpa.mysql.alpha.raw.mapper.Nole301ActivityMapper;
import com.jxyd.nole.jpa.mysql.alpha.raw.mapper.Nole302ActivityStatusMapper;
import com.jxyd.nole.jpa.mysql.alpha.raw.mapper.Nole304ActivityVersionMapper;
import com.jxyd.nole.jpa.mysql.alpha.raw.mapper.Nole305ActivityScheduleMapper;
import com.jxyd.nole.jpa.mysql.alpha.raw.mapper.Nole309ActivityApplyMapper;
import com.jxyd.nole.jpa.mysql.alpha.raw.mapper.Nole311RecommendCarMapper;
import com.jxyd.nole.jpa.mysql.alpha.raw.mapper.Nole312RecommendEquipMapper;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole200User;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole301Activity;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole302ActivityStatus;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole304ActivityVersion;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole305ActivitySchedule;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole309ActivityApply;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole311RecommendCar;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole312RecommendEquip;
import com.jxyd.nole.web.wx.controller.TeamController.CarApplyReq;
import com.jxyd.nole.web.wx.controller.TeamController.ConfigCarTeamReq;
import com.jxyd.nole.web.wx.controller.TeamController.ConfigFootTeamReq;
import com.jxyd.nole.web.wx.controller.TeamController.FootApplyReq;
import com.jxyd.nole.web.wx.mysql.alpha.mapper.ActivityMapper;
import com.jxyd.nole.web.wx.service.TeamTransaction;

/** 
 * 说明：03组队 事务实现
 * 创建人：zxg
 * 创建时间：2018
 */
@Service
@Transactional
public class TeamTransactionImpl implements TeamTransaction {
	
	@Autowired
	private Nole301ActivityMapper nole301ActivityMapper;
	@Autowired
	private Nole302ActivityStatusMapper nole302ActivityStatusMapper;
	@Autowired
	private Nole304ActivityVersionMapper nole304ActivityVersionMapper;
	@Autowired
	private Nole311RecommendCarMapper nole311RecommendCarMapper;
	@Autowired
	private Nole312RecommendEquipMapper nole312RecommendEquipMapper;
	@Autowired
	private Nole305ActivityScheduleMapper nole305ActivityScheduleMapper;
	@Autowired
	private Nole309ActivityApplyMapper nole309ActivityApplyMapper;
	@Autowired
	private Nole200UserMapper nole200UserMapper;
	@Autowired
	private ActivityMapper activityMapper;
	
	

	@Override
	public void configCarTeam(ConfigCarTeamReq configCarTeamReq,Long userId) {
		
		Date date = new Date();
		
		// ------- 新增活动 ------
		Long activityTypeId = configCarTeamReq.getActivityTypeId();
		Long lineId = configCarTeamReq.getLineId();
		Nole301Activity nole301Activity4insert = new Nole301Activity();
		nole301Activity4insert.setNole200Id(userId);
		nole301Activity4insert.setNole300Id(activityTypeId);
		nole301Activity4insert.setNole400Id(lineId);
		nole301Activity4insert.setGmtCreate(date);
		nole301ActivityMapper.insert(nole301Activity4insert);
		
		Long nole301_id = nole301Activity4insert.getId();
		// ------- 新增活动状态 ----
		Nole302ActivityStatus nole302ActivityStatus4insert = new Nole302ActivityStatus();
		nole302ActivityStatus4insert.setAvailableOrNot("Y");
		nole302ActivityStatus4insert.setGmtCreate(date);
		nole302ActivityStatus4insert.setNole301Id(nole301_id);
		nole302ActivityStatus4insert.setStatus("0");// 未公开
		nole302ActivityStatusMapper.insert(nole302ActivityStatus4insert);
		
		// ------ 新增活动版本 -----
		Nole304ActivityVersion nole304ActivityVersion4insert = new Nole304ActivityVersion();
		nole304ActivityVersion4insert.setNole301Id(nole301_id);
		nole304ActivityVersion4insert.setOnsaleOrNot("N");
		nole304ActivityVersion4insert.setVersion(1);// 初版
		nole304ActivityVersion4insert.setRemark(configCarTeamReq.getRemark());
		nole304ActivityVersion4insert.setParticipantNo(0);
		nole304ActivityVersion4insert.setShouldNo(0);
		nole304ActivityVersion4insert.setActualNo(0);
		nole304ActivityVersion4insert.setGmtCreate(date);
		nole304ActivityVersion4insert.setGmtModified(date);
		nole304ActivityVersion4insert.setAvailableOrNot("Y");
		nole304ActivityVersion4insert.setActivitySubject(configCarTeamReq.getTitle());
		nole304ActivityVersion4insert.setActivityStart(DateUtils.parse(configCarTeamReq.getActivityStart(), DateUtils.TIME_3));
		nole304ActivityVersion4insert.setActivityEnd(DateUtils.parse(configCarTeamReq.getActivityEnd(), DateUtils.TIME_3));
		nole304ActivityVersion4insert.setGatherPoint(configCarTeamReq.getGatherPoint());
		nole304ActivityVersion4insert.setGatherTime(DateUtils.parse(configCarTeamReq.getGatherTime(), DateUtils.TIME_3));
		nole304ActivityVersion4insert.setFrequencyBand(configCarTeamReq.getChannel());
		nole304ActivityVersion4insert.setApplyNo(0);
		nole304ActivityVersion4insert.setMaxNo(configCarTeamReq.getMaxCarNo());
		nole304ActivityVersion4insert.setFrontMoney(BigDecimal.valueOf(Long.valueOf(configCarTeamReq.getFrontMoney())));
		nole304ActivityVersion4insert.setHandUp(date);
		nole304ActivityVersion4insert.setHandDown(DateUtils.parse(configCarTeamReq.getSignEnd(), DateUtils.TIME_3));
		nole304ActivityVersionMapper.insert(nole304ActivityVersion4insert);
		
		Long nole304_id = nole304ActivityVersion4insert.getId();
		// ----新增推荐车辆 -----
		List<ConfigCarTeamReq.CarCondition> carConditionList = configCarTeamReq.getCarConditionList();
		for (ConfigCarTeamReq.CarCondition carCondition : carConditionList) {
			Nole311RecommendCar nole311RecommendCar4insert = new Nole311RecommendCar();
			nole311RecommendCar4insert.setNole015Id(carCondition.getId());
			nole311RecommendCar4insert.setNole304Id(nole304_id);
			nole311RecommendCar4insert.setGmtCreate(date);
			nole311RecommendCarMapper.insert(nole311RecommendCar4insert);
		}
		// ---- 新增推荐装备 ---
		List<ConfigCarTeamReq.EquipCondition> equipConditionList = configCarTeamReq.getEquipConditionList();
		for (ConfigCarTeamReq.EquipCondition equipCondition : equipConditionList) {
			Nole312RecommendEquip nole312RecommendEquip4insert = new Nole312RecommendEquip();
			nole312RecommendEquip4insert.setGmtCreate(date);
			nole312RecommendEquip4insert.setNole304Id(nole304_id);
			nole312RecommendEquip4insert.setNole016Id(equipCondition.getId());
			nole312RecommendEquipMapper.insert(nole312RecommendEquip4insert);
		}
		// ---- 新增日程 ----
		List<ConfigCarTeamReq.Schedule> scheduleList = configCarTeamReq.getScheduleList();
		for (ConfigCarTeamReq.Schedule schedule : scheduleList) {
			Nole305ActivitySchedule nole305ActivitySchedule4insert = new Nole305ActivitySchedule();
			nole305ActivitySchedule4insert.setDaynum(schedule.getDay());
			nole305ActivitySchedule4insert.setDescription(schedule.getDesc());
			nole305ActivitySchedule4insert.setDestination(schedule.getDestination());
			nole305ActivitySchedule4insert.setGmtCreate(date);
			nole305ActivitySchedule4insert.setGmtModified(date);
			nole305ActivitySchedule4insert.setNole304Id(nole304_id);
			nole305ActivityScheduleMapper.insert(nole305ActivitySchedule4insert);
		}
		
	}

	@Override
	public void footApply(FootApplyReq footApplyReq, Long userId) {

		Long activityId = footApplyReq.getActivityId();
		
		Date date = new Date();
		
		
		// 真实姓名
		Nole200User nole200User4update = new Nole200User();
		nole200User4update.setId(userId);
		nole200User4update.setGmtModified(date);
		nole200User4update.setTruename(footApplyReq.getTrueName());
		nole200UserMapper.updateByPrimaryKeySelective(nole200User4update);
		
		// 报名 
		Nole309ActivityApply nole309ActivityApply4insert = new Nole309ActivityApply();
		nole309ActivityApply4insert.setGmtCreate(date);
		nole309ActivityApply4insert.setNole200Id(userId);
		nole309ActivityApply4insert.setNole301Id(activityId);
		nole309ActivityApply4insert.setRemark(footApplyReq.getRemark());
		nole309ActivityApplyMapper.insert(nole309ActivityApply4insert);
		
		// 已报名人数 + 1 ，如果此时失败则达到上限，需抛出异常
		int result = activityMapper.updateApplayNo(activityId);
		if(result != 1) {
			throw new RuntimeException("报名人数已达上限");
		}
	}

	@Override
	public void carApply(CarApplyReq carApplyReq, Long userId) {
		
		Long activityId = carApplyReq.getActivityId();
		// 报名 
		Nole309ActivityApply nole309ActivityApply4insert = new Nole309ActivityApply();
		nole309ActivityApply4insert.setCar(carApplyReq.getCarType());
		nole309ActivityApply4insert.setGmtCreate(new Date());
		nole309ActivityApply4insert.setNole200Id(userId);
		nole309ActivityApply4insert.setNole301Id(activityId);
		nole309ActivityApply4insert.setRemark(carApplyReq.getRemark());
		nole309ActivityApplyMapper.insert(nole309ActivityApply4insert);
		
		// 已报名人数 + 1 ，如果此时失败则达到上限，需抛出异常
		int result = activityMapper.updateApplayNo(activityId);
		if(result != 1) {
			throw new RuntimeException("报名人数已达上限");
		}
	}

	@Override
	public void configFootTeam(ConfigFootTeamReq configFootTeamReq, Long userId) {
		Date date = new Date();
		
		// ------- 新增活动 ------
		Long activityTypeId = configFootTeamReq.getActivityTypeId();
		Long lineId = configFootTeamReq.getLineId();
		Nole301Activity nole301Activity4insert = new Nole301Activity();
		nole301Activity4insert.setNole200Id(userId);
		nole301Activity4insert.setNole300Id(activityTypeId);
		nole301Activity4insert.setNole400Id(lineId);
		nole301Activity4insert.setGmtCreate(date);
		nole301ActivityMapper.insert(nole301Activity4insert);
		
		Long nole301_id = nole301Activity4insert.getId();
		// ------- 新增活动状态 ----
		Nole302ActivityStatus nole302ActivityStatus4insert = new Nole302ActivityStatus();
		nole302ActivityStatus4insert.setAvailableOrNot("Y");
		nole302ActivityStatus4insert.setGmtCreate(date);
		nole302ActivityStatus4insert.setNole301Id(nole301_id);
		nole302ActivityStatus4insert.setStatus("0");// 未公开
		nole302ActivityStatusMapper.insert(nole302ActivityStatus4insert);
		
		// ------ 新增活动版本 -----
		Nole304ActivityVersion nole304ActivityVersion4insert = new Nole304ActivityVersion();
		nole304ActivityVersion4insert.setNole301Id(nole301_id);
		nole304ActivityVersion4insert.setOnsaleOrNot("N");
		nole304ActivityVersion4insert.setVersion(1);// 初版
		nole304ActivityVersion4insert.setRemark(configFootTeamReq.getRemark());
		nole304ActivityVersion4insert.setParticipantNo(0);
		nole304ActivityVersion4insert.setShouldNo(0);
		nole304ActivityVersion4insert.setActualNo(0);
		nole304ActivityVersion4insert.setGmtCreate(date);
		nole304ActivityVersion4insert.setGmtModified(date);
		nole304ActivityVersion4insert.setAvailableOrNot("Y");
		nole304ActivityVersion4insert.setActivitySubject(configFootTeamReq.getTitle());
		nole304ActivityVersion4insert.setActivityStart(DateUtils.parse(configFootTeamReq.getActivityStart(), DateUtils.TIME_3));
		nole304ActivityVersion4insert.setActivityEnd(DateUtils.parse(configFootTeamReq.getActivityEnd(), DateUtils.TIME_3));
		nole304ActivityVersion4insert.setGatherPoint(configFootTeamReq.getGatherPoint());
		nole304ActivityVersion4insert.setGatherTime(DateUtils.parse(configFootTeamReq.getGatherTime(), DateUtils.TIME_3));
		nole304ActivityVersion4insert.setApplyNo(0);
		nole304ActivityVersion4insert.setMaxNo(Integer.valueOf(configFootTeamReq.getMaxPeopleNo()));
		nole304ActivityVersion4insert.setFrontMoney(BigDecimal.valueOf(Long.valueOf(configFootTeamReq.getFrontMoney())));
		nole304ActivityVersion4insert.setHandUp(date);
		nole304ActivityVersion4insert.setHandDown(DateUtils.parse(configFootTeamReq.getSignEnd(), DateUtils.TIME_3));
		nole304ActivityVersion4insert.setPowerCondition(configFootTeamReq.getPowerCondition());
		nole304ActivityVersionMapper.insert(nole304ActivityVersion4insert);
		
		Long nole304_id = nole304ActivityVersion4insert.getId();
		// ---- 新增推荐装备 ---
		List<ConfigFootTeamReq.EquipCondition> equipConditionList = configFootTeamReq.getEquipConditionList();
		for (ConfigFootTeamReq.EquipCondition equipCondition : equipConditionList) {
			Nole312RecommendEquip nole312RecommendEquip4insert = new Nole312RecommendEquip();
			nole312RecommendEquip4insert.setGmtCreate(date);
			nole312RecommendEquip4insert.setNole304Id(nole304_id);
			nole312RecommendEquip4insert.setNole016Id(equipCondition.getId());
			nole312RecommendEquipMapper.insert(nole312RecommendEquip4insert);
		}
		// ---- 新增日程 ----
		List<ConfigFootTeamReq.Schedule> scheduleList = configFootTeamReq.getScheduleList();
		for (ConfigFootTeamReq.Schedule schedule : scheduleList) {
			Nole305ActivitySchedule nole305ActivitySchedule4insert = new Nole305ActivitySchedule();
			nole305ActivitySchedule4insert.setDaynum(schedule.getDay());
			nole305ActivitySchedule4insert.setDescription(schedule.getDesc());
			nole305ActivitySchedule4insert.setDestination(schedule.getDestination());
			nole305ActivitySchedule4insert.setGmtCreate(date);
			nole305ActivitySchedule4insert.setGmtModified(date);
			nole305ActivitySchedule4insert.setNole304Id(nole304_id);
			nole305ActivityScheduleMapper.insert(nole305ActivitySchedule4insert);
		}
		
	}
	
	
	
	
}
