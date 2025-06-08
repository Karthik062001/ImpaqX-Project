package com.example1.SpringDataJPA1.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	private int custoId;
	private String custoName;
	@OneToMany(mappedBy = "customer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Device> device;
	
	public Customer() {
		
	}

	public Customer(int custoId, String custoName, List<Device> device) {
		super();
		this.custoId = custoId;
		this.custoName = custoName;
		this.device = device;
	}

	public int getCustoId() {
		return custoId;
	}

	public void setCustoId(int custoId) {
		this.custoId = custoId;
	}

	public String getCustoName() {
		return custoName;
	}

	public void setCustoName(String custoName) {
		this.custoName = custoName;
	}

	public List<Device> getDevice() {
		return device;
	}

	public void setDevice(List<Device> device) {
		this.device = device;
	}

	

	
	
	
	
	}
