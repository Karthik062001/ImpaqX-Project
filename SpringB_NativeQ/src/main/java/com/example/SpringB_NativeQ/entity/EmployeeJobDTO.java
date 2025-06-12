package com.example.SpringB_NativeQ.entity;

public class EmployeeJobDTO {

	private String empName;
	private double empSalary;
	private String empAddres;
	private String jobName;
	
	
	public EmployeeJobDTO() {
		
	}

	public EmployeeJobDTO(String empName,  double empSalary, String empAddres, String jobName) {
		super();
		this.empName = empName;
		this.empSalary = empSalary;
		this.empAddres = empAddres;
		this.jobName = jobName;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
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

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	@Override
	public String toString() {
		return "EmployeeJobDTO [empName=" + empName + ", empSalary=" + empSalary + ", empAddres=" + empAddres
				+ ", jobName=" + jobName + "]";
	}

	
	
}
