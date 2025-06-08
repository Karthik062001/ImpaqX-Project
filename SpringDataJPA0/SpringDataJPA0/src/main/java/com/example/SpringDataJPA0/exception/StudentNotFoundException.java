package com.example.SpringDataJPA0.exception;

public class StudentNotFoundException extends RuntimeException {

	private int statusCode;

	public StudentNotFoundException(String message, int statusCode) {
		super(message);
		this.statusCode=statusCode;
		
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	
	

}
