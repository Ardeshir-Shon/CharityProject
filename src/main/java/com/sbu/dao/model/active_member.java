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
@Table(name = "active_member")
public class active_member {

    @Column( length=50)
    private String name;
    @Column( length=50)
    private String family;
    @Column( length=50)
    private String email;
    @Id
    @Column( length=50)
    private String phone_number;
    @Column( length=500)
    private String description;

    private boolean sbu_student;
    @Column( length=50)
    private String student_id;

    public active_member(String name, String family, String phone_number, boolean sbu_student) {
        this.name = name;
        this.family = family;
        this.phone_number = phone_number;
        this.sbu_student = sbu_student;
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

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isSbu_student() {
        return sbu_student;
    }

    public void setSbu_student(boolean sbu_student) {
        this.sbu_student = sbu_student;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }
}
