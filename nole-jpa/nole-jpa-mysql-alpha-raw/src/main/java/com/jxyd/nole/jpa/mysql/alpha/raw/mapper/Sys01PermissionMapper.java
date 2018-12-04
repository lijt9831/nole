package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys01Permission;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys01PermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Sys01PermissionMapper {
    long countByExample(Sys01PermissionExample example);

    int deleteByExample(Sys01PermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sys01Permission record);

    int insertSelective(Sys01Permission record);

    List<Sys01Permission> selectByExampleWithRowbounds(Sys01PermissionExample example, RowBounds rowBounds);

    List<Sys01Permission> selectByExample(Sys01PermissionExample example);

    Sys01Permission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sys01Permission record, @Param("example") Sys01PermissionExample example);

    int updateByExample(@Param("record") Sys01Permission record, @Param("example") Sys01PermissionExample example);

    int updateByPrimaryKeySelective(Sys01Permission record);

    int updateByPrimaryKey(Sys01Permission record);
}