package com.sbu.service.impl;

import com.sbu.dao.HelperDAO;
import com.sbu.dao.model.HelperEntity;
import com.sbu.service.HelperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Mammad on 6/22/2017.
 */
@Service
public class HelperServiceImpl implements HelperService {

    @Autowired
    HelperDAO helperDAO;

    String plainText;
    String cipherText;

    @Override
    public  Boolean idExist(HelperEntity helperEntity){
        return !(getByPhoneNumber(helperEntity)==null);

    }

    @Override
    public Boolean validation(HelperEntity helperEntity){
        if(helperEntity.getEmail() != null && Validate.validateEmail(helperEntity.getEmail())){
            if(helperEntity.getPhoneNumber() != null && Validate.validateNumer(helperEntity.getPhoneNumber())){
                if(helperEntity.getCostOfPay() != null && Validate.validateNumer(helperEntity.getCostOfPay())){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Boolean insertPeriodicHelp(HelperEntity helperEntity) {
        plainText = helperEntity.getPassword();
        cipherText = Encryptor.encrypt(plainText);
        helperEntity.setPassword(cipherText);

        return helperDAO.insertPeriodicHelp(helperEntity);
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
