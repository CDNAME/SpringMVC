package com.cd.handlers;

import com.cd.beans.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller     //表示当前类是一个处理器
@RequestMapping("/test")     //放到类名上，就是命名空间
public class MyController {
    
    @RequestMapping("/register.do")
    public ModelAndView doRegister(Student student) {
        System.out.println("name = " + student.getName());
        System.out.println("age = " + student.getAge());
        
        System.out.println("school = " + student.getSchool());
        
        ModelAndView mv = new ModelAndView();
        mv.addObject("student", student);
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
        
    }
}
