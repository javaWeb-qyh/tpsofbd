package com.qyh.tpsofbd.server.dao;

import com.qyh.tpsofbd.server.entity.UserManager;
import java.util.List;

public interface UserManagerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserManager record);

    UserManager selectByPrimaryKey(Long id);

    List<UserManager> selectAll();

    int updateByPrimaryKey(UserManager record);
}