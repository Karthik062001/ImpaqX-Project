package com.SpringProjAutowiringEX7.SpringAutowiringProj2;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
@Autowired
	driver dr;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(driver dr) {
		super();
		this.dr = dr;
	}

	public driver getDr() {
		return dr;
	}

	public void setDr(driver dr) {
		this.dr = dr;
	}

	@Override
	public String toString() {
		return "Car [dr=" + dr + "]";
	}
	
	
}
