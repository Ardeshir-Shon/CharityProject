package com.sbu.service.impl;

import com.sbu.dao.ActiveMemberDAO;
import com.sbu.dao.model.ActiveMemberEntity;
import com.sbu.service.ActiveMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Mammad on 6/22/2017.
 */
@Service
public class ActiveMemberServiceImpl implements ActiveMemberService {

    @Autowired
    ActiveMemberDAO activeMemberDAO;



    @Override
    public ActiveMemberEntity getActiveMemberEntity(ActiveMemberEntity activeMemberEntity) {
        return activeMemberDAO.getActiveMemberEntity(activeMemberEntity.getPhoneNumber());
    }

    @Override
    public Boolean validation(ActiveMemberEntity activeMemberEntity){
        if(activeMemberEntity.getPhoneNumber()!=null && Validate.validateNumer(activeMemberEntity.getPhoneNumber())){
            if(activeMemberEntity.getStudentId()!=null &&Validate.validateNumer(activeMemberEntity.getStudentId())){
                if(activeMemberEntity.getEmail()!=null && Validate.validateEmail(activeMemberEntity.getEmail())){
                    return true;
                }
            }

        }
        return false;
    }

    @Override
    public Boolean idExist(ActiveMemberEntity activeMemberEntity){

        return !(getActiveMemberEntity(activeMemberEntity)==null);
    }

    @Override
    public Boolean insertActiveMemberEntity(ActiveMemberEntity activeMemberEntity) {
        return activeMemberDAO.insertActiveMemberEntity(activeMemberEntity);
    }
}
