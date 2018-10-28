package com.cd.handlers;

import org.springframework.beans.TypeMismatchException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller     //表示当前类是一个处理器
@RequestMapping("/test")     //放到类名上，就是命名空间
public class MyController {
    
    @RequestMapping("/register.do")
    public ModelAndView doRegister(int age, Date birthday) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("age", age);
        mv.addObject("birthday", birthday);
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }
    
    /*
    @ExceptionHandler(TypeMismatchException.class)
    public ModelAndView exceptionResolver(Exception ex) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("ex", ex);
        mv.setViewName("/index.jsp");
        return mv;
    }
    */
    
    //为了实现填错表单返回重填时，能够显示以前填写的信息，需要HttpServletRequest
    @ExceptionHandler(TypeMismatchException.class)
    public ModelAndView exceptionResolver(HttpServletRequest request, Exception ex) {
        ModelAndView mv = new ModelAndView();
        
        String age = request.getParameter("age");
        String birthday = request.getParameter("birthday");
        
        //捕获的异常信息
        String errorMSG = ex.getMessage();
        if(errorMSG.contains(age)) {
            mv.addObject("ageErrors", "年龄输入有误");    
        }
        if(errorMSG.contains(birthday)) {
            mv.addObject("birthErrors", "生日的日期格式输入有误");    
        }
        
        mv.addObject("age", age);
        mv.addObject("birthday", birthday);
        //mv.addObject("ex", ex);
        mv.setViewName("/index.jsp");

        return mv;
    }
    
}
