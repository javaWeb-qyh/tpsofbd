package com.qyh.tpsofbd.server.service.impl;

import com.qyh.tpsofbd.server.dao.UserMapper;
import com.qyh.tpsofbd.server.entity.User;
import com.qyh.tpsofbd.server.service.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
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
