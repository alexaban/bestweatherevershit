package com.forecast;

import org.json.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.net.*;


@SpringBootApplication
public class WeatherForecast {

	static String latO = "59.913971";
	static String lonO = "10.752260";

	public static void main(String[] args) throws IOException {
		SpringApplication.run(WeatherForecast.class, args);

		//WeatherForecast wth = new WeatherForecast();

		//wth.information(latO, lonO);

	}
}
