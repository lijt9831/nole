package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys05UserRoleLink;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys05UserRoleLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Sys05UserRoleLinkMapper {
    long countByExample(Sys05UserRoleLinkExample example);

    int deleteByExample(Sys05UserRoleLinkExample example);

    int insert(Sys05UserRoleLink record);

    int insertSelective(Sys05UserRoleLink record);

    List<Sys05UserRoleLink> selectByExampleWithRowbounds(Sys05UserRoleLinkExample example, RowBounds rowBounds);

    List<Sys05UserRoleLink> selectByExample(Sys05UserRoleLinkExample example);

    int updateByExampleSelective(@Param("record") Sys05UserRoleLink record, @Param("example") Sys05UserRoleLinkExample example);

    int updateByExample(@Param("record") Sys05UserRoleLink record, @Param("example") Sys05UserRoleLinkExample example);
}