package com.sbu.dao.impl;

import com.sbu.dao.DiscardDAO;
import com.sbu.dao.model.HelperEntity;
import org.hibernate.boot.model.source.internal.hbm.Helper;
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
    public Boolean dicardHelperEntity(String id)  {
        try {
            HelperEntity helperEntity=(HelperEntity) entityManager.find(HelperEntity.class,id);
            entityManager.remove(helperEntity);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
    @Override
    @Transactional
    public HelperEntity getHelper(String id){
        HelperEntity helperEntity=(HelperEntity) entityManager.find(HelperEntity.class,id);
        return helperEntity;
    }
}
