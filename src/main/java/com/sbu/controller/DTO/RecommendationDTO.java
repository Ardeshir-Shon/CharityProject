package com.sbu.controller.DTO;

import com.sbu.dao.model.IntroductionEntity;

/**
 * Created by user on 6/23/2017.
 */
public class RecommendationDTO {
    private IntroductionEntity filled;
    private Integer state;

    public IntroductionEntity getFilled() {
        return filled;
    }

    public Integer getState() {
        return state;
    }

    public void setFilled(IntroductionEntity filled) {
        this.filled = filled;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
