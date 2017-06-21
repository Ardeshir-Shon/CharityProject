package com.sbu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sbu.dao.impl.UserDAOImpl;
import com.sbu.dao.model.User;

@Service
public class UserManagerImpl /*implements UserManager*/ {

    public UserManagerImpl() {
    }

    @Autowired
    public UserDAOImpl userDAOImpl;

    //@Override
    @Transactional
    public void insertUser(User user) {
        userDAOImpl.insertUser(user);
    }

    //@Override
    public List<User> findAllUsers() {
        return userDAOImpl.findAllUsers();
    }

}
