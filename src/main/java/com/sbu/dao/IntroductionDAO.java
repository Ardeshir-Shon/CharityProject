package com.sbu.dao;

import com.sbu.dao.model.IntroductionEntity;

import java.util.List;
import java.util.ListIterator;

/**
 * Created by Mammad on 6/22/2017.
 */
public interface IntroductionDAO {

    public Boolean insertIntroduction(IntroductionEntity introductionEntity);

    //public List<IntroductionEntity> getByRecommenderName(String name,String family);
    public ListIterator<IntroductionEntity> getByRecommenderPhoneNumber(String phoneNumber);
    public IntroductionEntity getByNeedyName(String name,String family);

}
