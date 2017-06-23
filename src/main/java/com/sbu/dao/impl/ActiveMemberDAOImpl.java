package com.sbu.dao.impl;

import com.sbu.dao.ActiveMemberDAO;
import com.sbu.dao.model.ActiveMemberEntity;
import com.sbu.dao.model.MessageEntity;
import com.sun.org.apache.xpath.internal.operations.Bool;
import javassist.bytecode.stackmap.BasicBlock;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Cache;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Mammad on 6/22/2017.
 */
@Repository
public class ActiveMemberDAOImpl implements ActiveMemberDAO {

    @PersistenceContext
    public EntityManager entityManager;

    @Override
    @Transactional
    public ActiveMemberEntity getActiveMemberEntity(String id) {
        ActiveMemberEntity activeMemberEntity=(ActiveMemberEntity) entityManager.find(ActiveMemberEntity.class,id);
        return activeMemberEntity;
    }

    @Override
    //@Transactional
    public Boolean insertActiveMemberEntity(ActiveMemberEntity activeMemberEntity) {

        try {
            entityManager.persist(activeMemberEntity);
            return true;
        }
        catch (Exception e){
            return false;
        }

    }
}
