package com.qyh.tpsofbd.server.controller;

import com.qyh.tpsofbd.common.config.ServerSettings;
import com.qyh.tpsofbd.sdk.common.PlatformResult;
import com.qyh.tpsofbd.sdk.common.RequestPageVo;
import com.qyh.tpsofbd.sdk.common.ResponsePageVo;
import com.qyh.tpsofbd.server.entity.User;
import com.qyh.tpsofbd.server.service.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/test")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    private Map<String,Object> params=new HashMap<>();

    private final ServerSettings serverSettings;

    private final UserInfoService userInfoService;

    @GetMapping("/propertie")
    public Object testProperties(){

        //params.clear();
        return serverSettings;
    }

    @GetMapping("/log")
    public Object testLog(){

        LOGGER.debug("this is debug level");
        LOGGER.info("this is info level");
        LOGGER.warn("this is warn level");
        LOGGER.error("this is error level");
        return serverSettings;
    }

    @GetMapping("/mybatis")
    public Object testMybatis(){

        RequestPageVo requestPageVo=new RequestPageVo(5,2);
        return userInfoService.findPage(requestPageVo);
    }
}
