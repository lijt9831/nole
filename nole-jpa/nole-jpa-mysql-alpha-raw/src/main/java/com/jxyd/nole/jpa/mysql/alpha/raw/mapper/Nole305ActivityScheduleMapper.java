package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole305ActivitySchedule;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole305ActivityScheduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole305ActivityScheduleMapper {
    long countByExample(Nole305ActivityScheduleExample example);

    int deleteByExample(Nole305ActivityScheduleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole305ActivitySchedule record);

    int insertSelective(Nole305ActivitySchedule record);

    List<Nole305ActivitySchedule> selectByExampleWithRowbounds(Nole305ActivityScheduleExample example, RowBounds rowBounds);

    List<Nole305ActivitySchedule> selectByExample(Nole305ActivityScheduleExample example);

    Nole305ActivitySchedule selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole305ActivitySchedule record, @Param("example") Nole305ActivityScheduleExample example);

    int updateByExample(@Param("record") Nole305ActivitySchedule record, @Param("example") Nole305ActivityScheduleExample example);

    int updateByPrimaryKeySelective(Nole305ActivitySchedule record);

    int updateByPrimaryKey(Nole305ActivitySchedule record);

    Nole305ActivitySchedule selectByIndex1(@Param("nole304Id")Long nole304Id,@Param("daynum")Integer daynum);
}