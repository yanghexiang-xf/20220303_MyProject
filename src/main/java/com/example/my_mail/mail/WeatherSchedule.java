package com.example.my_mail.mail;

import cn.hutool.extra.mail.MailUtil;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author yanghexiang
 * @date: 2021/11/16 12:12
 **/
@Component
public class WeatherSchedule {

	@Scheduled(cron = "0 0 6 * * ?")
	public void sendWeather() {
		MailTest.senMail();
	}

	@Scheduled(cron = "0 0 23 * * ?")
	public void sendWeather1() {
		MailTest.senMail();
	}
}
