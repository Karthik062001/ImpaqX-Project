package com.example.SpringB_NativeQ.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.example.SpringB_NativeQ.entity.Job;
import com.example.SpringB_NativeQ.repository.JobRepository;

@Service
public class JobService {

	JobRepository jobrepo;
	
	@Autowired
	public JobService(JobRepository jobrepo)
	{
		this.jobrepo=jobrepo;
	}

	public Job saveJob(Job job) {
		
		return jobrepo.save(job);
	}

	public List<Job> getAllJob() {
		
		return jobrepo.findAll();
	}

	public Optional<Job> getOne(int id) {
		
		return jobrepo.findById(id);
	}

	public void deleteJob(int id) {
		
		jobrepo.deleteById(id);
	}
	
	
}
