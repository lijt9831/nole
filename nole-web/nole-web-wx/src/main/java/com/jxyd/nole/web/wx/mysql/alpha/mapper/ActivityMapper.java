package com.jxyd.nole.web.wx.mysql.alpha.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.jxyd.nole.web.wx.dto.ActivityCover;
import com.jxyd.nole.web.wx.dto.ActivityType;
import com.jxyd.nole.web.wx.dto.ActivityVersion;
import com.jxyd.nole.web.wx.dto.Signed;
import com.jxyd.nole.web.wx.dto.CarCondition;
import com.jxyd.nole.web.wx.dto.EquipCondition;
import com.jxyd.nole.web.wx.dto.HotActivityStandard;
import com.jxyd.nole.web.wx.dto.Leave;
import com.jxyd.nole.web.wx.dto.Msg;
import com.jxyd.nole.web.wx.dto.Schedule;
import com.jxyd.nole.web.wx.dto.Seen;

public interface ActivityMapper {

	List<ActivityType> selectActivityTypeByLineId(@Param("lineId") Long lineId);

	List<ActivityType> selectActivityTypeByUserId(@Param("userId") Long userId);

	List<ActivityType> selectActivityTypeByActivityId(@Param("activityId") Long activityId);

	List<ActivityType> selectActivityType();
	
	List<HotActivityStandard> selectHotList(RowBounds rowBounds);
	
	ActivityCover selectActivityCoverById(@Param("id") Long id);

	List<ActivityCover> selectActivityCoverByTypeId(@Param("typeId")Long typeId, RowBounds rowBounds);

	/**
	 * 我最新发起的 （受活动类型影响）
	 * @param userId 
	 * @param typeId 活动类型ID可以为null，此时检索该用户的所有活动
	 * @param rowBounds 
	 * @return
	 */
	List<ActivityCover> selectActivityCoverForUser(@Param("userId")Long userId,@Param("typeId") Long typeId, RowBounds rowBounds);

	List<ActivityCover> selectActivityCoverByTypeIds(@Param("typeIds")List<Long> typeIds, RowBounds rowBounds);
	
	ActivityVersion selectActivityVersionByActivityId(@Param("activityId") Long activityId);
	
	List<CarCondition> selectCarConditionByVersionId(@Param("versionId") Long versionId);
	
	List<EquipCondition> selectEquipConditionByVersionId(@Param("versionId") Long versionId,@Param("userId") Long userId);
	
	List<Schedule> selectScheduleByVersionId(@Param("versionId") Long versionId);
	
	
	
	List<Seen> selectSeenByActivityId(@Param("activityId") Long activityId);
	
	String selectActivityStatus(@Param("activityId") Long activityId);
	
	int updateApplayNo(@Param("activityId") Long activityId);
	
	List<Signed> selectApplyByActivityId(@Param("activityId") Long activityId);
	
	List<Leave> selectActivityLeaveMsg(@Param("activityId") Long activityId);
	
}
