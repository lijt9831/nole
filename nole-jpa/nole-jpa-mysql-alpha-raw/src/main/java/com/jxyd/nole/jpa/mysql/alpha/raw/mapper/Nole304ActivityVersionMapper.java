package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole304ActivityVersion;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole304ActivityVersionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole304ActivityVersionMapper {
    long countByExample(Nole304ActivityVersionExample example);

    int deleteByExample(Nole304ActivityVersionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole304ActivityVersion record);

    int insertSelective(Nole304ActivityVersion record);

    List<Nole304ActivityVersion> selectByExampleWithRowbounds(Nole304ActivityVersionExample example, RowBounds rowBounds);

    List<Nole304ActivityVersion> selectByExample(Nole304ActivityVersionExample example);

    Nole304ActivityVersion selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole304ActivityVersion record, @Param("example") Nole304ActivityVersionExample example);

    int updateByExample(@Param("record") Nole304ActivityVersion record, @Param("example") Nole304ActivityVersionExample example);

    int updateByPrimaryKeySelective(Nole304ActivityVersion record);

    int updateByPrimaryKey(Nole304ActivityVersion record);

    Nole304ActivityVersion selectByIndex1(@Param("nole301Id")Long nole301Id,@Param("version")Integer version);
}