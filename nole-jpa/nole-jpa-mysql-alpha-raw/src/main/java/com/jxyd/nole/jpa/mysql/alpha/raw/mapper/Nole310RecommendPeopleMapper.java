package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole310RecommendPeople;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole310RecommendPeopleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole310RecommendPeopleMapper {
    long countByExample(Nole310RecommendPeopleExample example);

    int deleteByExample(Nole310RecommendPeopleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole310RecommendPeople record);

    int insertSelective(Nole310RecommendPeople record);

    List<Nole310RecommendPeople> selectByExampleWithRowbounds(Nole310RecommendPeopleExample example, RowBounds rowBounds);

    List<Nole310RecommendPeople> selectByExample(Nole310RecommendPeopleExample example);

    Nole310RecommendPeople selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole310RecommendPeople record, @Param("example") Nole310RecommendPeopleExample example);

    int updateByExample(@Param("record") Nole310RecommendPeople record, @Param("example") Nole310RecommendPeopleExample example);

    int updateByPrimaryKeySelective(Nole310RecommendPeople record);

    int updateByPrimaryKey(Nole310RecommendPeople record);

    Nole310RecommendPeople selectByIndex1(@Param("nole304Id")Long nole304Id,@Param("nole014Id")Long nole014Id);
}