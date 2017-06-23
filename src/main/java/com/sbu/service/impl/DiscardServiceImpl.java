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

    HelperEntity helperEntity;
    String plainText;
    String cipherText;

    @Override
    public void dicardHelper(HelperEntity helperEntity) {
        discardDAO.dicardHelperEntity(helperEntity.getPhoneNumber());
    }
    public Boolean validation(String phoneNumber , String passWord){
        helperEntity = discardDAO.getHelper(phoneNumber);
        cipherText = helperEntity.getPassword();
        plainText = Encryptor.decrypt(cipherText);

        if(passWord == plainText){
            return true;
        }
        else {
            return false;
        }
    }
}
