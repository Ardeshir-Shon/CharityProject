package com.sbu.dao.impl;

import com.sbu.dao.SuggestionDAO;
import com.sbu.dao.model.HelperEntity;
import com.sbu.dao.model.NeedyStudentEntity;
import com.sbu.dao.model.SuggestionEntity;
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
public class SuggestionDAOImpl implements SuggestionDAO {
    @PersistenceContext
    public EntityManager entityManager;


    @Override
    @Transactional
    public void insertSuggestion(SuggestionEntity suggestionEntity) {
            entityManager.persist(suggestionEntity);

    }

    @Override
    @Transactional
    public ListIterator<SuggestionEntity> getByName(String name) {

        Query query =
                entityManager.createNativeQuery("SELECT suggestionEntity  FROM  SuggestionEntity suggestionEntity  WHERE suggestionEntity.name = ?1", SuggestionEntity.class);

        query.setParameter(1,name).getResultList();

        List<SuggestionEntity> result = query.getResultList();

        ListIterator<SuggestionEntity> suggestionEntity = result.listIterator();
        return suggestionEntity;
    }
}
