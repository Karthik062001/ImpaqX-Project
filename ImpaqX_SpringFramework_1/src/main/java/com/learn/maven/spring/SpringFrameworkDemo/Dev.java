package com.learn.maven.spring.SpringFrameworkDemo;

public class Dev {

//	private int age;
//	private String name;

//	public Dev(int age, String name) {
//		super();
//		this.age = age;
//		this.name = name;
//	}



//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

	Computer comp;
	
	public Dev() {
		System.out.println("Dev constructor");
	}

	public void build() {

		comp.compile();
		System.out.println("We buld the project");
	}

	public Computer getComp() {
		return comp;
	}

	public void setComp(Computer comp) {
		this.comp = comp;
	}



}

//
//<!--  <property name="age" value="18"></property>
//<constructor-arg index="0" value="18" ></constructor-arg>
//<constructor-arg index="1" value="Karthik"></constructor-arg>-->

//<!--  <property name="laptop" ref="lap"></property> -->