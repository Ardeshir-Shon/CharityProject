package com.sbu.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.sbu.dao.model.User;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDAOImpl /*implements UserDAO*/ {

    public UserDAOImpl() {
    }

    
    
    @PersistenceContext
    public EntityManager entityManager;

    //@Override
    @Transactional
    public void insertUser(User user) {
        //entityManager.getTransaction().begin();
        entityManager.persist(user);
        //entityManager.getTransaction().commit();
    }

    //@Override
    public List<User> findAllUsers() {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<User> cq = builder.createQuery(User.class);
        Root<User> root = cq.from(User.class);
        cq.select(root);
        return entityManager.createQuery(cq).getResultList();
    }

}
