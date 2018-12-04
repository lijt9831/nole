package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole014People;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole014PeopleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole014PeopleMapper {
    long countByExample(Nole014PeopleExample example);

    int deleteByExample(Nole014PeopleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole014People record);

    int insertSelective(Nole014People record);

    List<Nole014People> selectByExampleWithRowbounds(Nole014PeopleExample example, RowBounds rowBounds);

    List<Nole014People> selectByExample(Nole014PeopleExample example);

    Nole014People selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole014People record, @Param("example") Nole014PeopleExample example);

    int updateByExample(@Param("record") Nole014People record, @Param("example") Nole014PeopleExample example);

    int updateByPrimaryKeySelective(Nole014People record);

    int updateByPrimaryKey(Nole014People record);

    Nole014People selectByIndex1(@Param("people")String people);
}