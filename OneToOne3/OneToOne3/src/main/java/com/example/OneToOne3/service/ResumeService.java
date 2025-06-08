package com.example.OneToOne3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import com.example.OneToOne3.Entity.Applicant;
import com.example.OneToOne3.Entity.Resume;
import com.example.OneToOne3.repository.ApplicantRepository;
import com.example.OneToOne3.repository.ResumeRepository;



@Service
public class ResumeService {

	@Autowired
	ResumeRepository resRepo;
	
	@Autowired
	ApplicantRepository appRepo;

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

	public List<Resume> getAllResume() {
		
		return resRepo.findAll();
	}

	public Resume updateResume(int id, Resume res) {
	
		Optional<Resume> resume = resRepo.findById(id);
		if(resume!=null)
		{
			Resume existing = resume.get();
			existing.setResumeContent(res.getResumeContent());
			return resRepo.save(existing);
		}
		else
		{
			return null;
		}
		
	}

	public void deleteResume(int id) {
		
		resRepo.deleteById(id);	
	}

	public Optional<Resume> getById(int id) {
		return resRepo.findById(id);
	
	}
}
