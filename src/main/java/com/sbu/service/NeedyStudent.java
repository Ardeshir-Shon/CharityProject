package com.sbu.service;

import com.sbu.dao.model.NeedyStudentEntity;

/**
 * Created by Mammad on 6/22/2017.
 */
public interface NeedyStudent {


    public Boolean insertNeedyStudent(NeedyStudentEntity needyStudentEntity);

    public NeedyStudentEntity getByStudentId(NeedyStudent needyStudent);
    public NeedyStudentEntity getByPhoneNumber(NeedyStudent needyStudent);

}
