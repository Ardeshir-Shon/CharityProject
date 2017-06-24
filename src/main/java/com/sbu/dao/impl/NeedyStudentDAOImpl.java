package com.sbu.dao.impl;

import com.sbu.dao.NeedyStudentDAO;
import com.sbu.dao.model.HelperEntity;
import com.sbu.dao.model.MessageEntity;
import com.sbu.dao.model.NeedyStudentEntity;
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
public class NeedyStudentDAOImpl implements NeedyStudentDAO {

    @PersistenceContext
    public EntityManager entityManager;

    @Override
    @Transactional
    public Boolean insertNeedyStudent(NeedyStudentEntity needyStudentEntity) {
        try {
            entityManager.persist(needyStudentEntity);
            return true;
        }
        catch (Exception e){
            return false;
        }

    }

    @Override
    @Transactional
    public NeedyStudentEntity getByStudentId(String studentId) {

        Query query =
                entityManager.createNativeQuery("SELECT needyStudentEntity  FROM  NeedyStudentEntity needyStudentEntity WHERE needyStudentEntity.studentId = ?1", NeedyStudentEntity.class);

        query.setParameter(1,studentId).getResultList();

        List<NeedyStudentEntity> result = query.getResultList();

        NeedyStudentEntity needyStudentEntity= result.get(0);
        return needyStudentEntity;
    }

    @Override
    @Transactional
    public NeedyStudentEntity getByPhoneNumber(String id) {
        NeedyStudentEntity needyStudentEntity=(NeedyStudentEntity) entityManager.find(NeedyStudentEntity.class,id);
        return needyStudentEntity;
    }
}
