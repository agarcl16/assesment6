package com.alexGarcia.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.alexGarcia.app.entity.User;

public interface UserService {

	public Iterable<User> findAll();
	
	public Page<User> findAll(Pageable pageable);
	
	public Optional<User> findeById(Long id);
	
	public User save(User user);
	
	public void deleteById(Long id);

	public boolean logIn(User user);
}
