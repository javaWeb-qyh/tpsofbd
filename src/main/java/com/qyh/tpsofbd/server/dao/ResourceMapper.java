package com.qyh.tpsofbd.server.dao;

import com.qyh.tpsofbd.server.entity.Resource;
import java.util.List;

public interface ResourceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Resource record);

    Resource selectByPrimaryKey(Long id);

    List<Resource> selectAll();

    int updateByPrimaryKey(Resource record);
}