package com.techpoint.spring.basicdbauth.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.techpoint.spring.basicdbauth.model.User;



@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
	Optional<User> findByusername(String userName);
	
}
