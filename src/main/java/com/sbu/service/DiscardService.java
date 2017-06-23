package com.sbu.service;

import com.sbu.dao.model.HelperEntity;

/**
 * Created by Mammad on 6/22/2017.
 */
public interface DiscardService {
    public void dicardHelper(HelperEntity helperEntity);
    public Boolean validation(String phoneNumber , String passWord);
}
