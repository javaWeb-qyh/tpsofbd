package com.qyh.tpsofbd.server.dao;

import com.qyh.tpsofbd.server.entity.SourcecodeFilleUserRelation;
import java.util.List;

public interface SourcecodeFilleUserRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SourcecodeFilleUserRelation record);

    SourcecodeFilleUserRelation selectByPrimaryKey(Long id);

    List<SourcecodeFilleUserRelation> selectAll();

    int updateByPrimaryKey(SourcecodeFilleUserRelation record);
}