package com.SpringEx2.Sprngproj2;

public class Student {

	int rollNo ;
	String name;
	int yop;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String name, int yop) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.yop = yop;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYop() {
		return yop;
	}

	public void setYop(int yop) {
		this.yop = yop;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", yop=" + yop + "]";
	}
	
	
}
