package com.sbu.dao.impl;

import com.sbu.dao.HelperDAO;
import com.sbu.dao.model.HelperEntity;
import com.sbu.dao.model.HelpPeriodEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by Mammad on 6/22/2017.
 */
@Repository
public class HelperDAOImpl implements HelperDAO {

    @PersistenceContext
    public EntityManager entityManager;

    @Override
    public Boolean insertPeriodicHelp(HelperEntity helperEntity) {

        try {
            entityManager.getTransaction().begin();
            entityManager.persist(helperEntity);
            entityManager.getTransaction().commit();
            return true;
        }
        catch(Exception e){
            entityManager.getTransaction().rollback();
            return false;
        }

    }

    @Override
    @Transactional
    public HelperEntity getByEmail(String email) {
        TypedQuery<HelperEntity> q =
                entityManager.createQuery("SELECT *  FROM  HelperEntity  WHERE email = " + email, HelperEntity.class);

        HelperEntity helperEntity= q.getResultList().get(0);
        return helperEntity;
    }

    @Override
    @Transactional
    public HelperEntity getByPhoneNumber(String id) {
        HelperEntity helperEntity=(HelperEntity) entityManager.find(HelperEntity.class,id);
        return helperEntity;
    }
}
