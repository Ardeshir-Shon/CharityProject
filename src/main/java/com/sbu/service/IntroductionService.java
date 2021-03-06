package com.sbu.service;

import com.sbu.dao.model.IntroductionEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ListIterator;

/**
 * Created by Mammad on 6/22/2017.
 */
public interface IntroductionService {


    public Boolean validation(IntroductionEntity introductionEntity);
    public Boolean insertIntroduction(IntroductionEntity introductionEntity);

    public List<IntroductionEntity> getByRecommenderPhoneNumber(IntroductionEntity introductionEntity);
    public IntroductionEntity getByNeedyName(IntroductionEntity introductionEntity);
}
