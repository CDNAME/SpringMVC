package com.cd.handlers;

import com.cd.beans.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller     //表示当前类是一个处理器
@RequestMapping("/test")     //放到类名上，就是命名空间
public class MyController3 {
    
    @RequestMapping("/some.do")
    public String doSome() {
        //当在applicationContext中配置了InternalResourceViewResolver视图解析器时，这里表示逻辑视图
        //return "welcome1";
        //这里表示物理视图
        //return "/WEB-INF/jsp/welcome1.jsp";
        //视图对象名称
        return "internalResource";
    }
}
