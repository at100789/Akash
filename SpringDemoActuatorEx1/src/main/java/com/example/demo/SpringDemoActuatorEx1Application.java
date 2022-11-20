package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoActuatorEx1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoActuatorEx1Application.class, args);
		
		System.out.println("Welcome to Actuator");
	}

}
