package com.appsdevelopingblog.app.ws.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.appsdevelopingblog.app.ws.shared.dto.UserDto;

public interface UserService extends UserDetailsService {
	UserDto createUser(UserDto user);
}
