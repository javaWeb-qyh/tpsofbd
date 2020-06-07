package com.qyh.tpsofbd.server.dao;

import com.qyh.tpsofbd.server.entity.MarkdownFilleUserRelation;
import java.util.List;

public interface MarkdownFilleUserRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MarkdownFilleUserRelation record);

    MarkdownFilleUserRelation selectByPrimaryKey(Long id);

    List<MarkdownFilleUserRelation> selectAll();

    int updateByPrimaryKey(MarkdownFilleUserRelation record);
}