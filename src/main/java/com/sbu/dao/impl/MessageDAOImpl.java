package com.sbu.dao.impl;

import com.sbu.dao.MessageDAO;
import com.sbu.dao.model.MessageEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

/**
 * Created by user on 6/22/2017.
 */
@Repository
public class MessageDAOImpl implements MessageDAO {

    @Autowired
    EntityManager entityManager;

    @Override
    public String getMessagebyId(Long id) {
        return null;
    }

    @Override
    public String getMessagebyAuthorName(String name) {
        return null;
    }

    @Override
    public Boolean insertMessage(MessageEntity message) {
        return null;
    }
}
