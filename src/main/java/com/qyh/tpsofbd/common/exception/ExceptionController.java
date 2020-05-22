package com.qyh.tpsofbd.common.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @description:全局异常处理类
 * @AUTHOR: qyh
 * @create: 2020-05-22 23:54
 **/
@RestControllerAdvice
public class ExceptionController {

    private static final Logger LOG=LoggerFactory.getLogger(ExceptionController.class);

    @ExceptionHandler
    Object handleException(Exception e, HttpServletRequest request){
        LOG.error("url:{},trace:{}",request.getRequestURL(),e.getStackTrace());
        Map<String,Object> map=new HashMap<>();
        map.put("code",100);
        map.put("msg",e.getMessage());
        map.put("url",request.getRequestURL());
        return map;
    }

}
