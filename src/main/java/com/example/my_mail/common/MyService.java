package com.example.my_mail.common;

import org.springframework.context.annotation.Scope;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @Author yanghexiang
 * @Date: 2022/2/16 10:16
 * @Description:
 **/
@Service
public class MyService {

    @EventListener(TestEvent.class)
    public void test(TestEvent event) {
        System.out.println("ok");
    }
}
