package com.SpringEX4.SpringProj4;

public class KodnestClasses {

	Trainee1 tr ;

	public KodnestClasses() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KodnestClasses(Trainee1 tr) {
		super();
		this.tr = tr;
	}

	public Trainee1 getTr() {
		return tr;
	}

	public void setTr(Trainee1 tr) {
		this.tr = tr;
	}

	@Override
	public String toString() {
		return "KodnestClasses [tr=" + tr + "]";
	}
	
	
}
