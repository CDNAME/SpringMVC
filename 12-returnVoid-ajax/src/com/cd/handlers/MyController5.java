package com.cd.handlers;

import com.cd.beans.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller     //表示当前类是一个处理器
@RequestMapping("/test")     //放到类名上，就是命名空间
public class MyController5 {
    
    @RequestMapping(value="/myAjax5.do")
    @ResponseBody       //将返回的数据放入到响应体中
    public Object doAjax() {
        List<Student> list = new ArrayList<>();
        list.add(new Student("张三", 23));
        list.add(new Student("李四", 24));

        return list;
    }

}
