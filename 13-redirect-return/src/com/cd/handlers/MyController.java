package com.cd.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller     //表示当前类是一个处理器
@RequestMapping("/test")     //放到类名上，就是命名空间
public class MyController {
    
    @RequestMapping("/register.do")
    public ModelAndView doRegister(@RequestParam("pname") String name, int age) {   //@RequestParam校正请求参数，如果一致则不需要写
        ModelAndView mv = new ModelAndView();
        mv.addObject("pname", name);
        mv.addObject("age", age);
        //request.getRequestDispatcher("").forward(request,response);
        //response.sendRedirect("");
        mv.setViewName("redirect:/welcome.jsp");
        return mv;
    }
    
}
