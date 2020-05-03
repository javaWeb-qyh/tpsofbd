package com.qyh.tpsofbd.server.service;

import com.qyh.tpsofbd.sdk.common.PlatformResult;
import com.qyh.tpsofbd.sdk.common.RequestPageVo;
import com.qyh.tpsofbd.sdk.common.ResponsePageVo;
import com.qyh.tpsofbd.server.entity.User;

import java.util.List;

public interface UserInfoService {

    User selectUser(long id);

    /**
     * @Description:
     * 分页查询接口
     * @Author: qyh
     * @Date: 2020/5/3 20:10
     */
    PlatformResult<ResponsePageVo<User>> findPage(RequestPageVo pageVo);
}
