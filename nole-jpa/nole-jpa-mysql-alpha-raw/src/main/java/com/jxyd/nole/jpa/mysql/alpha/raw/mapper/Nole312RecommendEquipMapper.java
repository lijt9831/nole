package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole312RecommendEquip;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole312RecommendEquipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole312RecommendEquipMapper {
    long countByExample(Nole312RecommendEquipExample example);

    int deleteByExample(Nole312RecommendEquipExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole312RecommendEquip record);

    int insertSelective(Nole312RecommendEquip record);

    List<Nole312RecommendEquip> selectByExampleWithRowbounds(Nole312RecommendEquipExample example, RowBounds rowBounds);

    List<Nole312RecommendEquip> selectByExample(Nole312RecommendEquipExample example);

    Nole312RecommendEquip selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole312RecommendEquip record, @Param("example") Nole312RecommendEquipExample example);

    int updateByExample(@Param("record") Nole312RecommendEquip record, @Param("example") Nole312RecommendEquipExample example);

    int updateByPrimaryKeySelective(Nole312RecommendEquip record);

    int updateByPrimaryKey(Nole312RecommendEquip record);

    Nole312RecommendEquip selectByIndex1(@Param("nole304Id")Long nole304Id,@Param("nole016Id")Long nole016Id);
}