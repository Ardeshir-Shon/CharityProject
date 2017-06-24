package com.sbu.service;

import com.sbu.dao.model.HelperEntity;

/**
 * Created by Mammad on 6/22/2017.
 */
public interface HelperService {


    public  Boolean idExist(HelperEntity helperEntity);
    public Boolean validation(HelperEntity helperEntity);
    public Boolean insertPeriodicHelp(HelperEntity helperEntity);

    public  HelperEntity getByEmail(HelperEntity helperEntity);
    public  HelperEntity getByPhoneNumber(HelperEntity helperEntity);

}
