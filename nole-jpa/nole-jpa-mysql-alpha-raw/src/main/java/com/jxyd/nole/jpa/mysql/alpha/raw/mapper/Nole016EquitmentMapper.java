package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole016Equitment;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole016EquitmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole016EquitmentMapper {
    long countByExample(Nole016EquitmentExample example);

    int deleteByExample(Nole016EquitmentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole016Equitment record);

    int insertSelective(Nole016Equitment record);

    List<Nole016Equitment> selectByExampleWithRowbounds(Nole016EquitmentExample example, RowBounds rowBounds);

    List<Nole016Equitment> selectByExample(Nole016EquitmentExample example);

    Nole016Equitment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole016Equitment record, @Param("example") Nole016EquitmentExample example);

    int updateByExample(@Param("record") Nole016Equitment record, @Param("example") Nole016EquitmentExample example);

    int updateByPrimaryKeySelective(Nole016Equitment record);

    int updateByPrimaryKey(Nole016Equitment record);

    Nole016Equitment selectByIndex1(@Param("equitment")String equitment);
}