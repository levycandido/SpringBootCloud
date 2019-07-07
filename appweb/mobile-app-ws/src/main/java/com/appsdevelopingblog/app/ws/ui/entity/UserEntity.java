package com.appsdevelopingblog.app.ws.ui.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;

@Entity(name="users")
public class UserEntity implements Serializable {

	private static final long serialVersionUID = -244712593981348519L;
	
	@Id
	@GeneratedValue
	private long id;
	@Column(nullable=false, length=50)
	private String userId;
	@Column(nullable=false, length=50)
	private String fistName;
	@Column(nullable=false, length=50)
	private String lastName;
	@Column(nullable=false, length=50)
	private String Email;
	@Column(nullable=false, length=50)
	private String fistname;
	@Column(nullable=false, length=50)
	private String lastname;
	@Column(nullable=false, length=50)
	private String password;
	@Column(nullable=false, length=50)
	private String encryptedPassword;
	private String emailVerificationToken;
	@Column(nullable=false)
	private Boolean emailVerificationStatus = false;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFistName() {
		return fistName;
	}
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getFistname() {
		return fistname;
	}
	public void setFistname(String fistname) {
		this.fistname = fistname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEncryptedPassword() {
		return encryptedPassword;
	}
	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}
	public String getEmailVerificationToken() {
		return emailVerificationToken;
	}
	public void setEmailVerificationToken(String emailVerificationToken) {
		this.emailVerificationToken = emailVerificationToken;
	}
	public Boolean getEmailVerificationStatus() {
		return emailVerificationStatus;
	}
	public void setEmailVerificationStatus(Boolean emailVerificationStatus) {
		this.emailVerificationStatus = emailVerificationStatus;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
}
