package com.cd.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PermissionInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("执行PermissionInterceptor ----  preHandle()  ----");
        String user = (String)request.getSession().getAttribute("user");
        if("beijing".equals(user)) {
            return true;    //如果是这个用户，则直接返回true，该方法执行结束。
        }
        request.getRequestDispatcher("/fail.jsp").forward(request,response);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("执行PermissionInterceptor ----  postHandle()  ----");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception e) throws Exception {
        System.out.println("执行PermissionInterceptor ----  afterCompletion()  ----");
    }
}
