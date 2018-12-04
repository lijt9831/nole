package com.jxyd.nole.web.wx.mysql.alpha.mapper;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.jxyd.nole.jpa.mybatis.util.PageUtils;
import com.jxyd.nole.web.wx.dto.ActivityCover;
import com.jxyd.nole.web.wx.dto.ActivityType;
import com.jxyd.nole.web.wx.dto.HotActivityStandard;

@ContextConfiguration(locations = {"classpath*:spring/root/public_*.xml","classpath:spring/root/private_*"})
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class ActivityMapperTest {

	@Autowired
	private ActivityMapper activityMapper;
	
	@Test
	public void testSelectActivityTypeByLineId() {
		List<ActivityType> selectActivityTypeByLineId = activityMapper.selectActivityTypeByLineId(1L);
		System.out.println(selectActivityTypeByLineId);
	}

	@Test
	public void testSelectActivityTypeByUserId() {
		List<ActivityType> selectActivityTypeByUserId = activityMapper.selectActivityTypeByUserId(1L);
		System.out.println(selectActivityTypeByUserId);
	}

	@Test
	public void testSelectActivityType() {
		List<ActivityType> selectActivityType = activityMapper.selectActivityType();
		System.out.println(selectActivityType);
	}
	

	@Test
	public void testSelectHotList() {
		RowBounds rowBounds = PageUtils.getRowBounds(1);
		List<HotActivityStandard> selectHotList = activityMapper.selectHotList(rowBounds);
		System.out.println(selectHotList);
	}

	@Test
	public void testSelectActivityCoverById() {
		ActivityCover selectActivityCoverById = activityMapper.selectActivityCoverById(1L);
		System.out.println(selectActivityCoverById);
	}

	@Test
	public void testSelectActivityCoverByTypeId() {
		RowBounds rowBounds = PageUtils.getRowBounds(1);
		activityMapper.selectActivityCoverByTypeId(1L,rowBounds);
	}

	@Test
	public void testSelectActivityList() {
	}

	@Test
	public void testSelectActivityCoverByTypeIds() {
		RowBounds rowBounds = PageUtils.getRowBounds(1);
		List<Long> list = new ArrayList<Long>();
		list.add(1L);
		activityMapper.selectActivityCoverByTypeIds(list, rowBounds);
	}
	
	@Test
	public void testSelectActivityCoverForUser() {
		RowBounds rowBounds = PageUtils.getRowBounds(1);
		activityMapper.selectActivityCoverForUser(1L,1L,rowBounds);
	}

}
