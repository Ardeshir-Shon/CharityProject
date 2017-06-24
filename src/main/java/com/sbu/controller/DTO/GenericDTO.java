package com.sbu.controller.DTO;

/**
 * Created by user on 6/24/2017.
 */
public class GenericDTO <T> {

    private T filled;
    private Integer state;

    public T getFilled() {
        return filled;
    }

    public void setFilled(T filled) {
        this.filled = filled;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
