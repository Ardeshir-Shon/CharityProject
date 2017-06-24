package com.sbu.service.impl;

import com.sbu.dao.MessageDAO;
import com.sbu.dao.model.IntroductionEntity;
import com.sbu.dao.model.MessageEntity;
import com.sbu.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by user on 6/22/2017.
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    MessageDAO messageDAO;

    @Override
    public Boolean validation(MessageEntity messageEntity){
        if(Validate.validateNumer(messageEntity.getPhoneNumber())){
            if(Validate.validateEmail(messageEntity.getEmail())){
                    return true;
                }
        }
        return false;
    }

    @Override
    public MessageEntity getMessage(MessageEntity message) {
        return messageDAO.getMessagebyId(message.getId());
    }

    @Override
    public Boolean insertMessage(MessageEntity message) {
        return messageDAO.insertMessage(message);
    }
}
