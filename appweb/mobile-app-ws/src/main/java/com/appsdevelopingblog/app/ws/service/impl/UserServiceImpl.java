package com.appsdevelopingblog.app.ws.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.appsdevelopingblog.app.ws.UserRepository;
import com.appsdevelopingblog.app.ws.service.UserService;
import com.appsdevelopingblog.app.ws.shared.dto.UserDto;
import com.appsdevelopingblog.app.ws.ui.entity.UserEntity;

public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDto createUser(UserDto user) {
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(user, userEntity);
		userEntity.setPassword("test");
		userEntity.setUserId("testUserId");;
		UserEntity storedUserDetails = userRepository.save(userEntity);
		UserDto returnValue = new UserDto();
		BeanUtils.copyProperties(storedUserDetails, returnValue);
		return returnValue;
	}

	

}
