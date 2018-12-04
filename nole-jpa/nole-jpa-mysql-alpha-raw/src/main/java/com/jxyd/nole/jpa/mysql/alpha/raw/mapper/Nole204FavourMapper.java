package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole204Favour;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole204FavourExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole204FavourMapper {
    long countByExample(Nole204FavourExample example);

    int deleteByExample(Nole204FavourExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole204Favour record);

    int insertSelective(Nole204Favour record);

    List<Nole204Favour> selectByExampleWithRowbounds(Nole204FavourExample example, RowBounds rowBounds);

    List<Nole204Favour> selectByExample(Nole204FavourExample example);

    Nole204Favour selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole204Favour record, @Param("example") Nole204FavourExample example);

    int updateByExample(@Param("record") Nole204Favour record, @Param("example") Nole204FavourExample example);

    int updateByPrimaryKeySelective(Nole204Favour record);

    int updateByPrimaryKey(Nole204Favour record);

    Nole204Favour selectByIndex1(@Param("nole200Id")Long nole200Id,@Param("nole301Id")Long nole301Id);
}