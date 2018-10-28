package com.cd.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller     //表示当前类是一个处理器
public class MyController {
    
    @RequestMapping({"/my.do", "/hello.do"})
    public ModelAndView doSome(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        //其底层执行的是request.setAttribute()方法
        mv.addObject("message", "执行doFirst()方法!");
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }

    @RequestMapping("/second.do")       //建议路径以/开头
    public ModelAndView doSecond(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        //其底层执行的是request.setAttribute()方法
        mv.addObject("message", "执行doSecond()方法!!");
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }
}
