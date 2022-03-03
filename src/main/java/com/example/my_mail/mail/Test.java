package com.example.my_mail.mail;

import cn.hutool.http.HttpRequest;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * @author yanghexiang
 * @date: 2021/11/16 3:36
 **/
public class Test {
	public static String getWeatherInfo() {
		String body = HttpRequest.get("http://wthrcdn.etouch.cn/weather_mini?citykey=101281307").execute().body();
		Gson gson = new Gson();
		JsonObject jsonObject = gson.fromJson(body, JsonObject.class);
		JsonArray asJsonArray = jsonObject.get("data").getAsJsonObject().get("forecast").getAsJsonArray();
		StringBuffer stringBuffer = new StringBuffer("杨鹤祥牌天气预报温馨提示 : 天气预报 : " + "\n");
		for (JsonElement jsonElement : asJsonArray) {
			stringBuffer.append(jsonElement.getAsJsonObject().get("date").getAsString() + "\t");
			stringBuffer.append(jsonElement.getAsJsonObject().get("high").getAsString() + "\t");
			stringBuffer.append(jsonElement.getAsJsonObject().get("low").getAsString() + "\t");
			stringBuffer.append("天气 : " + jsonElement.getAsJsonObject().get("type").getAsString() + "\t\t");
			stringBuffer.append("\n");
		}
		System.out.println(stringBuffer.toString());
		return stringBuffer.toString();
	}
}
