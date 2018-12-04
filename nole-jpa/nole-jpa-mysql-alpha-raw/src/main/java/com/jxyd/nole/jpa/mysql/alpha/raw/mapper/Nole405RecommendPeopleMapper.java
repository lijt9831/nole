package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole405RecommendPeople;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole405RecommendPeopleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole405RecommendPeopleMapper {
    long countByExample(Nole405RecommendPeopleExample example);

    int deleteByExample(Nole405RecommendPeopleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole405RecommendPeople record);

    int insertSelective(Nole405RecommendPeople record);

    List<Nole405RecommendPeople> selectByExampleWithRowbounds(Nole405RecommendPeopleExample example, RowBounds rowBounds);

    List<Nole405RecommendPeople> selectByExample(Nole405RecommendPeopleExample example);

    Nole405RecommendPeople selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole405RecommendPeople record, @Param("example") Nole405RecommendPeopleExample example);

    int updateByExample(@Param("record") Nole405RecommendPeople record, @Param("example") Nole405RecommendPeopleExample example);

    int updateByPrimaryKeySelective(Nole405RecommendPeople record);

    int updateByPrimaryKey(Nole405RecommendPeople record);

    Nole405RecommendPeople selectByIndex1(@Param("nole400Id")Long nole400Id,@Param("nole014Id")Long nole014Id);
}