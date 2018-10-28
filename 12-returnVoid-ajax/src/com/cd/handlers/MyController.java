package com.cd.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller     //表示当前类是一个处理器
@RequestMapping("/test")     //放到类名上，就是命名空间
public class MyController {
    
    @RequestMapping("/myAjax.do")
    public void doAjax(String name, String age, HttpServletResponse response) throws IOException {
        System.out.println("name = " + name);
        System.out.println("age = " + age);

        String jsonStr = "{"+"\"name\":\"" + name + "\", \"age\":" + age + "}";

        PrintWriter out = response.getWriter();
        out.print(jsonStr);
        out.close();
    }
}
