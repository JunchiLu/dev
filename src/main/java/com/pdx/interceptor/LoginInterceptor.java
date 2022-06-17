package com.pdx.interceptor;

import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author PDX
 * @website https://blog.csdn.net/Gaowumao
 * @Date 2022-05-04 21:17
 * @Description
 */
//拦截所有请求，除非在WebMvcConfigurerAdapter中设置排除拦截的外都要进行拦截；
public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("token");
        System.out.println(token);
        if (request.getSession().getAttribute("user") == null){
            response.sendRedirect("/api");
            return false;
        }
        return true;
    }
}
