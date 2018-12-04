package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole203Talk;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole203TalkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Nole203TalkMapper {
    long countByExample(Nole203TalkExample example);

    int deleteByExample(Nole203TalkExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nole203Talk record);

    int insertSelective(Nole203Talk record);

    List<Nole203Talk> selectByExampleWithRowbounds(Nole203TalkExample example, RowBounds rowBounds);

    List<Nole203Talk> selectByExample(Nole203TalkExample example);

    Nole203Talk selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nole203Talk record, @Param("example") Nole203TalkExample example);

    int updateByExample(@Param("record") Nole203Talk record, @Param("example") Nole203TalkExample example);

    int updateByPrimaryKeySelective(Nole203Talk record);

    int updateByPrimaryKey(Nole203Talk record);
}