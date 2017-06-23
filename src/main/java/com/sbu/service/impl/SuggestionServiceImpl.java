package com.sbu.service.impl;

import com.sbu.dao.SuggestionDAO;
import com.sbu.dao.model.SuggestionEntity;
import com.sbu.service.SuggestionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Mammad on 6/22/2017.
 */
public class SuggestionServiceImpl implements SuggestionService {

    @Autowired
    SuggestionDAO suggestionDAO;

    @Override
    public void insertSuggestion(SuggestionEntity suggestionEntity) {
        suggestionDAO.insertSuggestion(suggestionEntity);
    }

    @Override
    public List<SuggestionEntity> getByName(SuggestionEntity suggestionEntity) {
        return (List<SuggestionEntity>) suggestionDAO.getByName(suggestionEntity.getName());
    }
}
