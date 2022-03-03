package com.example.my_mail.common;

import java.lang.annotation.*;

/**
 * @Author yanghexiang
 * @Date: 2021/12/24 10:20
 * @Description:
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAnnotation {
    int cmdid();
}
