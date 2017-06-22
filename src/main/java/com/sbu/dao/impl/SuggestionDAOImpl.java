package com.sbu.dao.impl;

import com.sbu.dao.SuggestionDAO;
import com.sbu.dao.model.HelperEntity;
import com.sbu.dao.model.SuggestionEntity;
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
public class SuggestionDAOImpl implements SuggestionDAO {
    @PersistenceContext
    public EntityManager entityManager;


    @Override
    public Boolean insertSuggestion(SuggestionEntity suggestionEntity) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(suggestionEntity);
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
    public List<SuggestionEntity> getByName(String name) {

        TypedQuery<SuggestionEntity> q =
                entityManager.createQuery("SELECT *  FROM  SuggestionEntity  WHERE name = " + name, SuggestionEntity.class);

        List<SuggestionEntity> suggestionEntity = q.getResultList();
        return suggestionEntity;
    }
}
