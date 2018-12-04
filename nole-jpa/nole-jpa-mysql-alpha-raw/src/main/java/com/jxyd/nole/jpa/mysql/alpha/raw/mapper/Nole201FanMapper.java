package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole201Fan;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole201FanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole201FanMapper {
    long countByExample(Nole201FanExample example);

    int deleteByExample(Nole201FanExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole201Fan record);

    int insertSelective(Nole201Fan record);

    List<Nole201Fan> selectByExampleWithRowbounds(Nole201FanExample example, RowBounds rowBounds);

    List<Nole201Fan> selectByExample(Nole201FanExample example);

    Nole201Fan selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole201Fan record, @Param("example") Nole201FanExample example);

    int updateByExample(@Param("record") Nole201Fan record, @Param("example") Nole201FanExample example);

    int updateByPrimaryKeySelective(Nole201Fan record);

    int updateByPrimaryKey(Nole201Fan record);

    Nole201Fan selectByIndex1(@Param("nole200Id")Long nole200Id,@Param("nole301Id")Long nole301Id);
}