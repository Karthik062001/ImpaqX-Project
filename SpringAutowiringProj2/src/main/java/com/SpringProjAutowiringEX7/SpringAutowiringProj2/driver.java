package com.SpringProjAutowiringEX7.SpringAutowiringProj2;

public class driver {

	int id;
	String name;
	int age;
	public driver() {
		super();
		// TODO Auto-generated constructor stub
	}
	public driver(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "driver [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
