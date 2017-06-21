package com.sbu.service;

import java.util.List;

import com.sbu.dao.model.User;

public interface UserManager {

	void insertUser(User user);

	List<User> findAllUsers();
}
