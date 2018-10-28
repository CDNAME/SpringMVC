package com.cd.handlers;

import com.cd.editors.MyDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller     //表示当前类是一个处理器
@RequestMapping("/test")     //放到类名上，就是命名空间
public class MyController {
    
    @RequestMapping("/register.do")
    public ModelAndView doRegister(int age, Date birthday) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("age", age);
        mv.addObject("birthday", birthday);
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }
    
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        //绑定单个日期类型
        //binder.registerCustomEditor(Date.class, new CustomDateEditor(df, true));
        //绑定多个日期类型
        binder.registerCustomEditor(Date.class, new MyDateEditor());
    }
    
}
