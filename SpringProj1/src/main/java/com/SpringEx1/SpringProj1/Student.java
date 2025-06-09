package com.SpringEx1.SpringProj1;

public class Student {

	int rollNo;
	String Name;
	int yop;
	
	
	public Student() {
		super();
	
	}


	public Student(int rollNo, String name, int yop) {
		super();
		this.rollNo = rollNo;
		Name = name;
		this.yop = yop;
	}


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getYop() {
		return yop;
	}


	public void setYop(int yop) {
		this.yop = yop;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", Name=" + Name + ", yop=" + yop + "]";
	}
	
	
	
}
