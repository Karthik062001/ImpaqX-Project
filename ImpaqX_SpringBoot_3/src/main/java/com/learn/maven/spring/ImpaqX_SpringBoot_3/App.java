package com.learn.maven.spring.ImpaqX_SpringBoot_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
	        Process mob = context.getBean(Process.class); 
	        mob.run();
	        
    }
}
