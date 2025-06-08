package com.example.SpringRest1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/studentdata")
public class StudentMap {

	Student std;
	@GetMapping("{Studentid}")
	public Student getStudent(int id)
	{
		return std;
		
	}
	
	@PostMapping
	public String createStudent(@RequestBody Student std)
	{
		this.std=std;
		return "Student created";
	}
	
}
