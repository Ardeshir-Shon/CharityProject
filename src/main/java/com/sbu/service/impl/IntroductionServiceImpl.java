package com.sbu.service.impl;

import com.sbu.dao.IntroductionDAO;
import com.sbu.dao.model.IntroductionEntity;
import com.sbu.service.IntroductionService;
import com.sun.xml.internal.ws.developer.Serialization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Mammad on 6/22/2017.
 */
@Service
public class IntroductionServiceImpl implements IntroductionService {

    @Autowired
    IntroductionDAO introductionDAO;

    @Override
    public void insertIntroduction(IntroductionEntity introductionEntity) {
        introductionDAO.insertIntroduction(introductionEntity);
    }

    @Override
    public List<IntroductionEntity> getByRecommenderPhoneNumber(IntroductionEntity introductionEntity) {
        return introductionDAO.getByRecommenderPhoneNumber(introductionEntity.getRecommenderPhoneNumber());
    }

    @Override
    public IntroductionEntity getByNeedyName(IntroductionEntity introductionEntity) {
        return introductionDAO.getByNeedyName(introductionEntity.getNeedyName(),introductionEntity.getNeedyFamily());
    }
}
