package com.sbu.dao.model;

import javax.persistence.*;

/**
 * Created by Mammad on 6/21/2017.
 */
@Entity
@Table(name = "donate")
public class donate {


    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column( length=50)
    private String cost_of_pay;

    public String getCost_of_pay() {
        return cost_of_pay;
    }

    public void setCost_of_pay(String cost_of_pay) {
        this.cost_of_pay = cost_of_pay;
    }

    public Long getId() {
        return id;
    }

}
