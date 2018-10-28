package com.cd.handlers;

import com.cd.exceptions.AgeException;
import com.cd.exceptions.NameException;
import com.cd.exceptions.StudentException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BaseController {
    
    //处理AgeException异常
    @ExceptionHandler(AgeException.class)
    public ModelAndView handlerAgeException( Exception ex) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("ex", ex);
        //执行一些操作
        mv.setViewName("/errors/ageError.jsp");
        return mv;
    }

    //处理NameException异常
    @ExceptionHandler(NameException.class)
    public ModelAndView handlerNameException( Exception ex) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("ex", ex);
        //执行一些操作
        mv.setViewName("/errors/nameError.jsp");
        return mv;
    }

    //处理其他异常
    @ExceptionHandler
    public ModelAndView handlerException( Exception ex) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("ex", ex);
        mv.setViewName("/errors/error.jsp");
        return mv;
    }
    
}
