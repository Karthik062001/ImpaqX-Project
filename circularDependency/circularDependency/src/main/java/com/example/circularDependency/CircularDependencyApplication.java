package com.example.circularDependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CircularDependencyApplication {

	public static void main(String[] args) {
		ApplicationContext context;
		context =SpringApplication.run(CircularDependencyApplication.class, args);
		Alphabet1 data = context.getBean(Alphabet1.class);
	}

}
