package com.example.OneToOne2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OneToOne2.entity.Resume;
import com.example.OneToOne2.service.ResumeService;

@RestController
@RequestMapping("/api")
public class ResumeController {

	@Autowired
	ResumeService resService;
	
	@PostMapping("/{applicantId}/resume")
	public ResponseEntity<Object> addResume(@PathVariable int applicantId, @RequestBody Resume res)
	{
		return ResponseEntity.ok(resService.addResume(applicantId, res));
	}
}
