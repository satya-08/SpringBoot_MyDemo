package com.example.MyDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyDemoApplication {

	public static void main(String[] args) {
		ApplicationContext content= SpringApplication.run(MyDemoApplication.class, args);
		Dev obj=content.getBean(Dev.class);
		obj.build();
	}

}
