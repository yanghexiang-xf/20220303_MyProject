package com.example.my_mail.mail;

import cn.hutool.extra.mail.MailUtil;

/**
 * @author yanghexiang
 * @date: 2021/11/16 11:40
 **/
public class MailTest {
	public static void senMail() {
		MailUtil.send("2310406885@qq.com", "天气预报", Test.getWeatherInfo(), false);
	}
}
