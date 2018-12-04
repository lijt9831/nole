package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole501OrderStatus;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole501OrderStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole501OrderStatusMapper {
    long countByExample(Nole501OrderStatusExample example);

    int deleteByExample(Nole501OrderStatusExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole501OrderStatus record);

    int insertSelective(Nole501OrderStatus record);

    List<Nole501OrderStatus> selectByExampleWithRowbounds(Nole501OrderStatusExample example, RowBounds rowBounds);

    List<Nole501OrderStatus> selectByExample(Nole501OrderStatusExample example);

    Nole501OrderStatus selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole501OrderStatus record, @Param("example") Nole501OrderStatusExample example);

    int updateByExample(@Param("record") Nole501OrderStatus record, @Param("example") Nole501OrderStatusExample example);

    int updateByPrimaryKeySelective(Nole501OrderStatus record);

    int updateByPrimaryKey(Nole501OrderStatus record);
}