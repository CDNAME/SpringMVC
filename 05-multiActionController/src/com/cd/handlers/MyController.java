package com.cd.handlers;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyController extends MultiActionController {
    
    public ModelAndView doFirst(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        //其底层执行的是request.setAttribute()方法
        mv.addObject("message", "执行doFirst()方法!");
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }
    public ModelAndView doSecond(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        //其底层执行的是request.setAttribute()方法
        mv.addObject("message", "执行doSecond()方法!!");
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }
}
