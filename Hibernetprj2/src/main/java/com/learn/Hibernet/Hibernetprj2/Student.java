package com.learn.Hibernet.Hibernetprj2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Student 
{
    
	@Id
	int rollNo;
	String Name;
	int age;
	
	public Student() {
		
	}

	public Student(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		Name = name;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
}
