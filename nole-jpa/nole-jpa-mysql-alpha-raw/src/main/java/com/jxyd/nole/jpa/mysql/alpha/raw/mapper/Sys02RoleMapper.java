package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys02Role;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys02RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Sys02RoleMapper {
    long countByExample(Sys02RoleExample example);

    int deleteByExample(Sys02RoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sys02Role record);

    int insertSelective(Sys02Role record);

    List<Sys02Role> selectByExampleWithRowbounds(Sys02RoleExample example, RowBounds rowBounds);

    List<Sys02Role> selectByExample(Sys02RoleExample example);

    Sys02Role selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sys02Role record, @Param("example") Sys02RoleExample example);

    int updateByExample(@Param("record") Sys02Role record, @Param("example") Sys02RoleExample example);

    int updateByPrimaryKeySelective(Sys02Role record);

    int updateByPrimaryKey(Sys02Role record);
}