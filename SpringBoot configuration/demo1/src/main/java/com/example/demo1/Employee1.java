package com.example.demo1;

import org.springframework.stereotype.Component;

@Component
public class Employee1 implements Employee{

	@Override
	public void details() {
		System.out.println("Employee1 Details");
		
	}

}
