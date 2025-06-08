package com.learn.maven.spring.SpringFrameworkDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext context= new ClassPathXmlApplicationContext("Config.xml");
    	Dev obj=(Dev) context.getBean("de");
    	obj.build();
//    	System.out.println(obj.getAge());
//    	System.out.println(obj.getName());

    }
}
