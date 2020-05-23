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

    @ExceptionHandler(value=Exception.class)
    Object handleException(Exception e, HttpServletRequest request){
        LOG.error("url:{},\nmsg:{},\ntrace:{}",request.getRequestURL(),e.getMessage(),e.getStackTrace());
        Map<String,Object> map=new HashMap<>();
        map.put("success","1");
        //系统异常码默认为100000000
        map.put("code",100000000);
        map.put("url",request.getRequestURL());
        map.put("msg",e.getMessage());
        return map;
    }

    @ExceptionHandler(value=BusinessException.class)
    Object handleBusinessException(BusinessException e, HttpServletRequest request){
        LOG.error("url:{},\nmsg:{},\ntrace:{}",request.getRequestURL(),e.getErrorCodeEnum().getMsg(),e.getStackTrace());
        Map<String,Object> map=new HashMap<>();
        map.put("success","1");
        map.put("code",e.getErrorCodeEnum().getCode());
        map.put("url",request.getRequestURL());
        map.put("msg",e.getErrorCodeEnum().getMsg());


        return map;
    }
}
