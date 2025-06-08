package com.example.OneToOne3.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Applications {

	@Id
	@GeneratedValue
	private int applicationId;
	private String applicationStatus;
	private String applicationPosition;
	
	@ManyToOne
	@JoinColumn(name="applicantId", nullable = false)
	@JsonIgnore
	private Applicant applicant;

	public Applications() {
		super();
		
	}

	public Applications(int applicationId, String applicationStatus, String applicationPosition, Applicant applicant) {
		super();
		this.applicationId = applicationId;
		this.applicationStatus = applicationStatus;
		this.applicationPosition = applicationPosition;
		this.applicant = applicant;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public String getApplicationPosition() {
		return applicationPosition;
	}

	public void setApplicationPosition(String applicationPosition) {
		this.applicationPosition = applicationPosition;
	}

	public Applicant getApplicant() {
		return applicant;
	}

	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}

	@Override
	public String toString() {
		return "Applications [applicationId=" + applicationId + ", applicationStatus=" + applicationStatus
				+ ", applicationPosition=" + applicationPosition + ", applicant=" + applicant + "]";
	}


	
}
