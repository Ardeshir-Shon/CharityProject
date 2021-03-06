package com.sbu.dao.model;

import javax.persistence.*;

/**
 * Created by Mammad on 6/21/2017.
 */
@Entity
@Table(name = "INTRODUCTION")
public class IntroductionEntity {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column( length=50, nullable = false)
    private String recommenderName;
    @Column( length=50, nullable = false)
    private String recommenderFamily;
    @Column( length=50, nullable = false , unique = true)
    private String recommenderPhoneNumber;
    @Column( length=50, nullable = false)
    private String recommenderStudentId;


    @Column( length=50, nullable = false)
    private String needyName;
    @Column( length=50, nullable = false)
    private String needyFamily;
    @Column( length=50)
    private String needyStudentId;
    private String  needyGender;
    private String needyEnteringYear;
    private String needyCollege;
    private boolean needyDormOccupy;

    @Column( length=500)
    private String aboutNeedyStudent;
    @Column( length=500)
    private String recognition;

    public IntroductionEntity() {
    }

    public Long getId() {
        return id;
    }

    public String getRecommenderName() {
        return recommenderName;
    }

    public void setRecommenderName(String recommenderName) {
        this.recommenderName = recommenderName;
    }

    public String getRecommenderFamily() {
        return recommenderFamily;
    }

    public void setRecommenderFamily(String recommenderFamily) {
        this.recommenderFamily = recommenderFamily;
    }

    public String getRecommenderPhoneNumber() {
        return recommenderPhoneNumber;
    }

    public void setRecommenderPhoneNumber(String recommenderPhoneNumber) {
        this.recommenderPhoneNumber = recommenderPhoneNumber;
    }

    public String getNeedyName() {
        return needyName;
    }

    public void setNeedyName(String needyName) {
        this.needyName = needyName;
    }

    public String getNeedyFamily() {
        return needyFamily;
    }

    public void setNeedyFamily(String needyFamily) {
        this.needyFamily = needyFamily;
    }

    public String getNeedyStudentId() {
        return needyStudentId;
    }

    public void setNeedyStudentId(String needyStudentId) {
        this.needyStudentId = needyStudentId;
    }

    public String getRecommenderStudentId() {
        return recommenderStudentId;
    }

    public void setRecommenderStudentId(String recommenderStudentId) {
        this.recommenderStudentId = recommenderStudentId;
    }

    @Enumerated(EnumType.ORDINAL)
    public String getNeedyGender() {
        return needyGender;
    }

    public void setNeedyGender(String needyGender) {
        this.needyGender = needyGender;
    }

    public String getNeedyEnteringYear() {
        return needyEnteringYear;
    }

    public void setNeedyEnteringYear(String needEnteringYear) {
        this.needyEnteringYear = needyEnteringYear;
    }

    public String getNeedyCollege() {
        return needyCollege;
    }

    public void setNeedyCollege(String needy_college) {
        this.needyCollege = needyCollege;
    }

    public boolean isNeedyDormOccupy() {
        return needyDormOccupy;
    }

    public void setNeedyDormOccupy(boolean needy_dorm_occupy) {
        this.needyDormOccupy = needyDormOccupy;
    }



    public String getAboutNeedyStudent() {
        return aboutNeedyStudent;
    }

    public void setAboutNeedyStudent(String aboutNeedyStudent) {
        this.aboutNeedyStudent = aboutNeedyStudent;
    }

    public String getRecognition() {
        return recognition;
    }

    public void setRecognition(String recognition) {
        this.recognition = recognition;
    }
}
