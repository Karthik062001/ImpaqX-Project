package com.example.OneToOne2.service;

import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OneToOne2.Repository.ApplicationRepository;
import com.example.OneToOne2.Repository.ResumeRepository;
import com.example.OneToOne2.entity.Applicant;
import com.example.OneToOne2.entity.Resume;

@Service
public class ResumeService {

	@Autowired
	ResumeRepository resRepo;
	
	@Autowired
	ApplicationRepository appRepo;

	public Object addResume(int applicantId, Resume res) {
		
		Optional<Applicant> application = appRepo.findById(applicantId);
		if(application.isPresent())
		{
			Applicant applicant=application.get();
			res.setApplicant(applicant);
			return resRepo.save(res);
		}
		else
		{
			throw new RuntimeException("The application id is wrong");
		}
		
	}

}
