package com.sbu.controller.model;

/**
 * Created by HamidReza on 6/23/17.
 */
public class SuggestionModel {
    private String firstName;
    private String title;
    private String body;
    private String tendency;
    private String phoneNumber;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

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

    public Boolean getTendency() {
        return !(tendency==null);
    }

    public void setTendency(String tendency) {
        this.tendency = tendency;
    }
}
