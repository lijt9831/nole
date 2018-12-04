package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole500Order;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole500OrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole500OrderMapper {
    long countByExample(Nole500OrderExample example);

    int deleteByExample(Nole500OrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole500Order record);

    int insertSelective(Nole500Order record);

    List<Nole500Order> selectByExampleWithRowbounds(Nole500OrderExample example, RowBounds rowBounds);

    List<Nole500Order> selectByExample(Nole500OrderExample example);

    Nole500Order selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole500Order record, @Param("example") Nole500OrderExample example);

    int updateByExample(@Param("record") Nole500Order record, @Param("example") Nole500OrderExample example);

    int updateByPrimaryKeySelective(Nole500Order record);

    int updateByPrimaryKey(Nole500Order record);

    Nole500Order selectByIndex1(@Param("inBizNo")String inBizNo);
}