package com.wallett.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wallett.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	Optional<User> findByEmailEquals(String email);
}
