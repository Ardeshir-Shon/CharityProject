package com.sbu.controller.model;


/**
 * Created by user on 6/23/2017.
 */
public class RecommendationModel {

    private String succorFirstName;
    private String succorLastName;
    private String isStudent;
    private String succorStudentNumber;
    private String succorPhoneNumber;

    private String needyFirstName;
    private String needyLastName;
    private String needyStudentNumber;
    private String needyGender;
    private String needyEntryYear;
    private String needyFacultyName;
    private String otherFacultyName;
    private String isDormSettler;
    private String isNotDormSettler;
    private String moreInfo;
    private String awarenessInfo;

    public String getSuccorFirstName() {
        return succorFirstName;
    }

    public String getSuccorLastName() {
        return succorLastName;
    }

    public Boolean getStudent() {
        return !(isStudent==null);
    }

    public String getSuccorStudentNumber() {
        return succorStudentNumber;
    }

    public String getSuccorPhoneNumber() {
        return succorPhoneNumber;
    }

    public String getNeedyFirstName() {
        return needyFirstName;
    }

    public String getNeedyLastName() {
        return needyLastName;
    }

    public String getNeedyStudentNumber() {
        return needyStudentNumber;
    }

    public String getNeedyGender() {
        return needyGender;
    }

    public String getNeedyEntryYear() {
        return needyEntryYear;
    }

    public String getNeedyFacultyName() {
        return needyFacultyName;
    }

    public String getOtherFacultyName() {
        return otherFacultyName;
    }

    public Boolean getIsDormSettler() {
        return !(isDormSettler==null);
    }

    public Boolean getIsNotDormSettler() {
        return !(isNotDormSettler==null);
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public String getAwarenessInfo() {
        return awarenessInfo;
    }

    public void setSuccorFirstName(String succorFirstName) {
        this.succorFirstName = succorFirstName;
    }

    public void setSuccorLastName(String succorLastName) {
        this.succorLastName = succorLastName;
    }

    public void setIsStudent(String student) {
        isStudent = student;
    }

    public void setSuccorStudentNumber(String succorStudentNumber) {
        this.succorStudentNumber = succorStudentNumber;
    }

    public void setSuccorPhoneNumber(String succorPhoneNumber) {
        this.succorPhoneNumber = succorPhoneNumber;
    }

    public void setNeedyFirstName(String needyFirstName) {
        this.needyFirstName = needyFirstName;
    }

    public void setNeedyLastName(String needyLastName) {
        this.needyLastName = needyLastName;
    }

    public void setNeedyStudentNumber(String needyStudentNumber) {
        this.needyStudentNumber = needyStudentNumber;
    }

    public void setNeedyGender(String needyGender) {
        this.needyGender = needyGender;
    }

    public void setNeedyEntryYear(String needyEntryYear) {
        this.needyEntryYear = needyEntryYear;
    }

    public void setNeedyFacultyName(String needyFacultyName) {
        this.needyFacultyName = needyFacultyName;
    }

    public void setOtherFacultyName(String otherFacultyName) {
        this.otherFacultyName = otherFacultyName;
    }

    public void setIsDormSettler(String isDormSettler) {
        this.isDormSettler = isDormSettler;
    }

    public void setIsNotDormSettler(String isNotDormSettler) {
        this.isNotDormSettler = isNotDormSettler;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    public void setAwarenessInfo(String awarenessInfo) {
        this.awarenessInfo = awarenessInfo;
    }
}
