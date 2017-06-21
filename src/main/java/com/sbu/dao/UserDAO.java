package com.sbu.dao;

import java.util.List;

import com.sbu.dao.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO {

	void insertUser(User user);

	List<User> findAllUsers();
}
