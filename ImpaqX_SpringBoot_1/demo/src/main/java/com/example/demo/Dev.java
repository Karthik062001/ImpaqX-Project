package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Dev {
	

//	@Autowired //field injection
	Laptop  cmp;
	
	
	
	//Constructor injection
//	public Dev(Laptop lap) {
//		
//		this.lap=lap;
//	}

	
	@Autowired    //settwr Injection
   // @Qualifier("laptop")
	public void setComp(Laptop  cmp)
	{
		
		this.cmp=cmp;
	}
	
	public void build(){
		
		cmp.compile();
		
		System.out.println("We buld the project");
	}
}
