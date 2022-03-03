package com.example.my_mail.common;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @Author yanghexiang
 * @Date: 2022/2/22 20:46
 * @Description:
 **/
@Service
public class TestService {

    @EventListener(T.class)
    public void hello(T t) {

    }
}
