package com.cd.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller     //表示当前类是一个处理器
@RequestMapping("/test")     //放到类名上，就是命名空间
public class MyController2 {
    
    @RequestMapping("/register.do")
    public ModelAndView doRegister(@RequestParam("pname") String name, int age) {   //@RequestParam校正请求参数，如果一致则不需要写
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        
        ModelAndView mv = new ModelAndView();
//        mv.addObject("name", name).addObject("age", age);
        mv.addObject("name", name);     //解决中文乱码框架，需要配置一下web.xml的Filter
        mv.addObject("age", age);
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }
    
    @RequestMapping(value={"/my.do", "hello.do"}, method=RequestMethod.POST)    //建议路径以/开头
    public ModelAndView doSome(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        //其底层执行的是request.setAttribute()方法
        mv.addObject("message", "执行doFirst()方法!");
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }

    @RequestMapping(value="/second.do", params={"name", "!age"})       //必须携带参数name(也可以指定参数值),不能携带参数age
    public ModelAndView doSecond(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        //其底层执行的是request.setAttribute()方法
        mv.addObject("message", "执行doSecond()方法!!");
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }

    @RequestMapping("/third*.do")       //资源名称必须以third开头
    public ModelAndView doThird(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        //其底层执行的是request.setAttribute()方法
        mv.addObject("message", "执行doThird()方法!");
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }

    @RequestMapping("/*fourth.do")       //资源名称必须以fourth结尾
    public ModelAndView doFourth(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        //其底层执行的是request.setAttribute()方法
        mv.addObject("message", "执行doFourth()方法!");
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }

    @RequestMapping("/*/fifth.do")       //路径级数的绝对匹配，即要求在test与fifth之间必须要有一级路径
    public ModelAndView doFifth(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        //其底层执行的是request.setAttribute()方法
        mv.addObject("message", "执行doFifth()方法!");
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }

    @RequestMapping("/**/sixth.do")       //要求在test与fifth之间可以包含多级路径，也可以没有其他路径
    public ModelAndView doSixth(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        //其底层执行的是request.setAttribute()方法
        mv.addObject("message", "执行doSixth()方法!");
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }

    
}
