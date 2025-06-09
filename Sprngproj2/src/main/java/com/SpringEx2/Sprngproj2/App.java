package com.SpringEx2.Sprngproj2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   ClassPathXmlApplicationContext  cfh =new ClassPathXmlApplicationContext("Conflix.xml");
    	
    	Student s= (Student)cfh.getBean("st");
    	System.out.println(s);
    }
}
