package com.sbu.dao.impl;

import com.sbu.dao.NeedyStudentDAO;
import com.sbu.dao.model.HelperEntity;
import com.sbu.dao.model.MessageEntity;
import com.sbu.dao.model.NeedyStudentEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 * Created by Mammad on 6/22/2017.
 */
@Repository
public class NeedyStudentDAOImpl implements NeedyStudentDAO {

    @PersistenceContext
    public EntityManager entityManager;

    @Override
    public Boolean insertNeedyStudent(NeedyStudentEntity needyStudentEntity) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(needyStudentEntity);
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
    public NeedyStudentEntity getByStudentId(String studentId) {

        TypedQuery<NeedyStudentEntity> q =
                entityManager.createQuery("SELECT *  FROM  NeedyStudentEntity WHERE studentId = " + studentId, NeedyStudentEntity.class);

        NeedyStudentEntity needyStudentEntity= q.getResultList().get(0);
        return needyStudentEntity;
    }

    @Override
    @Transactional
    public NeedyStudentEntity getByPhoneNumber(String id) {
        NeedyStudentEntity needyStudentEntity=(NeedyStudentEntity) entityManager.find(NeedyStudentEntity.class,id);
        return needyStudentEntity;
    }
}
