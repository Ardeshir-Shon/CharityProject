package com.sbu.controller.model;

/**
 * Created by user on 6/22/2017.
 */
public class ActiveMemberModel {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String mail;
    private String description;
    private String isStudent;
    private String studentNumber;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getStudent() {
        return !isStudent.isEmpty();
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStudent(String student) {
        isStudent = student;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
}
