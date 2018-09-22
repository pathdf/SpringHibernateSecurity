package com.pankaj.dao;

import com.pankaj.modal.User;

public interface UserDao {

	User findByUserName(String userName); 
}
