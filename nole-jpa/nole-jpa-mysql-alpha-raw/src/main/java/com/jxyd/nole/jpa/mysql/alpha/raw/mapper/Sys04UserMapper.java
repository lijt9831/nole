package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys04User;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys04UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Sys04UserMapper {
    long countByExample(Sys04UserExample example);

    int deleteByExample(Sys04UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sys04User record);

    int insertSelective(Sys04User record);

    List<Sys04User> selectByExampleWithRowbounds(Sys04UserExample example, RowBounds rowBounds);

    List<Sys04User> selectByExample(Sys04UserExample example);

    Sys04User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sys04User record, @Param("example") Sys04UserExample example);

    int updateByExample(@Param("record") Sys04User record, @Param("example") Sys04UserExample example);

    int updateByPrimaryKeySelective(Sys04User record);

    int updateByPrimaryKey(Sys04User record);
}