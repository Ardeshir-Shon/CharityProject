package com.sbu.controller.model;

/**
 * Created by user on 6/21/2017.
 */
public class MessageModel {
    private String name;
    private String title;
    private String body;
    private String tendency;
    private String phoneNumber;
    private String email;
    private String newsletterEmail;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getNewsletterEmail() {
        return newsletterEmail;
    }

    public void setNewsletterEmail(String newsletterEmail) {
        this.newsletterEmail = newsletterEmail;
    }

    public String getBody() {
        return body;
    }

    public boolean isTendency() {
        return !(tendency==null);
    }

    public void setTendency(String tendency) {
        this.tendency = tendency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
