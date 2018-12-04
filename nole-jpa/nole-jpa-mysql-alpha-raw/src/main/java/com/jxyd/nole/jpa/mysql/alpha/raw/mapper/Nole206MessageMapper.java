package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole206Message;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole206MessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole206MessageMapper {
    long countByExample(Nole206MessageExample example);

    int deleteByExample(Nole206MessageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole206Message record);

    int insertSelective(Nole206Message record);

    List<Nole206Message> selectByExampleWithRowbounds(Nole206MessageExample example, RowBounds rowBounds);

    List<Nole206Message> selectByExample(Nole206MessageExample example);

    Nole206Message selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole206Message record, @Param("example") Nole206MessageExample example);

    int updateByExample(@Param("record") Nole206Message record, @Param("example") Nole206MessageExample example);

    int updateByPrimaryKeySelective(Nole206Message record);

    int updateByPrimaryKey(Nole206Message record);
}