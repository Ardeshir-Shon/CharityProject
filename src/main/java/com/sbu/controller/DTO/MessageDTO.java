package com.sbu.controller.DTO;

import com.sbu.dao.model.MessageEntity;

/**
 * Created by user on 6/24/2017.
 */
public class MessageDTO {

    private MessageEntity messageEntity;
    private Integer state;

    public MessageEntity getMessageEntity() {
        return messageEntity;
    }

    public Integer getState() {
        return state;
    }

    public void setMessageEntity(MessageEntity messageEntity) {
        this.messageEntity = messageEntity;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}

