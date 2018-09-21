package com.forecast;

import org.json.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.net.*;
import java.util.*;


@SpringBootApplication
public class WeatherForecast {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(WeatherForecast.class, args);
		URLConnection connection = new URL("https://api.met.no/weatherapi/locationforecast/1.9/?lat=59.913971&lon=10.752260").openConnection();
		connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
		connection.connect();

		BufferedReader buffer = new BufferedReader(new InputStreamReader(connection.getInputStream()));

		StringBuilder stringBuilder = new StringBuilder();
		String line;

		while ((line = buffer.readLine()) != null) {
			stringBuilder.append(line);
		}
		JSONObject jsondata = XML.toJSONObject(stringBuilder.toString());
		JSONObject jsondata1 = XML.toJSONObject(stringBuilder.toString());

		jsondata = (JSONObject) jsondata.get("weatherdata");
		jsondata = (JSONObject) jsondata.get("product");
		JSONArray array2 = jsondata.getJSONArray("time");

		jsondata1 = (JSONObject) jsondata1.get("weatherdata");
		jsondata1 = (JSONObject) jsondata1.get("product");
		JSONArray array = jsondata1.getJSONArray("time");

		jsondata = array.getJSONObject(0);
		jsondata = (JSONObject) jsondata.get("location");
		jsondata = (JSONObject) jsondata.get("temperature");
		Double value = (Double) jsondata.get("value");

		jsondata1 =  array2.getJSONObject(1);
		jsondata1 = (JSONObject)jsondata1.get("location");
		jsondata1 = (JSONObject)jsondata1.get("symbol");
		String id = (String)jsondata1.get("id");
		System.out.println(value.toString() + id);


	}
}
