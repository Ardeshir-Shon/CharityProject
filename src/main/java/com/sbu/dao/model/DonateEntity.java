package com.sbu.dao.model;

import javax.persistence.*;

/**
 * Created by Mammad on 6/21/2017.
 */
@Entity
@Table(name = "DONATE")
public class DonateEntity {


    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column( length=50, nullable = false)
    private String costOfPay;

    public DonateEntity() {
    }

    public String getCostOfPay() {
        return costOfPay;
    }

    public void setCostOfPay(String cost_of_pay) {
        this.costOfPay = cost_of_pay;
    }

    public Long getId() {
        return id;
    }

}
