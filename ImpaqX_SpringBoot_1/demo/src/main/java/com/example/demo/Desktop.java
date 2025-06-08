package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("desktop")
public class Desktop implements Computer {

	public void compile()
	{
		System.out.println("Desktop Compile");
	}
}
