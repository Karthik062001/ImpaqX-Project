package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bank1 implements Bank{

	@Autowired
	Employee1 emp;
	
	@Override
	public void bankDetails() {
		System.out.println("Bank details");
		emp.details();
	}

}
