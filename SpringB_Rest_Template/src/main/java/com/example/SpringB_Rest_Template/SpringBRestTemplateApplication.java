package com.example.SpringB_Rest_Template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBRestTemplateApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBRestTemplateApplication.class, args);
	}
	
	@Bean
	public  RestTemplate restTemp()
	{
		return new RestTemplate();
	}

}
