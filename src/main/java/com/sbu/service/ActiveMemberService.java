package com.sbu.service;

import com.sbu.dao.model.ActiveMemberEntity;

/**
 * Created by Mammad on 6/22/2017.
 */
public interface ActiveMemberService {

    public ActiveMemberEntity getActiveMemberEntity(ActiveMemberEntity activeMemberEntity);

    public Boolean idExist(ActiveMemberEntity activeMemberEntity);
    public Boolean validation(ActiveMemberEntity activeMemberEntity);
    public Boolean insertActiveMemberEntity(ActiveMemberEntity activeMemberEntity);

}
