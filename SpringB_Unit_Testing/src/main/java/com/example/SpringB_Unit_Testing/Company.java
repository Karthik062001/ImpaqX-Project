package com.example.SpringB_Unit_Testing;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int companyId;
	@Column(name="companyName")
	private String companyName;
	@Column(name="companyCode")
	private String companyCode;
	@Column(name="companyLocation")
	private String companyLocation;
	@Column(name="companyEmployees")
	private long companyEmployees;
	
	public Company() {
		
	}

	public Company(int companyId, String companyName, String companyCode, String companyLocation,
			long companyEmployees) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.companyCode = companyCode;
		this.companyLocation = companyLocation;
		this.companyEmployees = companyEmployees;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyLocation() {
		return companyLocation;
	}

	public void setCompanyLocation(String companyLocation) {
		this.companyLocation = companyLocation;
	}

	public long getCompanyEmployees() {
		return companyEmployees;
	}

	public void setCompanyEmployees(long companyEmployees) {
		this.companyEmployees = companyEmployees;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", companyCode=" + companyCode
				+ ", companyLocation=" + companyLocation + ", companyEmployees=" + companyEmployees + "]";
	}
	
	
	
}
