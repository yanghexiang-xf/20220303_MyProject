package com.example.my_mail.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author yanghexiang
 * @Date: 2022/2/22 14:57
 * @Description:
 **/
@Controller
@ResponseBody
@RequestMapping("/test")
public class MyControl {

    @Autowired
    private ApplicationContext context;

    @RequestMapping("/hello")
    public String hello() {
        Student bean = context.getBean(Student.class);
        return bean.toString();
    }
}
