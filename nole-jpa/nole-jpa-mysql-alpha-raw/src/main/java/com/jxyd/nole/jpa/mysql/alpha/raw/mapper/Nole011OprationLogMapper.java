package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole011OprationLog;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole011OprationLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole011OprationLogMapper {
    long countByExample(Nole011OprationLogExample example);

    int deleteByExample(Nole011OprationLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole011OprationLog record);

    int insertSelective(Nole011OprationLog record);

    List<Nole011OprationLog> selectByExampleWithRowbounds(Nole011OprationLogExample example, RowBounds rowBounds);

    List<Nole011OprationLog> selectByExample(Nole011OprationLogExample example);

    Nole011OprationLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole011OprationLog record, @Param("example") Nole011OprationLogExample example);

    int updateByExample(@Param("record") Nole011OprationLog record, @Param("example") Nole011OprationLogExample example);

    int updateByPrimaryKeySelective(Nole011OprationLog record);

    int updateByPrimaryKey(Nole011OprationLog record);
}