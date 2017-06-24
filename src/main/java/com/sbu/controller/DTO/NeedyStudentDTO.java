package com.sbu.controller.DTO;

import com.sbu.dao.model.NeedyStudentEntity;

/**
 * Created by user on 6/24/2017.
 */
public class NeedyStudentDTO {
    private NeedyStudentEntity needyStudentEntity;
    private Integer state;

    public NeedyStudentEntity getNeedyStudentEntity() {
        return needyStudentEntity;
    }

    public Integer getState() {
        return state;
    }

    public void setNeedyStudentEntity(NeedyStudentEntity needyStudentEntity) {
        this.needyStudentEntity = needyStudentEntity;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
