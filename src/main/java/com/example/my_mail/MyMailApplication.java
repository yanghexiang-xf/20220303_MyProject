package com.example.my_mail;

import com.example.my_mail.common.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MyMailApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(MyMailApplication.class, args);
	}
}
