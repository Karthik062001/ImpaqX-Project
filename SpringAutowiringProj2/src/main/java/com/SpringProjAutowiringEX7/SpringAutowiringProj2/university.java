package com.SpringProjAutowiringEX7.SpringAutowiringProj2;

public class university {

	profesor pr;

	public university() {
		super();
		// TODO Auto-generated constructor stub
	}

	public university(profesor pr) {
		super();
		this.pr = pr;
	}

	public profesor getPr() {
		return pr;
	}

	public void setPr(profesor pr) {
		this.pr = pr;
	}

	@Override
	public String toString() {
		return "university [pr=" + pr + "]";
	}
	
	
}
