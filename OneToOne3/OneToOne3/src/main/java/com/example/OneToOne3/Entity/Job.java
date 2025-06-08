package com.example.OneToOne3.Entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

@Entity
public class Job {

	@Id
	@GeneratedValue
	private int jobId;
	@Column(name="job_position")
	private String jobPosition;
	@Column(name="job_code")
	private String jobCode;
	private int noOfVaccancies;

	@ManyToMany(mappedBy = "job",fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Applicant> applicant=new ArrayList<Applicant>();

	public Job() {
		super();

	}

	public Job(int jobId, String jobPosition, String jobCode, int noOfVaccancies, List<Applicant> applicant) {
		super();
		this.jobId = jobId;
		this.jobPosition = jobPosition;
		this.jobCode = jobCode;
		this.noOfVaccancies = noOfVaccancies;
		this.applicant = applicant;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}

	public String getJobCode() {
		return jobCode;
	}

	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}

	public int getNoOfVaccancies() {
		return noOfVaccancies;
	}

	public void setNoOfVaccancies(int noOfVaccancies) {
		this.noOfVaccancies = noOfVaccancies;
	}

	public List<Applicant> getApplicant() {
		return applicant;
	}

	public void setApplicant(List<Applicant> applicant) {
		this.applicant = applicant;
	}

	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", jobPosition=" + jobPosition + ", jobCode=" + jobCode + ", noOfVaccancies="
				+ noOfVaccancies + ", applicant=" + applicant + "]";
	}

	
}
