package com.sbu.dao.impl;

import com.sbu.dao.DiscardDAO;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Mammad on 6/22/2017.
 */
@Repository
public class DiscardDAOImpl implements DiscardDAO {

    @PersistenceContext
    public EntityManager entityManager;

    @Override
    @Transactional
    public Boolean dicardHelper(String id) {
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(id);
            entityManager.getTransaction().commit();
            return true;
        }
        catch(Exception e){
            entityManager.getTransaction().rollback();
            return false;
        }

    }
}
