package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole300ActivityType;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole300ActivityTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole300ActivityTypeMapper {
    long countByExample(Nole300ActivityTypeExample example);

    int deleteByExample(Nole300ActivityTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole300ActivityType record);

    int insertSelective(Nole300ActivityType record);

    List<Nole300ActivityType> selectByExampleWithRowbounds(Nole300ActivityTypeExample example, RowBounds rowBounds);

    List<Nole300ActivityType> selectByExample(Nole300ActivityTypeExample example);

    Nole300ActivityType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole300ActivityType record, @Param("example") Nole300ActivityTypeExample example);

    int updateByExample(@Param("record") Nole300ActivityType record, @Param("example") Nole300ActivityTypeExample example);

    int updateByPrimaryKeySelective(Nole300ActivityType record);

    int updateByPrimaryKey(Nole300ActivityType record);

    Nole300ActivityType selectByIndex1(@Param("activityType")String activityType);
}