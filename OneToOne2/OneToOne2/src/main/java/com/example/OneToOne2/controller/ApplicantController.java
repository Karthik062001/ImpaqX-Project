package com.example.OneToOne2.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OneToOne2.entity.Applicant;
import com.example.OneToOne2.service.ApplicationService;

@RestController
@RequestMapping("/api")
public class ApplicantController {

	@Autowired
	ApplicationService appserv;
	
	@PostMapping
	public Applicant saveApp(@RequestBody Applicant app)
	{
		return appserv.saveApplicant(app);
	}
	
	@GetMapping("/{id}")
	public Optional<Applicant> getAppli(@PathVariable int id)
	{
		return appserv.getappli(id);
	}
}
