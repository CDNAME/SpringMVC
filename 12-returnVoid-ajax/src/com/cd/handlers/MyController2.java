package com.cd.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller     //表示当前类是一个处理器
@RequestMapping("/test")     //放到类名上，就是命名空间
public class MyController2 {
    
    @RequestMapping(value="/myAjax2.do", produces="text/html;charset=utf-8")
    @ResponseBody       //将返回的数据放入到响应体中
    public Object doAjax() {
        //return 123.456;
        //需要处理乱码的问题，produces="text/html;charset=utf-8"
        return "China北京";
    }
}
