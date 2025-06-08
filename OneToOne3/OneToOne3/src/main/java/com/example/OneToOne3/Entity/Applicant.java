package com.example.OneToOne3.Entity;

import java.util.ArrayList;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Applicant {

	@Id
	@GeneratedValue
	private int appliId;
	private String appliName;
	private String appliEmail;

	@OneToOne(mappedBy = "applicant", cascade = CascadeType.ALL)
	private Resume resume;

	@OneToMany(mappedBy = "applicant", cascade = CascadeType.ALL)
	private List<Applications> applications = new ArrayList<>();
	
	
	@ManyToMany(cascade = { CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(
	        name="Applicant_Job",
	        joinColumns=
	            @JoinColumn(name="Applicant_id", referencedColumnName="appliId"),
	        inverseJoinColumns=
	            @JoinColumn(name="Job_id", referencedColumnName="jobId")
	    )	private List<Job>job=new ArrayList<Job>();

	public Applicant() {
		super();

	}

	public Applicant(int appliId, String appliName, String appliEmail, Resume resume, List<Applications> applications,
			List<Job> job) {
		super();
		this.appliId = appliId;
		this.appliName = appliName;
		this.appliEmail = appliEmail;
		this.resume = resume;
		this.applications = applications;
		this.job = job;
	}

	public int getAppliId() {
		return appliId;
	}

	public void setAppliId(int appliId) {
		this.appliId = appliId;
	}

	public String getAppliName() {
		return appliName;
	}

	public void setAppliName(String appliName) {
		this.appliName = appliName;
	}

	public String getAppliEmail() {
		return appliEmail;
	}

	public void setAppliEmail(String appliEmail) {
		this.appliEmail = appliEmail;
	}

	public Resume getResume() {
		return resume;
	}

	public void setResume(Resume resume) {
		this.resume = resume;
	}

	public List<Applications> getApplications() {
		return applications;
	}

	public void setApplications(List<Applications> applications) {
		this.applications = applications;
	}

	public List<Job> getJob() {
		return job;
	}

	public void setJob(List<Job> job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Applicant [appliId=" + appliId + ", appliName=" + appliName + ", appliEmail=" + appliEmail + ", resume="
				+ resume + ", applications=" + applications + ", job=" + job + "]";
	}
	
	


	
	
}
