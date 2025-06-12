package com.example.SpringB_NativeQ.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Job {

	@Id
	@GeneratedValue
	private int jobId;
	@Column(name="jobName")
	private String jobName;
	@Column(name="jobCode")
	private int jobCode;
	
	
	public Job() {
		
	}

	public Job(int jobId, String jobName, int jobCode) {
		super();
		this.jobId = jobId;
		this.jobName = jobName;
		this.jobCode = jobCode;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public int getJobCode() {
		return jobCode;
	}

	public void setJobCode(int jobCode) {
		this.jobCode = jobCode;
	}

	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", jobName=" + jobName + ", jobCode=" + jobCode + "]";
	}

	
}
