package com.learn.Hibernet.Hibernetprj2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     
    	Configuration cfg= new Configuration();
    	cfg.configure();
    	SessionFactory factory = cfg.buildSessionFactory();
    	Session ssn=factory.openSession();
    	Transaction trans=ssn.beginTransaction();
    	Student st= new Student (13,"Anjali",22);
    	ssn.save(st);
    	trans.commit();
    	
    	System.out.println("Student object is created");
    }
}
