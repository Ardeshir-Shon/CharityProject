package com.sbu.service.impl;

import com.sbu.dao.NeedyStudentDAO;
import com.sbu.dao.model.MessageEntity;
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
    public Boolean validation(NeedyStudentEntity needyStudentEntity){
        if(Validate.validateNumer(needyStudentEntity.getPhoneNumber())){
            if(Validate.validateNumer(needyStudentEntity.getStudentId())){
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean idExist(NeedyStudentEntity needyStudentEntity){
        return getByPhoneNumber(needyStudentEntity).equals(null);
    }

    @Override
    public void insertNeedyStudent(NeedyStudentEntity needyStudentEntity) {
        needyStudentDAO.insertNeedyStudent(needyStudentEntity);
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
