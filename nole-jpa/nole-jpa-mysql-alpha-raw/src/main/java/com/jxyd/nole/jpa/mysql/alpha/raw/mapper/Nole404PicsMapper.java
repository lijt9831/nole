package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole404Pics;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole404PicsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole404PicsMapper {
    long countByExample(Nole404PicsExample example);

    int deleteByExample(Nole404PicsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole404Pics record);

    int insertSelective(Nole404Pics record);

    List<Nole404Pics> selectByExampleWithRowbounds(Nole404PicsExample example, RowBounds rowBounds);

    List<Nole404Pics> selectByExample(Nole404PicsExample example);

    Nole404Pics selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole404Pics record, @Param("example") Nole404PicsExample example);

    int updateByExample(@Param("record") Nole404Pics record, @Param("example") Nole404PicsExample example);

    int updateByPrimaryKeySelective(Nole404Pics record);

    int updateByPrimaryKey(Nole404Pics record);
}