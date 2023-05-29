package com.app.cadastrospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.cadastrospring.model._User;

public interface RegistrationRepository extends JpaRepository<_User, Integer> {
	
	public _User findByEmailId(String emailId);
	public _User findByEmailIdAndPassword(String emailId, String password);
	

}
