package com.techpoint.spring.basicdbauth.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.techpoint.spring.basicdbauth.model.CustomUserDetails;
import com.techpoint.spring.basicdbauth.model.User;
import com.techpoint.spring.basicdbauth.repo.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	UserRepository UserRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		// return new CustomUserDetails(username);

		Optional<User> user = UserRepository.findByusername(username);

		user.orElseThrow(() -> new UsernameNotFoundException("Not Founud :: " + username));
		return user.map(CustomUserDetails::new).get();
	}

}
