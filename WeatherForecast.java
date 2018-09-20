package com.forecast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class WeatherForecast {

	public static void main(String[] args) {
		SpringApplication.run(WeatherForecast.class, args);

	}
}
