package com.cd.handlers;

import com.cd.beans.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller     //表示当前类是一个处理器
@RequestMapping("/test")     //放到类名上，就是命名空间
public class MyController2 {
    //给出地址 http://localhost:8080/springmvc/test/陈登/22/register.do
    @RequestMapping("/{pname}/{age}/register.do")
    public ModelAndView doRegister(@PathVariable("pname") String name, @PathVariable int age) {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", name);
        mv.addObject("age", age);
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
        
    }
}
