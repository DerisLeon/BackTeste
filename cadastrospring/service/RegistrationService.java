package com.app.cadastrospring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.cadastrospring.model._User;
import com.app.cadastrospring.repository.RegistrationRepository;

@Service
public class RegistrationService {
	@Autowired
	private RegistrationRepository  repo;
	
	public _User saveUser(_User user) {
		return repo.save(user);
}
	public _User fetchUserbyEmailId(String email) {
		return repo.findByEmailId(email);
	}
	
	public _User fetchUserbyEmailIdAndPass(String email, String password) {
		return repo.findByEmailIdAndPassword(email, password);
	}
	
	}
