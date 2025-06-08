package com.example.OneToOne3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import com.example.OneToOne3.Entity.Applicant;
import com.example.OneToOne3.Entity.Applications;
import com.example.OneToOne3.Entity.Job;
import com.example.OneToOne3.Entity.Resume;
import com.example.OneToOne3.repository.ApplicantRepository;
import com.example.OneToOne3.repository.ApplicationRepository;
import com.example.OneToOne3.repository.JobRepository;
import com.example.OneToOne3.repository.ResumeRepository;




@Service
public class ApplicantService {

	@Autowired
	ResumeRepository resRepo;

	@Autowired
	ApplicantRepository appRepo;

	@Autowired
	ApplicationRepository applirepo;
	
	@Autowired
	JobRepository jobrepo;


	public Applicant saveApplicant(Applicant app) {
		Resume resume = app.getResume();
		resume.setApplicant(app);

		List<Applications> applications = app.getApplications();
		for (Applications application : applications)
			application.setApplicant(app);
		
		return appRepo.save(app);
	}

	public Optional<Applicant> getappli(int id) {
		return appRepo.findById(id);
	}

	public ResponseEntity<Applicant> updateAppli(int id, Applicant updatedApp) {
//	 find applicant
		Optional<Applicant> optionalApplicant = appRepo.findById(id);

		if (optionalApplicant.isPresent())
		{
			Applicant existingApp = optionalApplicant.get();

//	 Update basic the columns
			existingApp.setAppliName(updatedApp.getAppliName());
			existingApp.setAppliEmail(updatedApp.getAppliEmail());

//		Update resume if is given
			Resume newResume = updatedApp.getResume();
			if (newResume != null) 
			{
				Resume oldResume = existingApp.getResume();
				if (oldResume != null) 
				{
					oldResume.setResumeContent(newResume.getResumeContent());
				} else 
				{
					newResume.setApplicant(existingApp);
					existingApp.setResume(newResume);
				}
			}

//			 Updating applications from applicant if is given
			List<Applications> newApps = updatedApp.getApplications();
			if (newApps != null)
			{
				for (Applications app : newApps) 
				{
					app.setApplicant(existingApp);
				}
				existingApp.setApplications(newApps);
			}
//			updating from applicant job if is given 
			List<Job> newJobs = updatedApp.getJob();
	        if (newJobs != null) {
	        	existingApp.getJob().clear(); 

	            for (Job job1 : updatedApp.getJob()) {
	                Job dbJob = jobrepo.findById(job1.getJobId())
	                    .orElseThrow(() -> new RuntimeException("Job not found with id: " + job1.getJobId()));
	                existingApp.getJob().add(dbJob);
	            }
	        }
			Applicant updated = appRepo.save(existingApp);
			return ResponseEntity.ok(updated);
		}
		else
		{
			return ResponseEntity.ok(null);
		}
	}

	public void deleteAppli(int id) {
	    if (!appRepo.existsById(id)) {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Applicant "+id+" not found");
	    }
	    appRepo.deleteById(id);
	}


	public List<Applicant> getAllAppli() {
		
		return appRepo.findAll();
	}
}


