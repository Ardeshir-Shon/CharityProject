package com.sbu.dao;

import com.sbu.dao.model.IntroductionEntity;

import java.util.List;

/**
 * Created by Mammad on 6/22/2017.
 */
public interface IntroductionDAO {

    public Boolean insertIntroduction(IntroductionEntity introductionEntity);

    //public List<IntroductionEntity> getByRecommenderName(String name,String family);
    public List<IntroductionEntity> getByRecommenderPhoneNumber(String phoneNumber);
    public IntroductionEntity getByNeedyName(String name,String family);

}
