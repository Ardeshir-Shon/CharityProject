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
@Table(name = "needy_student")
public class needy_student {


    @Column( length=50)
    private String name;
    @Column( length=50)
    private String family;
    @Id
    @Column( length=50)
    private String phone_number;
    @Column( length=50)
    private String email;
    @Column( length=50)
    private String student_id;
    @Column( length=500)
    private String description;

    public needy_student(String name, String family, String phone_number, String email) {
        this.name = name;
        this.family = family;
        this.phone_number = phone_number;
        this.email = email;
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

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }


    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
