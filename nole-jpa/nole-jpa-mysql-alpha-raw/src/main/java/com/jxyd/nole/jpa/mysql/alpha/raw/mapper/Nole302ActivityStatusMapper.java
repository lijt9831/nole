package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole302ActivityStatus;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole302ActivityStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole302ActivityStatusMapper {
    long countByExample(Nole302ActivityStatusExample example);

    int deleteByExample(Nole302ActivityStatusExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole302ActivityStatus record);

    int insertSelective(Nole302ActivityStatus record);

    List<Nole302ActivityStatus> selectByExampleWithRowbounds(Nole302ActivityStatusExample example, RowBounds rowBounds);

    List<Nole302ActivityStatus> selectByExample(Nole302ActivityStatusExample example);

    Nole302ActivityStatus selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole302ActivityStatus record, @Param("example") Nole302ActivityStatusExample example);

    int updateByExample(@Param("record") Nole302ActivityStatus record, @Param("example") Nole302ActivityStatusExample example);

    int updateByPrimaryKeySelective(Nole302ActivityStatus record);

    int updateByPrimaryKey(Nole302ActivityStatus record);

    Nole302ActivityStatus selectByIndex1(@Param("nole301Id")Long nole301Id,@Param("status")String status);
}