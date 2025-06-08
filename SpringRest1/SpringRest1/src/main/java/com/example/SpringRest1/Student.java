package com.example.SpringRest1;

public class Student {

	int Studentid;
	String StudentName;
	String StdAddress;
	
	
	public Student() {
		
	}
	public Student(int studentid, String studentName, String stdAddress) {
		super();
		Studentid = studentid;
		StudentName = studentName;
		StdAddress = stdAddress;
	}
	public int getStudentid() {
		return Studentid;
	}
	public void setStudentid(int studentid) {
		Studentid = studentid;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStdAddress() {
		return StdAddress;
	}
	public void setStdAddress(String stdAddress) {
		StdAddress = stdAddress;
	}
	@Override
	public String toString() {
		return "Student [Studentid=" + Studentid + ", StudentName=" + StudentName + ", StdAddress=" + StdAddress + "]";
	}
	
}