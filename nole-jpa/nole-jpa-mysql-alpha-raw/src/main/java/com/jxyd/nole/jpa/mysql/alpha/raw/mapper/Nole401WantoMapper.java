package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole401Wanto;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole401WantoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole401WantoMapper {
    long countByExample(Nole401WantoExample example);

    int deleteByExample(Nole401WantoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole401Wanto record);

    int insertSelective(Nole401Wanto record);

    List<Nole401Wanto> selectByExampleWithRowbounds(Nole401WantoExample example, RowBounds rowBounds);

    List<Nole401Wanto> selectByExample(Nole401WantoExample example);

    Nole401Wanto selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole401Wanto record, @Param("example") Nole401WantoExample example);

    int updateByExample(@Param("record") Nole401Wanto record, @Param("example") Nole401WantoExample example);

    int updateByPrimaryKeySelective(Nole401Wanto record);

    int updateByPrimaryKey(Nole401Wanto record);

    Nole401Wanto selectByIndex1(@Param("nole200Id")Long nole200Id,@Param("nole400Id")Long nole400Id);
}