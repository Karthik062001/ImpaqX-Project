package com.learn.maven.spring.ImpaqX_SpringBoot_3;

import org.springframework.stereotype.Component;

@Component("Apple")
public class Apple implements Mobile {

	@Override
	public void processor() {
		String processor="A-16 bionic";
		System.out.println("Processor used in Iphone"+processor);
		
	}

	
}
