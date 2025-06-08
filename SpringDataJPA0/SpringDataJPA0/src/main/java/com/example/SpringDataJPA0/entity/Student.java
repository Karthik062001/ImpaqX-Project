package com.example.SpringDataJPA0.entity;

import org.springframework.boot.context.properties.bind.DefaultValue;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Builder.Default;

@Entity
@Table(name = "student",
       uniqueConstraints = @UniqueConstraint(columnNames = { "email_id" })
)
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId;
	@Column(name="first_name", nullable = false)
	private String firstName;
	private String lastName;
	@Column(name="email_id",nullable = false)
	private String emailId;
	private String gardianName;
	private long gardianMob;
	
	public Student() {
		
	}

	public Student(int studentId, String firstName, String lastName, String emailId, String gardianName,
			long gardianMob) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.gardianName = gardianName;
		this.gardianMob = gardianMob;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getGardianName() {
		return gardianName;
	}

	public void setGardianName(String gardianName) {
		this.gardianName = gardianName;
	}

	public long getGardianMob() {
		return gardianMob;
	}

	public void setGardianMob(long gardianMob) {
		this.gardianMob = gardianMob;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId="
				+ emailId + ", gardianName=" + gardianName + ", gardianMob=" + gardianMob + "]";
	}
	
	
}
