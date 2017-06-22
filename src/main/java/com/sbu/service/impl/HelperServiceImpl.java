package com.sbu.service.impl;

import com.sbu.dao.HelperDAO;
import com.sbu.dao.model.HelperEntity;
import com.sbu.service.HelperService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Mammad on 6/22/2017.
 */
public class HelperServiceImpl implements HelperService {

    @Autowired
    HelperDAO helperDAO;

    @Override
    public void insertPeriodicHelp(HelperEntity helperEntity) {
        helperDAO.insertPeriodicHelp(helperEntity);
    }

    @Override
    public HelperEntity getByEmail(HelperEntity helperEntity) {
        return helperDAO.getByEmail(helperEntity.getEmail());
    }

    @Override
    public HelperEntity getByPhoneNumber(HelperEntity helperEntity) {
        return helperDAO.getByPhoneNumber(helperEntity.getPhoneNumber());
    }
}
