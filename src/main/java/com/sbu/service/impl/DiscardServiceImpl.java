package com.sbu.service.impl;

import com.sbu.dao.DiscardDAO;
import com.sbu.dao.model.HelperEntity;
import com.sbu.service.DiscardService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Mammad on 6/22/2017.
 */
public class DiscardServiceImpl implements DiscardService {

    @Autowired
    DiscardDAO discardDAO;

    @Override
    public Boolean dicardHelper(HelperEntity helperEntity) {
        return discardDAO.dicardHelper(helperEntity.getPhoneNumber());
    }
}
