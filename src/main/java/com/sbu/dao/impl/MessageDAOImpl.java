package com.sbu.dao.impl;

import com.sbu.dao.MessageDAO;
import com.sbu.dao.model.MessageEntity;
import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by user on 6/22/2017.
 */
@Repository
public class MessageDAOImpl implements MessageDAO {

    @PersistenceContext
    public EntityManager entityManager;

    @Override
    @Transactional
    public MessageEntity getMessagebyId(Long id) {
        MessageEntity messageEntity=(MessageEntity) entityManager.find(MessageEntity.class,id);
        return messageEntity;
    }

    @Override
    public Boolean insertMessage(MessageEntity message) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(message);
            entityManager.getTransaction().commit();
            return true;
        }
        catch (Exception e){
            entityManager.getTransaction().rollback();
            return false;
        }
    }
}
