package com.example1.SpringDataJPA1.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Device")
public class Device {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dId;
	@Column(nullable=false)
	private String dName;
	private String dModel;
	private int dPrice;
	@ManyToOne
	@JoinColumn(name = "custoId")
	@JsonBackReference
	private Customer customer;
	
	public Device() {
	
	}

	public Device(int dId, String dName, String dModel, int dPrice, Customer customer) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dModel = dModel;
		this.dPrice = dPrice;
		this.customer = customer;
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getdModel() {
		return dModel;
	}

	public void setdModel(String dModel) {
		this.dModel = dModel;
	}

	public int getdPrice() {
		return dPrice;
	}

	public void setdPrice(int dPrice) {
		this.dPrice = dPrice;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	

	
	
}