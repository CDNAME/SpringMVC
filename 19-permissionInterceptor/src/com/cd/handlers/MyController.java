package com.cd.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller     
@RequestMapping("/test")     
public class MyController {
    
    @RequestMapping("/some.do")
    public String doSome() {
        System.out.println("执行处理器的doSome()方法");
        
        return "/welcome.jsp";
    }
    
    
}
