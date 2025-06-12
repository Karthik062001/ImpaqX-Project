package com.example.SpringB_NativeQ.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private int empId;
	@Column(name="empName")
	private String empName;
	@Column(name="empCode")
	private int empCode;
	@Column(name="empSalary")
	private double empSalary;
	@Column(name="empAddres")
	private String empAddres;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Employee_Job")
	private Job job;
	
	public Employee() {
		
	}

	public Employee(int empId, String empName, int empCode, double empSalary, String empAddres, Job job) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCode = empCode;
		this.empSalary = empSalary;
		this.empAddres = empAddres;
		this.job = job;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpCode() {
		return empCode;
	}

	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpAddres() {
		return empAddres;
	}

	public void setEmpAddres(String empAddres) {
		this.empAddres = empAddres;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empCode=" + empCode + ", empSalary=" + empSalary
				+ ", empAddres=" + empAddres + ", job=" + job + "]";
	}

	
	
}
