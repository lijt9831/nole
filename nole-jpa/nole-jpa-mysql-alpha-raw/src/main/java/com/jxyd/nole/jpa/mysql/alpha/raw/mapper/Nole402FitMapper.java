package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole402Fit;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole402FitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole402FitMapper {
    long countByExample(Nole402FitExample example);

    int deleteByExample(Nole402FitExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole402Fit record);

    int insertSelective(Nole402Fit record);

    List<Nole402Fit> selectByExampleWithRowbounds(Nole402FitExample example, RowBounds rowBounds);

    List<Nole402Fit> selectByExample(Nole402FitExample example);

    Nole402Fit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole402Fit record, @Param("example") Nole402FitExample example);

    int updateByExample(@Param("record") Nole402Fit record, @Param("example") Nole402FitExample example);

    int updateByPrimaryKeySelective(Nole402Fit record);

    int updateByPrimaryKey(Nole402Fit record);

    Nole402Fit selectByIndex1(@Param("nole400Id")Long nole400Id,@Param("nole300Id")Long nole300Id);
}