package com.appsdevelopingblog.app.ws.service.impl;

import java.util.ArrayList;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.appsdevelopingblog.app.ws.UserRepository;
import com.appsdevelopingblog.app.ws.service.UserService;
import com.appsdevelopingblog.app.ws.shared.Utils;
import com.appsdevelopingblog.app.ws.shared.dto.UserDto;
import com.appsdevelopingblog.app.ws.ui.entity.UserEntity;

@Service
public class UserServiceImpl implements UserService{

	@Autowired	
	UserRepository userRepository;
	
	@Autowired
	Utils utils;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public UserDto createUser(UserDto user) {
		
		if ( userRepository.findByEmail(user.getEmail()) != null) {
			throw new RuntimeException("Record Already Exists");
		}
		
		String userId = utils.generateUserId(30);
		UserEntity userEntity = new UserEntity();

		user.setUserId(userId);
		BeanUtils.copyProperties(user, userEntity);
		userEntity.setPassword("test");
		userEntity.setEncryptedPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		UserEntity storedUserDetails = userRepository.save(userEntity);
		UserDto returnValue = new UserDto();
		BeanUtils.copyProperties(storedUserDetails, returnValue);
		return returnValue;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity userEntity = userRepository.findByEmail(username);
		if (userEntity == null) 
			throw new UsernameNotFoundException(username);
		
		return new User(userEntity.getEmail(), userEntity.getEncryptedPassword(), new ArrayList<>());
	}

	@Override
	public UserDto getUserByUserId(String userId) {
		UserDto returnValue = new UserDto();
		UserEntity userEntity = userRepository.findByUserId(userId);
		
		if (userEntity == null) 
			throw new UsernameNotFoundException(userId);
		
		BeanUtils.copyProperties(userEntity, returnValue);
		
		return returnValue;
	}

	

}
