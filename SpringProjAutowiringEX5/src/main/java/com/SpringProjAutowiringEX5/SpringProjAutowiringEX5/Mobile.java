package com.SpringProjAutowiringEX5.SpringProjAutowiringEX5;

public class Mobile {
	
     String brand;
     int ram;
     double cost;
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(String brand, int ram, double cost) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.cost = cost;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", ram=" + ram + ", cost=" + cost + "]";
	}
     
     
}
