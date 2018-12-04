package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole408Footprint;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole408FootprintExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole408FootprintMapper {
    long countByExample(Nole408FootprintExample example);

    int deleteByExample(Nole408FootprintExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole408Footprint record);

    int insertSelective(Nole408Footprint record);

    List<Nole408Footprint> selectByExampleWithRowbounds(Nole408FootprintExample example, RowBounds rowBounds);

    List<Nole408Footprint> selectByExample(Nole408FootprintExample example);

    Nole408Footprint selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole408Footprint record, @Param("example") Nole408FootprintExample example);

    int updateByExample(@Param("record") Nole408Footprint record, @Param("example") Nole408FootprintExample example);

    int updateByPrimaryKeySelective(Nole408Footprint record);

    int updateByPrimaryKey(Nole408Footprint record);

    Nole408Footprint selectByIndex1(@Param("nole400Id")Long nole400Id,@Param("nole200Id")Long nole200Id);
}