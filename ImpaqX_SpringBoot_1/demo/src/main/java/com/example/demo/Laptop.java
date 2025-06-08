package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("Laptop")
public class Laptop implements Computer {
	
	public void compile()
	{
		System.out.println("laptop compilation done with 404");
	}

}
