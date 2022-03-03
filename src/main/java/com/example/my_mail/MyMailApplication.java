package com.example.my_mail;

import com.example.my_mail.common.Student;
import com.example.my_mail.common.TestEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Scanner;

@SpringBootApplication
@EnableScheduling
public class MyMailApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(MyMailApplication.class, args);
		run.publishEvent(new TestEvent("66"));
	}
}
