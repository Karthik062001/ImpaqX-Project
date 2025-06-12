package com.example.OneToOne3.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
import com.example.OneToOne3.Entity.Job;
import com.example.OneToOne3.repository.ApplicantRepository;
import com.example.OneToOne3.service.JobService;

@RestController
@RequestMapping("/api/job")
public class JobController {

	private static final Logger logger = LogManager.getLogger(JobController.class);
	
	JobService jservice;
	
	ApplicantRepository apprepo;
	
	@Autowired
	public JobController(JobService jservice,ApplicantRepository apprepo) {
		this.jservice=jservice;
		this.apprepo=apprepo;
	}

	@PostMapping
	public Job saveJob(@RequestBody Job job)
	{
		
		logger.info("Job saved in the database");
		logger.debug("This is a debug message.");
		 logger.trace("This is a trace message.");
		
			return jservice.saveJob(job);        
	}
	
	@GetMapping("/{id}")
	public Optional<Job> getJob(@PathVariable int id)
	{
		logger.info("Get the job with id "+id);
		return jservice.getJob(id);
	}
	
	@GetMapping
	public List<Job> getAllJob()
	{
		logger.info("Getting list of all jobs");
		return jservice.getAllJob();
	}
	
	@PostMapping("/add-job-to-applicant")
	public Applicant addJobtoApplicant(@RequestParam int applicantId, @RequestParam int jobId)
	{
		logger.info("adding job "+jobId+" to the applicant "+applicantId);
		return jservice.addJobtoApplicant(applicantId,jobId);
	}
	
	@PutMapping("/update/{id}")
	public Job updateJob(@PathVariable int id, @RequestBody Job updatedJob)
	{
		logger.info("updating the job "+id);
		return jservice.updateJob(id, updatedJob);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Map<String,Object>> deleteJob(@PathVariable int id)
	{
		jservice.deleteJob(id);
		logger.info("deleting the job "+id);
		Map<String,Object> response=new HashMap<String, Object>();
		response.put("message:", "Applicant Deleted successfully");
		response.put("StatusCode:", HttpStatus.ACCEPTED.value());
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/find-job-by-appliid")
	public List<Job> findJobsByApplicantId(@RequestParam int applicantId)
	{
		return jservice.findJobsByApplicantId(applicantId);
	}
	
}
