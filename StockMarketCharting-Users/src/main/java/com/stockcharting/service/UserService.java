package com.stockcharting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.stockcharting.entities.User;
import com.stockcharting.repos.UserRepos;



public interface UserService  {

	User save(User user);

	Iterable<User> findAll();

	void deleteById(Integer id);
	
	

}
