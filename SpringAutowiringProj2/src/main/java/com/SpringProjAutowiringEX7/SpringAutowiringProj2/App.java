package com.SpringProjAutowiringEX7.SpringAutowiringProj2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext cfg= new ClassPathXmlApplicationContext();
    	Car c=(Car)cfg.getBean("cr");
    	System.out.println(c);
    }
}
