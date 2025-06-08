package com.example.OneToOne3.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OneToOne3.Entity.Applications;
import com.example.OneToOne3.service.ApplicationService;

@RestController
@RequestMapping("/api")
public class ApplicationController {

	@Autowired
	ApplicationService ApplicateService;
	
	@PostMapping("/{applicateId}")
	public Applications saveApplications(@RequestBody Applications application,@PathVariable int applicateId)
	{
		return ApplicateService.saveApplications(application,applicateId);
	}
	
	@GetMapping
	public List<Applications>getApplications()
	{
		return ApplicateService.getAll();
	}
	
	public ResponseEntity<Map<String,Object>>DeleteAppli()
	{
		return null;
	}
}
