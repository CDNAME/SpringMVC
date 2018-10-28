package com.cd.handlers;

import com.cd.beans.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller     //表示当前类是一个处理器
@RequestMapping("/test")     //放到类名上，就是命名空间
public class MyController3 {
    
    @RequestMapping(value="/myAjax3.do")
    @ResponseBody       //将返回的数据放入到响应体中
    public Object doAjax() {
        return new Student("张三", 23);
    }

}
