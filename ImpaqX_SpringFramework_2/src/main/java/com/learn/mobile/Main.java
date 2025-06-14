package com.learn.mobile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		 context.register(Config.class);
	        context.refresh(); 

	        Process mob = context.getBean(Process.class); 
	        mob.run();
	        context.close();
	}

}
