package com.sbu.service;

import com.sbu.dao.model.NeedyStudentEntity;

/**
 * Created by Mammad on 6/22/2017.
 */
public interface NeedyStudentService {


    public void insertNeedyStudent(NeedyStudentEntity needyStudentEntity);

    public NeedyStudentEntity getByStudentId(NeedyStudentEntity needyStudentEntity);
    public NeedyStudentEntity getByPhoneNumber(NeedyStudentEntity needyStudentEntity);

}
