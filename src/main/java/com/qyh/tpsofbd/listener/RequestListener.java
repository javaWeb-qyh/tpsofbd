package com.qyh.tpsofbd.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * @description:自定义请求处理监听器
 * @AUTHOR: qyh
 * @create: 2020-05-24 20:59
 **/
//不需要时注释掉注解即可
//@WebListener
public class RequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        //请求被controller方法处理前做的一些操作
        System.out.println("=========requestDestroyed=========");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        //请求被controller方法处理后做的一些操作
        System.out.println("=========requestInitialized======");

    }
}
