package com.sbu.controller.model;

/**
 * Created by user on 6/23/2017.
 */
public class PeriodicHelpCashModel {
    private String firstName;
    private String lastName;
    private String occupation;
    private String isProfessor;
    private String facultyName;
    private String otherFacultyName;
    private String phoneNumber;
    private String email;
    private String timePeriod;
    private String costOfPay;
    private String password;
    private String passwordRepeat;
    // why student field added?
    private boolean isStudent;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public boolean isProfessor() {
        return !isProfessor.isEmpty();
    }

    public String getFacultyName() {
        return facultyName;
    }

    public String getOtherFacultyName() {
        return otherFacultyName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getTimePeriod() {
        return timePeriod;
    }

    public String getCostOfPay() {
        return costOfPay;
    }

    public String getPassword() {
        return password;
    }

    public String getPasswordRepeat() {
        return passwordRepeat;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setProfessor(String professor) {
        isProfessor = professor;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public void setOtherFacultyName(String otherFacultyName) {
        this.otherFacultyName = otherFacultyName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTimePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
    }

    public void setCostOfPay(String costOfPay) {
        this.costOfPay = costOfPay;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPasswordRepeat(String passwordRepeat) {
        this.passwordRepeat = passwordRepeat;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }
}
