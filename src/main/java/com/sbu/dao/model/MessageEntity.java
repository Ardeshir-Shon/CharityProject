package com.sbu.dao.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by Mammad on 6/21/2017.
 */
@Entity
@Table(name = "MESSAGE")
public class MessageEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column( length=50)
    private String name;
    @Column( length=50)
    private String subject;
    @Column( length=500)
    private String text;

    private boolean tendency;
    @Column( length=50)
    private String phone_number;
    @Column( length=50)
    private String Email;

    public MessageEntity(String name, String subject, String text) {
        this.name = name;
        this.subject = subject;
        this.text = text;
    }

    public MessageEntity() {
    }


    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isTendency() {
        return tendency;
    }

    public void setTendency(boolean tendency) {
        this.tendency = tendency;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }




}
