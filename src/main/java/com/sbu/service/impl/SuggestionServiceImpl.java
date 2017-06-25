package com.sbu.service.impl;

import com.sbu.dao.SuggestionDAO;
import com.sbu.dao.model.MessageEntity;
import com.sbu.dao.model.SuggestionEntity;
import com.sbu.service.SuggestionService;
import com.sun.xml.internal.ws.developer.Serialization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Mammad on 6/22/2017.
 */
@Service
public class SuggestionServiceImpl implements SuggestionService {

    @Autowired
    SuggestionDAO suggestionDAO;

    @Override
    public Boolean validation(SuggestionEntity suggestionEntity){
        if(suggestionEntity.getPhoneNumber() != null && Validate.validateNumer(suggestionEntity.getPhoneNumber())){
            if(suggestionEntity.getEmail() != null && Validate.validateEmail(suggestionEntity.getEmail())){
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean insertSuggestion(SuggestionEntity suggestionEntity) {
        return suggestionDAO.insertSuggestion(suggestionEntity);
    }

    @Override
    public List<SuggestionEntity> getByName(SuggestionEntity suggestionEntity) {
        return (List<SuggestionEntity>) suggestionDAO.getByName(suggestionEntity.getName());
    }
}
