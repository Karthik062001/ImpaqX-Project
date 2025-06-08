package com.example.SpringDataQueryDSLPredicate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

public class User {

	@Id
	@GeneratedValue
	private int userID;
	private String userName;
	private long userNumber;
	private String userEmail;
	
	public User() {
		super();
		
	}

	public User(int userID, String userName, long userNumber, String userEmail) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.userNumber = userNumber;
		this.userEmail = userEmail;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(long userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", userName=" + userName + ", userNumber=" + userNumber + ", userEmail="
				+ userEmail + "]";
	}
	
	
	

	
	
}
