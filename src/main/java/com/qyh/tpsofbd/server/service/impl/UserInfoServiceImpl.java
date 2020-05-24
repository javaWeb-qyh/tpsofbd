package com.qyh.tpsofbd.server.service.impl;

import com.github.pagehelper.PageHelper;
import com.qyh.tpsofbd.sdk.common.PlatformResult;
import com.qyh.tpsofbd.sdk.common.RequestPageVo;
import com.qyh.tpsofbd.sdk.common.ResponsePageVo;
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

import java.util.List;

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
    public PlatformResult<User> selectUser(long id) {

        User user=userMapper.selectByPrimaryKey(id);
        return PlatformResult.success(user);
    }

    @Override
    public PlatformResult<ResponsePageVo<User>> findPage(RequestPageVo requestPageVo) {
        int pageNo = requestPageVo.getPageNo();
        int pageSize = requestPageVo.getPageSize();
        PageHelper.startPage(pageNo, pageSize);
        List<User> users = userMapper.selectPage();
        long totalSize=users.size();
        return PlatformResult.success(users,totalSize);
    }

}
