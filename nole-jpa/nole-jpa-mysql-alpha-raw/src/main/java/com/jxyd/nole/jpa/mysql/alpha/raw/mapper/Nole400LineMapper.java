package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole400Line;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole400LineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole400LineMapper {
    long countByExample(Nole400LineExample example);

    int deleteByExample(Nole400LineExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole400Line record);

    int insertSelective(Nole400Line record);

    List<Nole400Line> selectByExampleWithRowbounds(Nole400LineExample example, RowBounds rowBounds);

    List<Nole400Line> selectByExample(Nole400LineExample example);

    Nole400Line selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole400Line record, @Param("example") Nole400LineExample example);

    int updateByExample(@Param("record") Nole400Line record, @Param("example") Nole400LineExample example);

    int updateByPrimaryKeySelective(Nole400Line record);

    int updateByPrimaryKey(Nole400Line record);
}