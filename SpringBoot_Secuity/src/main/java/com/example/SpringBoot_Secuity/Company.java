package com.example.SpringBoot_Secuity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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
	@Column(name="empName")
	private String empName;
	@Column(name="password")
	private int password;
	@Column(name="role")
	private String role;
	
	public Company() {
		
	}

	public Company(int companyId, String companyName, String companyCode, String companyLocation, long companyEmployees,
			String empName, int password, String role) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.companyCode = companyCode;
		this.companyLocation = companyLocation;
		this.companyEmployees = companyEmployees;
		this.empName = empName;
		this.password = password;
		this.role = role;
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

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", companyCode=" + companyCode
				+ ", companyLocation=" + companyLocation + ", companyEmployees=" + companyEmployees + ", empName="
				+ empName + ", password=" + password + ", role=" + role + "]";
	}

	
	
	
}
