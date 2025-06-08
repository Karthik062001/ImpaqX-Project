package com.example.OneToOne3.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Resume {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int resumeId;
	private String resumeContent;
	
	@OneToOne
	@JoinColumn(name="applicantId", nullable = false,unique = true)
	@JsonIgnore
	private Applicant applicant;

	
	public Resume() {
		super();
		
	}


	public Resume(int resumeId, String resumeContent, Applicant applicant) {
		super();
		this.resumeId = resumeId;
		this.resumeContent = resumeContent;
		this.applicant = applicant;
	}


	public int getResumeId() {
		return resumeId;
	}


	public void setResumeId(int resumeId) {
		this.resumeId = resumeId;
	}


	public String getResumeContent() {
		return resumeContent;
	}


	public void setResumeContent(String resumeContent) {
		this.resumeContent = resumeContent;
	}


	public Applicant getApplicant() {
		return applicant;
	}


	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}


	@Override
	public String toString() {
		return "Resume [resumeId=" + resumeId + ", resumeContent=" + resumeContent + ", applicant=" + applicant + "]";
	}	
}
