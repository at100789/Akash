package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class appConfig {
	
	@Value("${output.message}")
	private String msg;
	
	@Profile(value = "uat")
	@Bean
	public String getData() {
	
	System.out.println("UAT Data "+msg);
	return msg;
	}
	
	
	@Profile(value = "test")
	@Bean
	public String test() {
		
		System.out.println("Test Data "+msg);
		return msg;
	}
}
