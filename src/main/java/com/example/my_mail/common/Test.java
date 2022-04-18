package com.example.my_mail.common;

import org.springframework.stereotype.Component;

/**
 * @Author yanghexiang
 * @Date: 2022/4/2 14:20
 * @Description:
 **/
@Component(value = "test")
public class Test {
    public Test() {
        System.out.println("--");
        System.out.println(11);
        System.out.println(22);
        System.out.println(66666);
    }
}
