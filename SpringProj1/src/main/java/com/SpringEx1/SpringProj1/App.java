package com.SpringEx1.SpringProj1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	 ClassPathXmlApplicationContext cpx=   new ClassPathXmlApplicationContext("ConflictFile.xml");
    	Student s= (Student)cpx.getBean("st");
    	System.out.println(s);
    }
}
