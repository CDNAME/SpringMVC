package com.cd.handlers;

import com.cd.beans.Student;
import com.cd.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class StudentController{
    @Autowired
    @Qualifier("studentService")
    private IStudentService service;

    public void setService(IStudentService service) {
        this.service = service;
    }
    
    @RequestMapping("/register.do")
    public String handleRequest(String name, int age) throws Exception {
        Student student = new Student(name, age);
        
        service.addStudent(student);
        
        return "/welcome.jsp";
    }
}
