package com.example.SpringDataJPA0.controller;

import java.rmi.StubNotFoundException;
import java.util.List;
import java.util.Optional;

import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringDataJPA0.entity.Student;
import com.example.SpringDataJPA0.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {

	private StudentService stdService;
	
	public StudentController(StudentService stdService) {
		this.stdService = stdService;
	}

	@PostMapping
	public Student addStudents(@RequestBody Student std) {
		return stdService.addStudent(std);
	}

//	Post mapping using request Param
	@PostMapping("/add")
	public Student addStudentByReqParam(@RequestParam Student std) {
		return stdService.addStudent(std);
	}

	@GetMapping("/all")
	public List<Student> getStudent() {
		return stdService.getAll();
	}

//	getting the student data by id using request header 
	@GetMapping
	public Optional<Student> getOne(@RequestHeader("X-Client-id") int id) throws StubNotFoundException
	{
		return stdService.geton(id);
	}

	// getting the Students using Request Param
	@GetMapping("/std/{id}")
	public Optional<Student> requParamStudent(@RequestParam int id) throws StubNotFoundException {
		return stdService.geton(id);
	}

	// getting the Students using Request Param
	@GetMapping("/stdMany")
	public List<Student> reqPara(@RequestParam List<Integer> id) {
		return stdService.getMany(id);
	}

	@PutMapping("{id}")
	public Student updateOne(@PathVariable int id, @RequestBody Student std) throws Exception {
		return stdService.update(id, std);
	}

	@DeleteMapping("{id}")
	public void deleteData(@PathVariable int id) {
		stdService.delete(id);
	}
	
	
}
