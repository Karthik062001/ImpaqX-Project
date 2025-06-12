package com.example.OneToOne3.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.OneToOne3.Entity.Applicant;
import com.example.OneToOne3.Entity.Resume;
import com.example.OneToOne3.service.ResumeService;



@RestController
@RequestMapping("/api/resume")
public class ResumeController {

	@Autowired
	ResumeService resService;
	
	@PostMapping("/{applicantId}/resume")
	public ResponseEntity<Object> addResume(@PathVariable int applicantId, @RequestBody Resume res)
	{
		return ResponseEntity.ok(resService.addResume(applicantId, res));
	}
	
	@GetMapping
	public List<Resume> getAllResume()
	{
		return resService.getAllResume();
	}
	
//	@GetMapping("/{id}")
//	public Optional<Resume> getById(@PathVariable int id)
//	{
//		return resService.getById(id);
//	}
	
	@PutMapping("/{id}")
	public Resume updateResume(@PathVariable int id,@RequestBody Resume res)
	{
		return resService.updateResume(id,res);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Map<String,Object>>deleteResume(@PathVariable int id)
	{
		resService.deleteResume(id);
		Map<String,Object> data=new HashMap<String, Object>();
		data.put("Message", "The Resume "+id+"is deleted Successfully");
		data.put("Message", HttpStatus.ACCEPTED.value());
		return ResponseEntity.ok(data);
	}
	
	@GetMapping("/id")
	public  Resume findResumeById(@RequestParam int id)
	{
		return resService.findResumeById(id);
	}
	
	@GetMapping("/applicantId")
	public List<Resume> findResumeByApplicantId(@RequestParam int applicantId)
	{
		return resService.findResumeByApplicantId(applicantId);
	}
	@GetMapping("/orderByresume")
	public List<Applicant> orderByresumeContent(int resumeId)
	{
		return resService.orderByresumeContent(resumeId);
	}
}
