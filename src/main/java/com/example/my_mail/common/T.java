package com.example.my_mail.common;

import com.example.my_mail.Client;
import org.apache.catalina.core.ApplicationContext;
import org.apache.catalina.core.StandardContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.channels.Channel;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author yanghexiang
 * @Date: 2022/1/7 17:30
 * @Description:
 **/

public class T extends ApplicationContext {

    public T(StandardContext context) {
        super(context);
    }
}
