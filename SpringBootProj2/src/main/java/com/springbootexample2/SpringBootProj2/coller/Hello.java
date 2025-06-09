package com.springbootexample2.SpringBootProj2.coller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@GetMapping(value="/hi")
	public String helloS()
	{
		return "Hello Sprig boot";
	}
}
