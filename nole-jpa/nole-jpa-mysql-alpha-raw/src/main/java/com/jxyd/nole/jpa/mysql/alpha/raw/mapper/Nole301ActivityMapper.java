package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole301Activity;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole301ActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole301ActivityMapper {
    long countByExample(Nole301ActivityExample example);

    int deleteByExample(Nole301ActivityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole301Activity record);

    int insertSelective(Nole301Activity record);

    List<Nole301Activity> selectByExampleWithRowbounds(Nole301ActivityExample example, RowBounds rowBounds);

    List<Nole301Activity> selectByExample(Nole301ActivityExample example);

    Nole301Activity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole301Activity record, @Param("example") Nole301ActivityExample example);

    int updateByExample(@Param("record") Nole301Activity record, @Param("example") Nole301ActivityExample example);

    int updateByPrimaryKeySelective(Nole301Activity record);

    int updateByPrimaryKey(Nole301Activity record);
}