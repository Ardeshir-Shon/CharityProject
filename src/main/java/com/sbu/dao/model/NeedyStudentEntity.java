package com.sbu.dao.model;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Mammad on 6/21/2017.
 */
@Entity
@Table(name = "NEEDYSTUDENT")
public class NeedyStudentEntity {


    @Column( length=50, nullable = false)
    private String name;
    @Column( length=50, nullable = false)
    private String family;
    @Id
    @Column( length=50)
    private String phoneNumber;
    //@Column( length=50)
    //private String email;
    @Column( length=50, nullable = false)
    private String studentId;
    @Column( length=500)
    private String description;

    public NeedyStudentEntity(String name, String family, String phone_number) {
        this.name = name;
        this.family = family;
        this.phoneNumber = phone_number;
    }


    public NeedyStudentEntity() {
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
