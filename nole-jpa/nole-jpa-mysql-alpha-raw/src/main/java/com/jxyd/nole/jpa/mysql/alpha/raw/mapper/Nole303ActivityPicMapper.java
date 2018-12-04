package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole303ActivityPic;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole303ActivityPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole303ActivityPicMapper {
    long countByExample(Nole303ActivityPicExample example);

    int deleteByExample(Nole303ActivityPicExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole303ActivityPic record);

    int insertSelective(Nole303ActivityPic record);

    List<Nole303ActivityPic> selectByExampleWithRowbounds(Nole303ActivityPicExample example, RowBounds rowBounds);

    List<Nole303ActivityPic> selectByExample(Nole303ActivityPicExample example);

    Nole303ActivityPic selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole303ActivityPic record, @Param("example") Nole303ActivityPicExample example);

    int updateByExample(@Param("record") Nole303ActivityPic record, @Param("example") Nole303ActivityPicExample example);

    int updateByPrimaryKeySelective(Nole303ActivityPic record);

    int updateByPrimaryKey(Nole303ActivityPic record);
}