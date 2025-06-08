package com.example.circularDependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alphabet2 {


	private Alphabet1 alphabet1;

	@Autowired
	public void B(Alphabet1 alphabet1)
	{
		this.alphabet1=alphabet1;
	}
	
	public void dosome()
	{
		System.out.println("B is doing the task");
	}
}
