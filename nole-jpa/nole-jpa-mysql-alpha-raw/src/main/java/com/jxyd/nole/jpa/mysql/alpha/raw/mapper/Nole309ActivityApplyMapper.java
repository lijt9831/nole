package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole309ActivityApply;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole309ActivityApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole309ActivityApplyMapper {
    long countByExample(Nole309ActivityApplyExample example);

    int deleteByExample(Nole309ActivityApplyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole309ActivityApply record);

    int insertSelective(Nole309ActivityApply record);

    List<Nole309ActivityApply> selectByExampleWithRowbounds(Nole309ActivityApplyExample example, RowBounds rowBounds);

    List<Nole309ActivityApply> selectByExample(Nole309ActivityApplyExample example);

    Nole309ActivityApply selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole309ActivityApply record, @Param("example") Nole309ActivityApplyExample example);

    int updateByExample(@Param("record") Nole309ActivityApply record, @Param("example") Nole309ActivityApplyExample example);

    int updateByPrimaryKeySelective(Nole309ActivityApply record);

    int updateByPrimaryKey(Nole309ActivityApply record);

    Nole309ActivityApply selectByIndex1(@Param("nole200Id")Long nole200Id,@Param("nole301Id")Long nole301Id);
}