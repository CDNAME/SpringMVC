package com.cd.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

@Controller     //表示当前类是一个处理器
@RequestMapping("/test")     //放到类名上，就是命名空间
public class MyController2 {
    
    @RequestMapping("/upload.do")
    public String doFileUpload(MultipartFile img, HttpSession session) throws IOException {

        String path = "D:\\Program Files\\IdeaProjects\\SpringMVC\\17-valication\\web\\images";
        
        //即使如果没有选择上传的文件，img的值不为null
        if(img.getSize() > 0) {
            //获取到上传文件的原始名称
            String fileName = img.getOriginalFilename();
            if(fileName.endsWith("jpg") || fileName.endsWith("png")){
                File file = new File(path, fileName);
                img.transferTo(file);
            }
            return "/success.jsp";
        }
        return "/error.jsp";
    }
}
