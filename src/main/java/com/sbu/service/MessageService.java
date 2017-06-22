package com.sbu.service;

import com.sbu.dao.model.MessageEntity;
import org.springframework.stereotype.Service;

/**
 * Created by user on 6/22/2017.
 */
public interface MessageService {
    public MessageEntity getMessage(MessageEntity message);
    public Boolean insertMessage(MessageEntity message);
}
