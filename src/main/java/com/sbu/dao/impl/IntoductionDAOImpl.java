package com.sbu.dao.impl;

import com.sbu.dao.IntroductionDAO;
import com.sbu.dao.model.HelperEntity;
import com.sbu.dao.model.IntroductionEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Mammad on 6/22/2017.
 */
@Repository
public class IntoductionDAOImpl implements IntroductionDAO {

    @PersistenceContext
    public EntityManager entityManager;

    @Override
    @Transactional
    public Boolean insertIntroduction(IntroductionEntity introductionEntity) {

        try {
            entityManager.persist(introductionEntity);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    @Override
    @Transactional
    public ListIterator<IntroductionEntity> getByRecommenderPhoneNumber(String phoneNumber) {

         Query query =
                entityManager.createNativeQuery("SELECT introductionEntity  FROM  IntroductionEntity introductionEntity  WHERE introductionEntity.recommenderPhoneNumber = ?1", IntroductionEntity.class);

        query.setParameter(1,phoneNumber).getResultList();

        List<IntroductionEntity> results = query.getResultList();

        ListIterator<IntroductionEntity> introductionEntity = results.listIterator();
        return introductionEntity;
    }

    @Override
    @Transactional
    public IntroductionEntity getByNeedyName(String name, String family) {

        Query query =
                entityManager.createNativeQuery("SELECT introductionEntity  FROM  IntroductionEntity introductionEntity WHERE introductionEntity.needyName = ?1 and introductionEntity.needyFamily = ?2", IntroductionEntity.class);

        query.setParameter(1,name).getResultList();
        query.setParameter(2,family).getResultList();


        List<IntroductionEntity> results = query.getResultList();

                IntroductionEntity introductionEntity = results.get(0);
        return introductionEntity;
    }
}
