package com.sbu.service.impl;

import com.sbu.dao.NeedyStudentDAO;
import com.sbu.dao.model.NeedyStudentEntity;
import com.sbu.service.NeedyStudentService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Mammad on 6/22/2017.
 */
public class NeedyStudentServiceImpl implements NeedyStudentService{

    @Autowired
    NeedyStudentDAO needyStudentDAO;

    @Override
    public Boolean insertNeedyStudent(NeedyStudentEntity needyStudentEntity) {
        return needyStudentDAO.insertNeedyStudent(needyStudentEntity);
    }

    @Override
    public NeedyStudentEntity getByStudentId(NeedyStudentEntity needyStudent) {
        return needyStudentDAO.getByStudentId(needyStudent.getStudentId());
    }

    @Override
    public NeedyStudentEntity getByPhoneNumber(NeedyStudentEntity needyStudent) {
        return needyStudentDAO.getByStudentId(needyStudent.getPhoneNumber());
    }
}
