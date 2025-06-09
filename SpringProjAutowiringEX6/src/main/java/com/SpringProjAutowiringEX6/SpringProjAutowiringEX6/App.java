package com.SpringProjAutowiringEX6.SpringProjAutowiringEX6;

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
 	   Mobile m=(Mobile)cfh.getBean("mob");
 	   System.out.println(m);
 	   
 	   Mobile mn=(Mobile)cfh.getBean("mob2");
 	   System.out.println(mn);
 	   
     	Person p=(Person)cfh.getBean("pr");
     	System.out.println(p);
    }
}
