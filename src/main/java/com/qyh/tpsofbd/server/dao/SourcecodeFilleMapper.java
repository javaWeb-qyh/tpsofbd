package com.qyh.tpsofbd.server.dao;

import com.qyh.tpsofbd.server.entity.SourcecodeFille;
import java.util.List;

public interface SourcecodeFilleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SourcecodeFille record);

    SourcecodeFille selectByPrimaryKey(Long id);

    List<SourcecodeFille> selectAll();

    int updateByPrimaryKey(SourcecodeFille record);
}