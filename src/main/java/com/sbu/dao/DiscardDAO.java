package com.sbu.dao;

import com.sbu.dao.model.HelperEntity;
import org.hibernate.boot.model.source.internal.hbm.Helper;

/**
 * Created by Mammad on 6/22/2017.
 */
public interface DiscardDAO {

    public Boolean dicardHelperEntity(String id);
    public HelperEntity getHelper(String id);
}
