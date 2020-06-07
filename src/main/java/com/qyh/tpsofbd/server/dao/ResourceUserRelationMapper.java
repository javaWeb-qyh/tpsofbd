package com.qyh.tpsofbd.server.dao;

import com.qyh.tpsofbd.server.entity.ResourceUserRelation;
import java.util.List;

public interface ResourceUserRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ResourceUserRelation record);

    ResourceUserRelation selectByPrimaryKey(Long id);

    List<ResourceUserRelation> selectAll();

    int updateByPrimaryKey(ResourceUserRelation record);
}