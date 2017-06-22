package com.sbu.dao;

import com.sbu.dao.model.HelperEntity;
import org.hibernate.boot.model.source.internal.hbm.Helper;

/**
 * Created by Mammad on 6/22/2017.
 */
public interface HelperDAO {

    public void insertPeriodicHelp(HelperEntity helperEntity);

    //public HelperEntity getByName(String name,String family);
    public  HelperEntity getByEmail(String email);
    public  HelperEntity getByPhoneNumber(String phoneNumber);

}
