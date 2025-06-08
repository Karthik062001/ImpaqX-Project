package com.example.OneToOne2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Applicant {

	@Id
	@GeneratedValue
	private int appliId;
	private String appliName;
	private String appliEmail;
	
	
	public Applicant() {
		super();
		
	}


	public Applicant(int appliId, String appliName, String appliEmail) {
		super();
		this.appliId = appliId;
		this.appliName = appliName;
		this.appliEmail = appliEmail;
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


	@Override
	public String toString() {
		return "Applicant [appliId=" + appliId + ", appliName=" + appliName + ", appliEmail=" + appliEmail + "]";
	}
	
	
}
