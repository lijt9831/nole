package com.jxyd.nole.web.wx.mysql.alpha.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.jxyd.nole.web.wx.dto.Car;
import com.jxyd.nole.web.wx.dto.Equipment;
import com.jxyd.nole.web.wx.dto.Fit;
import com.jxyd.nole.web.wx.dto.HotLineStandard;
import com.jxyd.nole.web.wx.dto.Line;
import com.jxyd.nole.web.wx.dto.LineCover;
import com.jxyd.nole.web.wx.dto.Person;
import com.jxyd.nole.web.wx.dto.Pic;

public interface LineMapper {

	List<HotLineStandard> selectHotList(RowBounds rowBounds);
	
	LineCover selectLineCoverById(@Param("id") Long id);

	List<LineCover> selectLineCoverByTypeId(@Param("typeId")Long typeId, RowBounds rowBounds);

	List<LineCover> selectLineCoverWantgo(@Param("userId")Long userId, RowBounds rowBounds);
	
	Line selectLine(@Param("lineId")Long lineId,@Param("userId")Long userId);
	
	List<Car> selectCar(@Param("lineId")Long lineId);
	List<Equipment> selectEquipment(@Param("lineId")Long lineId);
	List<Fit> selectFit(@Param("lineId")Long lineId);
	List<Person> selectPerson(@Param("lineId")Long lineId);
	List<Pic> selectPic(@Param("lineId")Long lineId);
	
	
}
