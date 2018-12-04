package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole407RecommendEquip;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole407RecommendEquipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole407RecommendEquipMapper {
    long countByExample(Nole407RecommendEquipExample example);

    int deleteByExample(Nole407RecommendEquipExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole407RecommendEquip record);

    int insertSelective(Nole407RecommendEquip record);

    List<Nole407RecommendEquip> selectByExampleWithRowbounds(Nole407RecommendEquipExample example, RowBounds rowBounds);

    List<Nole407RecommendEquip> selectByExample(Nole407RecommendEquipExample example);

    Nole407RecommendEquip selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole407RecommendEquip record, @Param("example") Nole407RecommendEquipExample example);

    int updateByExample(@Param("record") Nole407RecommendEquip record, @Param("example") Nole407RecommendEquipExample example);

    int updateByPrimaryKeySelective(Nole407RecommendEquip record);

    int updateByPrimaryKey(Nole407RecommendEquip record);

    Nole407RecommendEquip selectByIndex1(@Param("nole400Id")Long nole400Id,@Param("nole016Id")Long nole016Id);
}