package com.sbu.dao;

import com.sbu.dao.model.MessageEntity;

/**
 * Created by user on 6/22/2017.
 */
public interface MessageDAO {

    public MessageEntity getMessagebyId(Long id);
    public Boolean insertMessage(MessageEntity message);

}
