package com.sbu.dao;

import com.sbu.dao.model.SuggestionEntity;

import java.util.List;

/**
 * Created by Mammad on 6/22/2017.
 */
public interface SuggestionDAO {

    public Boolean setSuggestion(SuggestionEntity suggestionEntity);

    public List<SuggestionEntity>  getByName(String name);
    //public List<SuggestionEntity>  getBySubject(String subject);
}
