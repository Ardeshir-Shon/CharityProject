package com.sbu.service;

import com.sbu.dao.model.IntroductionEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Mammad on 6/22/2017.
 */
public interface IntroductionService {

    public void insertIntroduction(IntroductionEntity introductionEntity);

    public List<IntroductionEntity> getByRecommenderPhoneNumber(IntroductionEntity introductionEntity);
    public IntroductionEntity getByNeedyName(IntroductionEntity introductionEntity);
}
