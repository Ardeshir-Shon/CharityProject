package com.sbu.service;

import com.sbu.dao.model.IntroductionEntity;

import java.util.List;

/**
 * Created by Mammad on 6/22/2017.
 */
public interface IntroductionService {

    public Boolean insertIntroduction(IntroductionEntity introductionEntity);

    public List<IntroductionEntity> getByRecommenderPhoneNumber(IntroductionEntity introductionEntity);
    public IntroductionEntity getByNeedyName(IntroductionEntity introductionEntity);
}
