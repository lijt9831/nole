package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole403LineSchedule;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole403LineScheduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole403LineScheduleMapper {
    long countByExample(Nole403LineScheduleExample example);

    int deleteByExample(Nole403LineScheduleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole403LineSchedule record);

    int insertSelective(Nole403LineSchedule record);

    List<Nole403LineSchedule> selectByExampleWithRowbounds(Nole403LineScheduleExample example, RowBounds rowBounds);

    List<Nole403LineSchedule> selectByExample(Nole403LineScheduleExample example);

    Nole403LineSchedule selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole403LineSchedule record, @Param("example") Nole403LineScheduleExample example);

    int updateByExample(@Param("record") Nole403LineSchedule record, @Param("example") Nole403LineScheduleExample example);

    int updateByPrimaryKeySelective(Nole403LineSchedule record);

    int updateByPrimaryKey(Nole403LineSchedule record);

    Nole403LineSchedule selectByIndex1(@Param("nole400Id")Long nole400Id,@Param("daynum")Integer daynum);
}