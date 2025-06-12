package com.example.SpringB_NativeQ.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringB_NativeQ.entity.Job;
import com.example.SpringB_NativeQ.repository.JobRepository;
import com.example.SpringB_NativeQ.service.JobService;

@RestController
@RequestMapping("api/job")
public class JobController {

	JobService jobservice;
	
	@Autowired
	public JobController(JobService jobservice)
	{
		this.jobservice =jobservice;
	}
	
	@PostMapping("/save")
	public Job saveJob(@RequestBody Job job)
	{
		return jobservice.saveJob(job);
	}
	
	@GetMapping("/all")
	public List<Job> getAllJob()
	{
		return jobservice.getAllJob();
	}
	
	@GetMapping("/{id}")
	public Optional<Job>getOneJob(@PathVariable int id)
	{
		return jobservice.getOne(id);
	}
	
	public ResponseEntity<Map> deleteJob(@PathVariable int id)
	{
		 jobservice.deleteJob(id);
		 Map<String,Object> response=new HashMap<String, Object>();
			response.put("message", "Job "+id+" deleted succesfully");
			response.put("StatusCode", HttpStatus.ACCEPTED.value());
			return ResponseEntity.ok(response);
	}
}
