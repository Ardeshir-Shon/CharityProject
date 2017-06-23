package com.sbu.dao.impl;

import com.sbu.dao.HelperDAO;
import com.sbu.dao.model.HelperEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
    @Transactional
    public void insertPeriodicHelp(HelperEntity helperEntity) {

            entityManager.persist(helperEntity);


    }

    @Override
    @Transactional
    public HelperEntity getByEmail(String email) {

        String tempEmail;
         Query query =
                entityManager.createNativeQuery("SELECT helperEntity  FROM  HelperEntity helperEntity  WHERE helperEntity.email = ?1" , HelperEntity.class);

        query.setParameter(1,email).getResultList();

        List<HelperEntity> results = query.getResultList();

        HelperEntity helperEntity= results.get(0);
        return helperEntity;
    }

    @Override
    @Transactional
    public HelperEntity getByPhoneNumber(String id) {
        HelperEntity helperEntity=(HelperEntity) entityManager.find(HelperEntity.class,id);
        return helperEntity;
    }
}
