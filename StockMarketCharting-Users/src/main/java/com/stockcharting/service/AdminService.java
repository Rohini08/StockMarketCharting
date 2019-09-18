package com.stockcharting.service;

import com.stockcharting.entities.User;

public interface AdminService  {
	
	public User findUser(String user_name, String password);

}
