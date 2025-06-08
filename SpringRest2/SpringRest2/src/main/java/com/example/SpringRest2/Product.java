package com.example.SpringRest2;

public class Product {

	private int ProId;
	private String ProName;
	private int ProPrice;
	
	public Product() {
		
	}

	public Product(int proId, String proName, int proPrice) {
		super();
		ProId = proId;
		ProName = proName;
		ProPrice = proPrice;
	}

	public int getProId() {
		return ProId;
	}

	public void setProId(int proId) {
		ProId = proId;
	}

	public String getProName() {
		return ProName;
	}

	public void setProName(String proName) {
		ProName = proName;
	}

	public int getProPrice() {
		return ProPrice;
	}

	public void setProPrice(int proPrice) {
		ProPrice = proPrice;
	}

	@Override
	public String toString() {
		return "Product [ProId=" + ProId + ", ProName=" + ProName + ", ProPrice=" + ProPrice + "]";
	}
	
	
}
