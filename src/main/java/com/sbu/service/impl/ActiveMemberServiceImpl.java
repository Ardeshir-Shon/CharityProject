package com.sbu.service.impl;

import com.sbu.dao.ActiveMemberDAO;
import com.sbu.dao.model.ActiveMemberEntity;
import com.sbu.service.ActiveMemberService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Mammad on 6/22/2017.
 */
public class ActiveMemberServiceImpl implements ActiveMemberService {
    @Autowired
    ActiveMemberDAO activeMemberDAO;


    @Override
    public ActiveMemberEntity getActiveMemberEntity(ActiveMemberEntity activeMemberEntity) {
        return activeMemberDAO.getActiveMemberEntity(activeMemberEntity.getPhoneNumber());
    }

    @Override
    public void insertActiveMemberEntity(ActiveMemberEntity activeMemberEntity) {
        activeMemberDAO.insertActiveMemberEntity(activeMemberEntity);
    }
}
