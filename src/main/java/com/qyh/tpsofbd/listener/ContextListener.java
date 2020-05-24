package com.qyh.tpsofbd.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @description:上下文监听器
 * @AUTHOR: qyh
 * @create: 2020-05-24 21:23
 **/
//不需要时注释掉注解即可
//@WebListener
public class ContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //程序启动时做一些初始化操作
        System.out.println("=========contextInitialized=========");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        //程序终止时做一些资源释放操作
        System.out.println("=========contextDestroyed=========");
    }
}
