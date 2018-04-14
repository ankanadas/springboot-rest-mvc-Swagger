package com.springcore.spring_rest.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.Repository;

import com.springcore.spring_rest.entity.Users;

public interface UserRepo extends Repository<Users, String>{
	public List<Users> findAll();
	
	public Optional<Users> findById(String id);
	
	public Users save(Users user);
	
	public void delete(Users user);
	
	public Optional<Users> findByEmail(String email);
}
