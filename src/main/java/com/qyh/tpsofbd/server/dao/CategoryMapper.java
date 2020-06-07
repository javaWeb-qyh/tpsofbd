package com.qyh.tpsofbd.server.dao;

import com.qyh.tpsofbd.server.entity.Category;
import java.util.List;

public interface CategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Category record);

    Category selectByPrimaryKey(Long id);

    List<Category> selectAll();

    int updateByPrimaryKey(Category record);
}