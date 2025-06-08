package com.example.SpringOneToOne.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Developer {

	@Id
	@GeneratedValue
	private int devId;
	private String devName;
	private String devEmail;
	
//	@OneToOne(mappedBy = "developer",cascade = CascadeType.ALL)
//	private Laptop laptop;

	public Developer() {
		super();
		
	}

	public Developer(int devId, String devName, String devEmail, Laptop laptop) {
		super();
		this.devId = devId;
		this.devName = devName;
		this.devEmail = devEmail;
//		this.laptop = laptop;
	}

	public int getDevId() {
		return devId;
	}

	public void setDevId(int devId) {
		this.devId = devId;
	}

	public String getDevName() {
		return devName;
	}

	public void setDevName(String devName) {
		this.devName = devName;
	}

	public String getDevEmail() {
		return devEmail;
	}

	public void setDevEmail(String devEmail) {
		this.devEmail = devEmail;
	}

//	public Laptop getLaptop() {
//		return laptop;
//	}
//
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}

	@Override
	public String toString() {
		return "Developer [devId=" + devId + ", devName=" + devName + ", devEmail=" + devEmail 
				+ "]";
	}
	
	
}
