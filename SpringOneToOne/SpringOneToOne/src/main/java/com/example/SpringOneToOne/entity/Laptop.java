package com.example.SpringOneToOne.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Laptop {

	@Id
	@GeneratedValue
	private int lapId;
	private String lapName;
	private String lapModel;
	private long lapPrice;
	
	@OneToOne
	@JoinColumn(name="dev_lap",referencedColumnName = "devId")
	private Developer developer;

	public Laptop() {
		super();
		
	}

	public Laptop(int lapId, String lapName, String lapModel, long lapPrice, Developer developer) {
		super();
		this.lapId = lapId;
		this.lapName = lapName;
		this.lapModel = lapModel;
		this.lapPrice = lapPrice;
		this.developer = developer;
	}

	public int getLapId() {
		return lapId;
	}

	public void setLapId(int lapId) {
		this.lapId = lapId;
	}

	public String getLapName() {
		return lapName;
	}

	public void setLapName(String lapName) {
		this.lapName = lapName;
	}

	public String getLapModel() {
		return lapModel;
	}

	public void setLapModel(String lapModel) {
		this.lapModel = lapModel;
	}

	public long getLapPrice() {
		return lapPrice;
	}

	public void setLapPrice(long lapPrice) {
		this.lapPrice = lapPrice;
	}

	public Developer getDeveloper() {
		return developer;
	}

	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}

	@Override
	public String toString() {
		return "Laptop [lapId=" + lapId + ", lapName=" + lapName + ", lapModel=" + lapModel + ", lapPrice=" + lapPrice
				+ ", developer=" + developer + "]";
	}
	
	
}
