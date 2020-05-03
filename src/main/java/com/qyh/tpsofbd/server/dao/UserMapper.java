package com.qyh.tpsofbd.server.dao;

import com.qyh.tpsofbd.server.entity.User;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    User selectByPrimaryKey(Long userId);

    int updateByPrimaryKey(User record);

    /**
     * @Description: 
     * 查询全部用户
     * @Author: qyh
     * @Date: 2020/5/3 20:01
     */
    List<User> selectAll();

    /**
     * @Description: 
     * 分页查询用户
     * @Author: qyh
     * @Date: 2020/5/3 20:02
     */
    List<User> selectPage();
    
}