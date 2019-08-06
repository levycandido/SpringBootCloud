package com.appsdevelopingblog.app.ws;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.appsdevelopingblog.app.ws.shared.dto.UserDto;
import com.appsdevelopingblog.app.ws.ui.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
	UserEntity findByEmail(String email);
	UserEntity findByUserId(String userId);

}
