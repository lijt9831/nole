package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole202Footprint;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole202FootprintExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole202FootprintMapper {
    long countByExample(Nole202FootprintExample example);

    int deleteByExample(Nole202FootprintExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole202Footprint record);

    int insertSelective(Nole202Footprint record);

    List<Nole202Footprint> selectByExampleWithRowbounds(Nole202FootprintExample example, RowBounds rowBounds);

    List<Nole202Footprint> selectByExample(Nole202FootprintExample example);

    Nole202Footprint selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole202Footprint record, @Param("example") Nole202FootprintExample example);

    int updateByExample(@Param("record") Nole202Footprint record, @Param("example") Nole202FootprintExample example);

    int updateByPrimaryKeySelective(Nole202Footprint record);

    int updateByPrimaryKey(Nole202Footprint record);

    Nole202Footprint selectByIndex1(@Param("nole200Id")Long nole200Id,@Param("nole301Id")Long nole301Id);
}