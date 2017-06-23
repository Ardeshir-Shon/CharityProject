package com.sbu.controller.DTO;

import com.sbu.dao.model.ActiveMemberEntity;

/**
 * Created by user on 6/23/2017.
 */
public class ActiveMemberDTO {

    private Integer state ;
    private ActiveMemberEntity filled;

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getState() {
        return state;
    }

    public ActiveMemberEntity getFilled() {
        return filled;
    }

    public void setFilled(ActiveMemberEntity filled) {
        this.filled = filled;
    }
}
