package com.example.OneToOne2.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OneToOne2.Repository.ApplicationRepository;
import com.example.OneToOne2.Repository.ResumeRepository;
import com.example.OneToOne2.entity.Applicant;

@Service
public class ApplicationService{

	@Autowired
	ResumeRepository resRepo;
	
	@Autowired
	ApplicationRepository appRepo;
	
	public Applicant saveApplicant(Applicant app)
	{
		return appRepo.save(app);
	}

	public Optional<Applicant> getappli(int id) {
		
		return appRepo.findById(id);
	}

	
}
