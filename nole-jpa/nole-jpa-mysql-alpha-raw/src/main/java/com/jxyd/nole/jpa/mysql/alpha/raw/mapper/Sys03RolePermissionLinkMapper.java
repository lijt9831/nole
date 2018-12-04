package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys03RolePermissionLink;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys03RolePermissionLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Sys03RolePermissionLinkMapper {
    long countByExample(Sys03RolePermissionLinkExample example);

    int deleteByExample(Sys03RolePermissionLinkExample example);

    int insert(Sys03RolePermissionLink record);

    int insertSelective(Sys03RolePermissionLink record);

    List<Sys03RolePermissionLink> selectByExampleWithRowbounds(Sys03RolePermissionLinkExample example, RowBounds rowBounds);

    List<Sys03RolePermissionLink> selectByExample(Sys03RolePermissionLinkExample example);

    int updateByExampleSelective(@Param("record") Sys03RolePermissionLink record, @Param("example") Sys03RolePermissionLinkExample example);

    int updateByExample(@Param("record") Sys03RolePermissionLink record, @Param("example") Sys03RolePermissionLinkExample example);
}