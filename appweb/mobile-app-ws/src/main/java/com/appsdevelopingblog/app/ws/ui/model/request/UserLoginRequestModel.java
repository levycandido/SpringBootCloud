package com.appsdevelopingblog.app.ws.ui.model.request;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.appsdevelopingblog.app.ws.shared.dto.UserDto;

public class UserLoginRequestModel  {
	private String email;
	private String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
