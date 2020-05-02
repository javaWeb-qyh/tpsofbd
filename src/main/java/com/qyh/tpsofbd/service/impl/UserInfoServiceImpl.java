package com.qyh.tpsofbd.service.impl;

import com.qyh.tpsofbd.dao.UserMapper;
import com.qyh.tpsofbd.entity.User;
import com.qyh.tpsofbd.service.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserInfoServiceImpl implements UserInfoService {

    /**
     * LOGGER日志
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(UserInfoServiceImpl.class);

    private final UserMapper userMapper;

    @Override
    public User selectUser(long id) {

        User user=userMapper.selectByPrimaryKey(id);
        return user;
    }
}
