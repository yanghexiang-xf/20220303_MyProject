package com.example.my_mail.common;

import org.springframework.context.ApplicationEvent;

/**
 * @Author yanghexiang
 * @Date: 2022/2/22 20:21
 * @Description:
 **/
public class TestEvent extends ApplicationEvent {
    public TestEvent(Object source) {
        super(source);
    }
}
