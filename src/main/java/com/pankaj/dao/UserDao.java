package com.pankaj.dao;

import com.pankaj.model.User;

public interface UserDao {

	User findByUserName(String userName); 
}
