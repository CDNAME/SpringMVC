package com.cd.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller     //表示当前类是一个处理器
@RequestMapping("/test")     //放到类名上，就是命名空间
public class MyController2 {
    
    //  http://localhost:8080/springmvc/test/register2.do
    @RequestMapping("/register2.do")
    public String doRegister(String name, int age, Model model) {
        model.addAttribute("pname", name);
        model.addAttribute("age", age);
        //  http://localhost:8080/springmvc/other.do
        //return "redirect:/other.do";

        //  http://localhost:8080/springmvc/test/other.do
        return "redirect:other.do";
    }

    //  http://localhost:8080/springmvc/test/other.do
    @RequestMapping("/other.do")
    public String doOther(String pname, int age) {  //使用参数接收Model传来的数据
        System.out.println("pname = " + pname);
        System.out.println("age = " + age);
        return "/welcome.jsp";
    }
    
    
    
}
