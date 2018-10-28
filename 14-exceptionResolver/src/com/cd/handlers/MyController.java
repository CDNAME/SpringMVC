package com.cd.handlers;

import com.cd.exceptions.AgeException;
import com.cd.exceptions.NameException;
import com.cd.exceptions.StudentException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller     //表示当前类是一个处理器
@RequestMapping("/test")     //放到类名上，就是命名空间
public class MyController extends BaseController {
    
    @RequestMapping("/register.do")
    public ModelAndView doRegister(String name, int age) throws StudentException {
        
        //int i = 3/0;
        
        if(!"beijing".equals(name)) {
            throw new NameException("用户名不正确");
        }

        if(age > 60) {
            throw new AgeException("年龄过大");
        }

        ModelAndView mv = new ModelAndView();
        mv.addObject("name", name);
        mv.addObject("age", age);
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }
    
    /*
    @ExceptionHandler
    public ModelAndView handlerException( Exception ex) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("ex", ex);
        mv.setViewName("/errors/error.jsp");

        if(ex instanceof NameException) {
            //执行一些操作
            mv.setViewName("/errors/nameError.jsp");
        }

        if(ex instanceof NameException) {
            //执行一些操作
            mv.setViewName("/errors/nameError.jsp");
        }
        
        return mv;
    }
    */

}
