package com.sbu.dao.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by Mammad on 6/21/2017.
 */
@Entity
@Table(name = "suggestion")
public class suggestion {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column( length=50)
    private String name;
    @Column( length=50)
    private String subject;
    @Column( length=500)
    private String text;

    public suggestion(String name, String subject, String text) {
        this.name = name;
        this.subject = subject;
        this.text = text;
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
}
