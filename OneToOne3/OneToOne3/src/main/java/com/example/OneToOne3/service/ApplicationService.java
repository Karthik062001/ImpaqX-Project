package com.example.OneToOne3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OneToOne3.Entity.Applicant;
import com.example.OneToOne3.Entity.Applications;
import com.example.OneToOne3.repository.ApplicantRepository;
import com.example.OneToOne3.repository.ApplicationRepository;

@Service
public class ApplicationService {

	@Autowired
	ApplicationRepository applicatRepo;
	
	@Autowired
	ApplicantRepository apprepo;
	
	public Applications saveApplications(Applications application,int applicateId)
	{
		Optional<Applicant> applicate = apprepo.findById(applicateId);
		Applicant app = applicate.get();
		application.setApplicant(app);
		return applicatRepo.save(application);
	}

	public List<Applications> getAll() {
		
		return applicatRepo.findAll();
	}
}
