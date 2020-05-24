package com.qyh.tpsofbd.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @description:拦截器注册类
 * @AUTHOR: qyh
 * @create: 2020-05-24 21:50
 **/
//不需要时注释掉注解即可
//@Configuration
public class CustomWebMvcConfigurer implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //可以链式调用,比如添加不拦截的url
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/api/*/**");
        //可添加多个拦截器
//        registry.addInterceptor(new TwoInterceptor()).addPathPatterns("api/*/**");
    }
}
