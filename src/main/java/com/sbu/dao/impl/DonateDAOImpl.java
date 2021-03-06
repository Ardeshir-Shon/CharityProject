package com.sbu.dao.impl;

import com.sbu.dao.DonateDAO;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Mammad on 6/22/2017.
 */

@Repository
public class DonateDAOImpl implements DonateDAO{

    @PersistenceContext
    public EntityManager entityManager;

    @Override
    @Transactional
    public void insertDonate(String costOfPay) {
            entityManager.persist(costOfPay);


    }
}
