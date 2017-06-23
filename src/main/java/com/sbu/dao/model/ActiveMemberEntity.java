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
@Table(name = "ACTIVE_MEMBER")
public class ActiveMemberEntity {

    @Column( length=50, nullable = false)
    private String name;
    @Column( length=50, nullable = false)
    private String family;
    @Column( length=50 , unique = true)
    private String email;
    @Id
    @Column( length=50, nullable = false , unique = true)
    private String phoneNumber;
    @Column( length=500, nullable = false)
    private String description;

    @Column( length=50, nullable = false)
    private String studentId;

    public ActiveMemberEntity(String name, String family, String phone_number) {
        this.name = name;
        this.family = family;
        this.phoneNumber = phone_number;
    }

    public ActiveMemberEntity() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhone_number(String phone_number) {
        this.phoneNumber = phone_number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
