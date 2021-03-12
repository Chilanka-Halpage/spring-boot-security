package com.security.methods.model;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.security.methods.entity.User;
@Service
public class MyUserDetailService implements UserDetailsService{

	@Autowired
	MyRepo myRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user = myRepo.findByUserName(username);
		return user.map(MyUserPrincipal::new).get();
	}

}
