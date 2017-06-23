package com.sbu.controller.model;

/**
 * Created by HamidReza on 6/23/17.
 */
public class PeriodicHelpModel {
    private String firstName;
    private String lastName;
    private String occupation;
    private boolean isProfessor;
    private String facultyName;
    private String otherFacultyName;
    private String phoneNumber;
    private String email;
    private String timePeriod;
    private String costOfPay;
    private String password;
    private String passwordRepeat;
    private boolean isStudent;
    private String expertiseInfo;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public boolean isProfessor() {
        return isProfessor;
    }

    public void setProfessor(boolean professor) {
        isProfessor = professor;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getOtherFacultyName() {
        return otherFacultyName;
    }

    public void setOtherFacultyName(String otherFacultyName) {
        this.otherFacultyName = otherFacultyName;
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

    public String getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
    }

    public String getCostOfPay() {
        return costOfPay;
    }

    public void setCostOfPay(String costOfPay) {
        this.costOfPay = costOfPay;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordRepeat() {
        return passwordRepeat;
    }

    public void setPasswordRepeat(String passwordRepeat) {
        this.passwordRepeat = passwordRepeat;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    public String getExpertiseInfo() {
        return expertiseInfo;
    }

    public void setExpertiseInfo(String expertiseInfo) {
        this.expertiseInfo = expertiseInfo;
    }
}
