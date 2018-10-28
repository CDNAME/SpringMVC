package com.cd.handlers;

import com.cd.beans.Student;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller     //表示当前类是一个处理器
@RequestMapping("/test")     //放到类名上，就是命名空间
public class MyController {
    
    @RequestMapping("/register.do")
    public ModelAndView doRegister(@Validated Student student, BindingResult br) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("student", student);
        mv.setViewName("/WEB-INF/jsp/success.jsp");
        
        if(br.hasErrors()) {
            FieldError nameError = br.getFieldError("name");
            FieldError scoreError = br.getFieldError("score");
            FieldError mobileError = br.getFieldError("mobile");
            
            if(nameError != null) {
                String nameErrorMSG = nameError.getDefaultMessage();
                mv.addObject("nameErrorMSG", nameErrorMSG);
            }
            if(scoreError != null) {
                String scoreErrorMSG = scoreError.getDefaultMessage();
                mv.addObject("scoreErrorMSG", scoreErrorMSG);
            }
            if(mobileError != null) {
                String mobileErrorMSG = mobileError.getDefaultMessage();
                mv.addObject("mobileErrorMSG", mobileErrorMSG);
            }
            mv.setViewName("/index.jsp");
        }
        
        return mv;
    }
}
