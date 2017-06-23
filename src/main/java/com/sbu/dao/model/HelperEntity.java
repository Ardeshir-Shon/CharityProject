package com.sbu.dao.model;

import javax.persistence.*;

/**
 * Created by Mammad on 6/21/2017.
 */
@Entity
@Table(name = "HELPER")
public class HelperEntity {

    @Column( length=50, nullable = false)
    private String name;
    @Column( length=50, nullable = false)
    private String family;
    @Column( length=50)
    private String occupation;
    //private boolean sbuProfessor;
    //private boolean sbuStudent;
    private College professorCollege;
    @Id
    @Column( length=50 , unique = true)
    private String phoneNumber;
    @Column( length=50 , unique = true)
    private String email;
    private HelpPeriod helpPeriod;
    @Column( length=50, nullable = false)
    private String costOfPay;
    @Column( length=50, nullable = false)
    private String password;
    @Column( length=500, nullable = false)
    private String descriptionForNonCash;

    public HelperEntity() {
    }

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


    /*
    public boolean isSbuProfessor() {
        return sbuProfessor;
    }

    public void setSbuProfessor(boolean sbuProfessor) {
        this.sbuProfessor = sbuProfessor;
    }

    public boolean isSbuStudent() {
        return sbuStudent;
    }

    public void setSbuStudent(boolean sbu_student) {
        this.sbuStudent = sbuStudent;
    }
    */


    public College getProfessorCollege() {
        return professorCollege;
    }

    public void setProfessorCollege(College professorCollege) {
        this.professorCollege = professorCollege;
    }

    public HelpPeriod getHelpPeriod() {
        return helpPeriod;
    }

    @Enumerated(EnumType.ORDINAL)
    public  void setHelpPeriod(String helpPeriod){
        this.helpPeriod = helpPeriod;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phone_number) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getCostOfPay() {
        return costOfPay;
    }

    public void setCostOfPay(String costOfPay) {
        this.costOfPay = costOfPay;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return descriptionForNonCash;
    }

    public void setDescription(String description) {
        this.descriptionForNonCash = description;
    }
}
