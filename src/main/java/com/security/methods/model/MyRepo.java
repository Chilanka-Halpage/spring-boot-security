package com.security.methods.model;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.methods.entity.User;

public interface MyRepo extends JpaRepository<User, Integer> {
	Optional<User> findByUserName(String username);
}
