package com.sbu.dao;

import com.sbu.dao.model.ActiveMemberEntity;

/**
 * Created by Mammad on 6/22/2017.
 */
public interface ActiveMemberDAO {

        public ActiveMemberEntity getActiveMemberEntity(String id);
        public Boolean insertActiveMemberEntity(ActiveMemberEntity activeMemberEntity);
}
