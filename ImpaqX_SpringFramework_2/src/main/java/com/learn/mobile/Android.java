package com.learn.mobile;

import org.springframework.stereotype.Component;

@Component
public class Android implements Mobile{

	@Override
	public void processor() {
		String processor ="snapdragon 8 Gen 1";
		System.out.println("Processor"+ processor);
		
	}

}
