package com.sbu.dao;

import com.sbu.dao.model.SuggestionEntity;

import java.util.List;
import java.util.ListIterator;

/**
 * Created by Mammad on 6/22/2017.
 */
public interface SuggestionDAO {

    public Boolean insertSuggestion(SuggestionEntity suggestionEntity);

    public ListIterator<SuggestionEntity> getByName(String name);
    //public List<SuggestionEntity>  getBySubject(String subject);
}
