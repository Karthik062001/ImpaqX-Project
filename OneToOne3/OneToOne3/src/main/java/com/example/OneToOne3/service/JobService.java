package com.example.OneToOne3.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.OneToOne3.Entity.Applicant;
import com.example.OneToOne3.Entity.Job;
import com.example.OneToOne3.repository.ApplicantRepository;
import com.example.OneToOne3.repository.JobRepository;

@Service
public class JobService {

	@Autowired
	JobRepository jobrepo;
	
	@Autowired
	ApplicantRepository apprepo;
	
	public Job saveJob(Job j)
	{
		return jobrepo.save(j);
	}

	public Optional<Job> getJob(int id) {
		
		return jobrepo.findById(id);
	}

	public Applicant addJobtoApplicant(int applicantId, int jobId) {
		
		Optional<Applicant> applicant = apprepo.findById(applicantId);
		Optional<Job> job = jobrepo.findById(jobId);
		
		if (applicant.isPresent() && job.isPresent()) 
	        applicant.get().getJob().add(job.get()); 
	        return apprepo.save(applicant.get());	
	}

	public List<Job> getAllJob() {
		
		return jobrepo.findAll();
	}


	public Job updateJob(int id, Job updatedJob) {
	    Optional<Job> existingJobOpt = jobrepo.findById(id);

	    if (existingJobOpt.isPresent()) {
	        Job existingJob = existingJobOpt.get();
	        
	        
	        existingJob.setJobPosition(updatedJob.getJobPosition());
	        existingJob.setJobCode(updatedJob.getJobCode());
	        existingJob.setNoOfVaccancies(updatedJob.getNoOfVaccancies());
	      

	        return jobrepo.save(existingJob);
	    } else {
	        throw new RuntimeException("Job not found with ID: " + id);
	    }
	}

	public void deleteJob(int id) {
		if(!jobrepo.existsById(id))
		{
		   throw new ResponseStatusException(HttpStatus.NOT_FOUND, "The applicant is not present");
		}
	}
	
	public List<Job> findJobsByApplicantId(int applicantId){
		
		return jobrepo.findJobsByApplicantId(applicantId);
	}


}
