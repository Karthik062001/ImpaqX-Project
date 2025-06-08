package com.learn.maven.json.JsonTrial;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.core.type.*;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App 
{
    public static void main( String[] args )
    {
    	try {
       ObjectMapper mapper=new ObjectMapper();
       InputStream input= new FileInputStream(new File("C:\\Users\\karth\\OneDrive\\Documents\\new.txt"));
       TypeReference<List<JsonTrial>> typereference= new TypeReference<List<JsonTrial>>() {
	};
       List<JsonTrial> Jsontrial=mapper.readValue(input,typereference);
       
       for(JsonTrial j:Jsontrial)
       {
    	   System.out.println("name is "+j.getName()+ " Address is "+ j.getAddress()+ "age is "+j.getAge());
       }
    	}
    	catch (Exception e)
    	{
    		e.printStackTrace();
    	}
    }

	
}
