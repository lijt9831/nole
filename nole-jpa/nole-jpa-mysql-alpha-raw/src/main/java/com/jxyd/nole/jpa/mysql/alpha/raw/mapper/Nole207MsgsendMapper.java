package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole207Msgsend;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole207MsgsendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole207MsgsendMapper {
    long countByExample(Nole207MsgsendExample example);

    int deleteByExample(Nole207MsgsendExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole207Msgsend record);

    int insertSelective(Nole207Msgsend record);

    List<Nole207Msgsend> selectByExampleWithRowbounds(Nole207MsgsendExample example, RowBounds rowBounds);

    List<Nole207Msgsend> selectByExample(Nole207MsgsendExample example);

    Nole207Msgsend selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole207Msgsend record, @Param("example") Nole207MsgsendExample example);

    int updateByExample(@Param("record") Nole207Msgsend record, @Param("example") Nole207MsgsendExample example);

    int updateByPrimaryKeySelective(Nole207Msgsend record);

    int updateByPrimaryKey(Nole207Msgsend record);

    Nole207Msgsend selectByIndex1(@Param("nole200Id")Long nole200Id);
}