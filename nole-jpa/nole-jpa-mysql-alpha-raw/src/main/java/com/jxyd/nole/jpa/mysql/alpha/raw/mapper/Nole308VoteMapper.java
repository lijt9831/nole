package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole308Vote;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole308VoteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole308VoteMapper {
    long countByExample(Nole308VoteExample example);

    int deleteByExample(Nole308VoteExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole308Vote record);

    int insertSelective(Nole308Vote record);

    List<Nole308Vote> selectByExampleWithRowbounds(Nole308VoteExample example, RowBounds rowBounds);

    List<Nole308Vote> selectByExample(Nole308VoteExample example);

    Nole308Vote selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole308Vote record, @Param("example") Nole308VoteExample example);

    int updateByExample(@Param("record") Nole308Vote record, @Param("example") Nole308VoteExample example);

    int updateByPrimaryKeySelective(Nole308Vote record);

    int updateByPrimaryKey(Nole308Vote record);

    Nole308Vote selectByIndex1(@Param("nole304Id")Long nole304Id,@Param("nole200Id")Long nole200Id);
}