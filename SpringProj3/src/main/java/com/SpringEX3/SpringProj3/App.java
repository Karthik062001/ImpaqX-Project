package com.SpringEX3.SpringProj3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext  cfh =new ClassPathXmlApplicationContext("Config.xml");
    		Employee e=(Employee)cfh.getBean("emp1");
    	System.out.println(e);
    }
}
