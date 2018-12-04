package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole017Loop;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole017LoopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole017LoopMapper {
    long countByExample(Nole017LoopExample example);

    int deleteByExample(Nole017LoopExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole017Loop record);

    int insertSelective(Nole017Loop record);

    List<Nole017Loop> selectByExampleWithRowbounds(Nole017LoopExample example, RowBounds rowBounds);

    List<Nole017Loop> selectByExample(Nole017LoopExample example);

    Nole017Loop selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole017Loop record, @Param("example") Nole017LoopExample example);

    int updateByExample(@Param("record") Nole017Loop record, @Param("example") Nole017LoopExample example);

    int updateByPrimaryKeySelective(Nole017Loop record);

    int updateByPrimaryKey(Nole017Loop record);
}