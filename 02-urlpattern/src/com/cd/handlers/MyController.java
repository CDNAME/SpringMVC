package com.cd.handlers;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        //其底层执行的是request.setAttribute()方法
        mv.addObject("message", "Hello SpringMVC World!");
        //mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        //当在applicationContext中配置了视图解析器时，按照下面格式写
        mv.setViewName("welcome");
        return mv;
    }
}
