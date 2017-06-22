package com.sbu.dao.impl;

import com.sbu.dao.IntroductionDAO;
import com.sbu.dao.model.IntroductionEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Mammad on 6/22/2017.
 */
@Repository
public class IntoductionDAOImpl implements IntroductionDAO {

    @PersistenceContext
    public EntityManager entityManager;

    @Override
    public Boolean insertIntroduction(IntroductionEntity introductionEntity) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(introductionEntity);
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
    public List<IntroductionEntity> getByRecommenderPhoneNumber(String phoneNumber) {
        return null;
    }

    @Override
    @Transactional
    public IntroductionEntity getByNeedyName(String name, String family) {
        return null;
    }
}
