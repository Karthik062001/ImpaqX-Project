package com.learn.maven.springframeworkDemo2.ImpaqX_SpringFramework_2;



import javax.management.InvalidApplicationException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(Configurationclas.class);
    	Payment pay=context.getBean(Payment.class);
    	pay.pay();
    	
    }
}
