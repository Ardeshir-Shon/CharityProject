package com.sbu.service;

import com.sbu.dao.model.SuggestionEntity;

import java.util.List;

/**
 * Created by Mammad on 6/22/2017.
 */
public interface SuggestionService {

    public Boolean insertSuggestion(SuggestionEntity suggestionEntity);

    public List<SuggestionEntity> getByName(SuggestionEntity suggestionEntity);

}
