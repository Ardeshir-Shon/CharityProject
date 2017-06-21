package com.sbu.dao.model;

import javax.persistence.*;

/**
 * Created by Mammad on 6/21/2017.
 */
@Entity
@Table(name = "helper")
public class helper {

    @Column( length=50)
    private String name;
    @Column( length=50)
    private String family;
    @Column( length=50)
    private String occupation;
    private boolean sbu_professor;
    private boolean sbu_student;
    @Id
    @Column( length=50)
    private String phone_number;
    @Column( length=50)
    private String email;
    private Help_period help_period;
    @Column( length=50)
    private String cost_of_pay;
    @Column( length=50)
    private String password;
    @Column( length=500)
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public boolean isSbu_professor() {
        return sbu_professor;
    }

    public void setSbu_professor(boolean sbu_professor) {
        this.sbu_professor = sbu_professor;
    }

    public boolean isSbu_student() {
        return sbu_student;
    }

    public void setSbu_student(boolean sbu_student) {
        this.sbu_student = sbu_student;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Enumerated(EnumType.ORDINAL)
    public Help_period getHelp_period() {
        return help_period;
    }

    public void setHelp_period(Help_period help_period) {
        this.help_period = help_period;
    }




    public String getCost_of_pay() {
        return cost_of_pay;
    }

    public void setCost_of_pay(String cost_of_pay) {
        this.cost_of_pay = cost_of_pay;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
