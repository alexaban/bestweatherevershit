package com.forecast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.io.PrintWriter;


@SpringBootApplication
public class WeatherForecast extends HttpServlet{

    public static void main(String[] args) {
        SpringApplication.run(WeatherForecast.class, args);


    }

}
