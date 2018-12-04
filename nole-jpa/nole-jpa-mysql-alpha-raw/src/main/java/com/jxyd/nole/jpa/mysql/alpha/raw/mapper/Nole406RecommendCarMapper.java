package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole406RecommendCar;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole406RecommendCarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole406RecommendCarMapper {
    long countByExample(Nole406RecommendCarExample example);

    int deleteByExample(Nole406RecommendCarExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole406RecommendCar record);

    int insertSelective(Nole406RecommendCar record);

    List<Nole406RecommendCar> selectByExampleWithRowbounds(Nole406RecommendCarExample example, RowBounds rowBounds);

    List<Nole406RecommendCar> selectByExample(Nole406RecommendCarExample example);

    Nole406RecommendCar selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole406RecommendCar record, @Param("example") Nole406RecommendCarExample example);

    int updateByExample(@Param("record") Nole406RecommendCar record, @Param("example") Nole406RecommendCarExample example);

    int updateByPrimaryKeySelective(Nole406RecommendCar record);

    int updateByPrimaryKey(Nole406RecommendCar record);

    Nole406RecommendCar selectByIndex1(@Param("nole400Id")Long nole400Id,@Param("nole015Id")Long nole015Id);
}