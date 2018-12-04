package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole205FavorateLabel;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole205FavorateLabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole205FavorateLabelMapper {
    long countByExample(Nole205FavorateLabelExample example);

    int deleteByExample(Nole205FavorateLabelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole205FavorateLabel record);

    int insertSelective(Nole205FavorateLabel record);

    List<Nole205FavorateLabel> selectByExampleWithRowbounds(Nole205FavorateLabelExample example, RowBounds rowBounds);

    List<Nole205FavorateLabel> selectByExample(Nole205FavorateLabelExample example);

    Nole205FavorateLabel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole205FavorateLabel record, @Param("example") Nole205FavorateLabelExample example);

    int updateByExample(@Param("record") Nole205FavorateLabel record, @Param("example") Nole205FavorateLabelExample example);

    int updateByPrimaryKeySelective(Nole205FavorateLabel record);

    int updateByPrimaryKey(Nole205FavorateLabel record);

    Nole205FavorateLabel selectByIndex1(@Param("nole200Id")Long nole200Id,@Param("nole300Id")Long nole300Id);
}