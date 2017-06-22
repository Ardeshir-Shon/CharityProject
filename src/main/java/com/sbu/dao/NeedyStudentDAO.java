package com.sbu.dao;

import com.sbu.dao.model.NeedyStudentEntity;

/**
 * Created by Mammad on 6/22/2017.
 */
public interface NeedyStudentDAO {

    public boolean setNeedyStudent(NeedyStudentEntity needyStudentEntity);
    public NeedyStudentEntity getByStudentId(String student_Id);
    public NeedyStudentEntity getByPhoneNumber(String phoneNumber);
    public NeedyStudentEntity getByName(String name,String family);
}
