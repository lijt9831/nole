package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole311RecommendCar;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole311RecommendCarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole311RecommendCarMapper {
    long countByExample(Nole311RecommendCarExample example);

    int deleteByExample(Nole311RecommendCarExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole311RecommendCar record);

    int insertSelective(Nole311RecommendCar record);

    List<Nole311RecommendCar> selectByExampleWithRowbounds(Nole311RecommendCarExample example, RowBounds rowBounds);

    List<Nole311RecommendCar> selectByExample(Nole311RecommendCarExample example);

    Nole311RecommendCar selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole311RecommendCar record, @Param("example") Nole311RecommendCarExample example);

    int updateByExample(@Param("record") Nole311RecommendCar record, @Param("example") Nole311RecommendCarExample example);

    int updateByPrimaryKeySelective(Nole311RecommendCar record);

    int updateByPrimaryKey(Nole311RecommendCar record);

    Nole311RecommendCar selectByIndex1(@Param("nole304Id")Long nole304Id,@Param("nole015Id")Long nole015Id);
}