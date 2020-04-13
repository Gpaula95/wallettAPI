package com.wallett.service;

import java.util.Optional;

import com.wallett.entity.User;

public interface UserService {

	User save(User u);
	
	Optional<User> findByEmail(String email);
}
