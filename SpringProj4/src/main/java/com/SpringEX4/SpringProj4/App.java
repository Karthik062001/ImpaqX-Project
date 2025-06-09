package com.SpringEX4.SpringProj4;

// wiring in between the bean 
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext  cfh =new ClassPathXmlApplicationContext("Config.xml");
    		Trainee1 e=(Trainee1)cfh.getBean("tr1");
    	System.out.println(e);
    }
}
