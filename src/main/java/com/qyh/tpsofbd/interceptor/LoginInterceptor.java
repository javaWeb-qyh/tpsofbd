package com.qyh.tpsofbd.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description:登录验证拦截器
 * @AUTHOR: qyh
 * @create: 2020-05-24 21:37
 **/
public class LoginInterceptor implements HandlerInterceptor{
    /**
     * @Description: 
     * 进入controller方法前
     * @Author: qyh
     * @Date: 2020/5/24 21:41
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("============preHandle============");
        String token=request.getParameter("access_token");
        //返回false,将不进入controller方法,返回空数据
        return true;
    }

    /**
     * @Description: 
     * 调用controler方法之后,视图渲染之前
     * @Author: qyh
     * @Date: 2020/5/24 21:42
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("============postHandle============");

    }

    /**
     * @Description: 
     * 整个完成之后,通常用于资源清理
     * @Author: qyh
     * @Date: 2020/5/24 21:43
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("============afterCompletion============");

    }
}
