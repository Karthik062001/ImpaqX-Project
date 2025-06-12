package com.learn.jdbc.template.springjdbc.template;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import lombok.Data;
import lombok.NoArgsConstructor;

public class User {

	
	private long userId;
	
	private String userFirstName;
	
	private String userLastName;
	
	private long userMobNo;
	
	private String userAddress;

	public User() {
		
	}

	public User(int userId, String userFirstName, String userLastName, long userMobNo, String userAddress) {
		super();
		this.userId = userId;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userMobNo = userMobNo;
		this.userAddress = userAddress;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public long getUserMobNo() {
		return userMobNo;
	}

	public void setUserMobNo(long userMobNo) {
		this.userMobNo = userMobNo;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName
				+ ", userMobNo=" + userMobNo + ", userAddress=" + userAddress + "]";
	}
	
	
	
}
