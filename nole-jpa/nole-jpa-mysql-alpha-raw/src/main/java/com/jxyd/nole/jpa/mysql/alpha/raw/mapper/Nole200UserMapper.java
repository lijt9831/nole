package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole200User;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole200UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole200UserMapper {
    long countByExample(Nole200UserExample example);

    int deleteByExample(Nole200UserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole200User record);

    int insertSelective(Nole200User record);

    List<Nole200User> selectByExampleWithRowbounds(Nole200UserExample example, RowBounds rowBounds);

    List<Nole200User> selectByExample(Nole200UserExample example);

    Nole200User selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole200User record, @Param("example") Nole200UserExample example);

    int updateByExample(@Param("record") Nole200User record, @Param("example") Nole200UserExample example);

    int updateByPrimaryKeySelective(Nole200User record);

    int updateByPrimaryKey(Nole200User record);

    Nole200User selectByIndex1(@Param("wxOpenid")String wxOpenid);

    Nole200User selectByIndex2(@Param("mobile")String mobile);
}