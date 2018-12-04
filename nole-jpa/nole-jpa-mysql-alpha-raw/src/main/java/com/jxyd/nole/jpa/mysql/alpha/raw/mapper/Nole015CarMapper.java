package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole015Car;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole015CarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole015CarMapper {
    long countByExample(Nole015CarExample example);

    int deleteByExample(Nole015CarExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole015Car record);

    int insertSelective(Nole015Car record);

    List<Nole015Car> selectByExampleWithRowbounds(Nole015CarExample example, RowBounds rowBounds);

    List<Nole015Car> selectByExample(Nole015CarExample example);

    Nole015Car selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole015Car record, @Param("example") Nole015CarExample example);

    int updateByExample(@Param("record") Nole015Car record, @Param("example") Nole015CarExample example);

    int updateByPrimaryKeySelective(Nole015Car record);

    int updateByPrimaryKey(Nole015Car record);

    Nole015Car selectByIndex1(@Param("car")String car);
}