package com.qyh.tpsofbd.server.dao;

import com.qyh.tpsofbd.server.entity.MarkdownFile;
import java.util.List;

public interface MarkdownFileMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MarkdownFile record);

    MarkdownFile selectByPrimaryKey(Long id);

    List<MarkdownFile> selectAll();

    int updateByPrimaryKey(MarkdownFile record);
}