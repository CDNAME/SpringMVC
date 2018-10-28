package com.cd.handlers;

import com.cd.beans.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller     //表示当前类是一个处理器
@RequestMapping("/test")     //放到类名上，就是命名空间
public class MyController4 {
    
    @RequestMapping(value="/myAjax4.do")
    @ResponseBody       //将返回的数据放入到响应体中
    public Object doAjax() {
        Map<String, Student> map = new HashMap<>();
        map.put("stu1", new Student("张三", 23));
        map.put("stu2", new Student("李四", 24));
        return map;
    }

}
