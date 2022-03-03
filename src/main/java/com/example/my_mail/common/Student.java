package com.example.my_mail.common;

import cn.hutool.core.util.RandomUtil;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @Author yanghexiang
 * @Date: 2021/12/10 14:23
 * @Description:
 **/

@Component
@Scope("prototype")
public class Student implements Serializable {

    String id ;
    int age;
    String name;


    public Student() {

        System.out.println("------");
    }

    public Student(int age) {
        this.age = age;
        System.out.println("++++++");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
