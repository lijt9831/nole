package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole010AuthcLog;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole010AuthcLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole010AuthcLogMapper {
    long countByExample(Nole010AuthcLogExample example);

    int deleteByExample(Nole010AuthcLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole010AuthcLog record);

    int insertSelective(Nole010AuthcLog record);

    List<Nole010AuthcLog> selectByExampleWithRowbounds(Nole010AuthcLogExample example, RowBounds rowBounds);

    List<Nole010AuthcLog> selectByExample(Nole010AuthcLogExample example);

    Nole010AuthcLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole010AuthcLog record, @Param("example") Nole010AuthcLogExample example);

    int updateByExample(@Param("record") Nole010AuthcLog record, @Param("example") Nole010AuthcLogExample example);

    int updateByPrimaryKeySelective(Nole010AuthcLog record);

    int updateByPrimaryKey(Nole010AuthcLog record);
}