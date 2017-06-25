package com.sbu.service.impl;

import com.sbu.dao.DiscardDAO;
import com.sbu.dao.model.HelperEntity;
import com.sbu.service.DiscardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Mammad on 6/22/2017.
 */
@Service
public class DiscardServiceImpl implements DiscardService {

    @Autowired
    DiscardDAO discardDAO;

    @Override
    public Boolean dicardHelper(HelperEntity helperEntity) {
        return discardDAO.dicardHelperEntity(helperEntity.getPhoneNumber());
    }

    public Boolean validation(String phoneNumber , String passWord){
        HelperEntity helperEntity = discardDAO.getHelper(phoneNumber);
        if (helperEntity==null)
            return false;
        String cipherText = helperEntity.getPassword();
        String decrypt=Encryptor.decrypt(cipherText);

        if(passWord.equals(Encryptor.decrypt(cipherText))){
            return true;
        }
        else {
            return false;
        }
    }
}
