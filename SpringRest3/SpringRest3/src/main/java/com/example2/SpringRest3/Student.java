package com.example2.SpringRest3;

public class Student {

	int StId;
	String StName;
	String StAddress;
	int StPhone;
	public Student() {
		
	}
	public Student(int stId, String stName, String stAddress, int stPhone) {
		super();
		StId = stId;
		StName = stName;
		StAddress = stAddress;
		StPhone = stPhone;
	}
	public int getStId() {
		return StId;
	}
	public void setStId(int stId) {
		StId = stId;
	}
	public String getStName() {
		return StName;
	}
	public void setStName(String stName) {
		StName = stName;
	}
	public String getStAddress() {
		return StAddress;
	}
	public void setStAddress(String stAddress) {
		StAddress = stAddress;
	}
	public int getStPhone() {
		return StPhone;
	}
	public void setStPhone(int stPhone) {
		StPhone = stPhone;
	}
	@Override
	public String toString() {
		return "Student [StId=" + StId + ", StName=" + StName + ", StAddress=" + StAddress + ", StPhone=" + StPhone
				+ "]";
	}
	
	
	
}
