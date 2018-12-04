package com.jxyd.nole.web.wx.mysql.alpha.mapper;

import static org.junit.Assert.*;

import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.jxyd.nole.jpa.mybatis.util.PageUtils;

@ContextConfiguration(locations = {"classpath*:spring/root/public_*.xml","classpath:spring/root/private_*"})
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class LineMapperTest {

	@Autowired
	LineMapper lineMapper;
	
	@Test
	public void testSelectHotList() {
		RowBounds rowBounds = PageUtils.getRowBounds(1);
		lineMapper.selectHotList(rowBounds);
	}

	@Test
	public void testSelectLineCoverById() {
		lineMapper.selectLineCoverById(1L);
	}

	@Test
	public void testSelectLineCoverByTypeId() {
		RowBounds rowBounds = PageUtils.getRowBounds(1);
		lineMapper.selectLineCoverByTypeId(1L, rowBounds);
	}

	@Test
	public void testSelectLine() {
		lineMapper.selectLine(1L, 1L);
	}

	@Test
	public void testSelectLineCoverWantgo() {
		RowBounds rowBounds = PageUtils.getRowBounds(1);
		lineMapper.selectLineCoverWantgo(1L, rowBounds);
	}

	@Test
	public void testSelectCar() {
		lineMapper.selectCar(1L);
	}

	@Test
	public void testSelectEquipment() {
		lineMapper.selectEquipment(1L);
	}

	@Test
	public void testSelectFit() {
		lineMapper.selectFit(1L);
	}

	@Test
	public void testSelectPerson() {
		lineMapper.selectPerson(1L);
	}

	@Test
	public void testSelectPic() {
		lineMapper.selectPic(1L);
	}
}
