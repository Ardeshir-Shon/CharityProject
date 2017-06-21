package com.sbu.dao.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by Mammad on 6/21/2017.
 */
@Entity
@Table(name = "introduction")
public class introduction {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column( length=50)
    private String recommender_name;
    @Column( length=50)
    private String recommender_family;
    @Column( length=50)
    private String recommender_phone_number;
    private boolean sbu_student;
    @Column( length=50)
    private String recommender_student_id;


    @Column( length=50)
    private String needy_name;
    @Column( length=50)
    private String needy_family;
    @Column( length=50)
    private String needy_student_id;
    private Gender  needy_gender;
    private Entry_year needy_entering_year;
    private College needy_college;
    private boolean needy_dorm_occupy;

    @Column( length=500)
    private String about_needy_student;
    @Column( length=500)
    private String recognition;

    public Long getId() {
        return id;
    }

    public String getRecommender_name() {
        return recommender_name;
    }

    public void setRecommender_name(String recommender_name) {
        this.recommender_name = recommender_name;
    }

    public String getRecommender_family() {
        return recommender_family;
    }

    public void setRecommender_family(String recommender_family) {
        this.recommender_family = recommender_family;
    }

    public String getRecommender_phone_number() {
        return recommender_phone_number;
    }

    public void setRecommender_phone_number(String recommender_phone_number) {
        this.recommender_phone_number = recommender_phone_number;
    }

    public boolean isSbu_student() {
        return sbu_student;
    }

    public void setSbu_student(boolean sbu_student) {
        this.sbu_student = sbu_student;
    }

    public String getNeedy_name() {
        return needy_name;
    }

    public void setNeedy_name(String needy_name) {
        this.needy_name = needy_name;
    }

    public String getNeedy_family() {
        return needy_family;
    }

    public void setNeedy_family(String needy_family) {
        this.needy_family = needy_family;
    }

    public String getNeedy_student_id() {
        return needy_student_id;
    }

    public void setNeedy_student_id(String needy_student_id) {
        this.needy_student_id = needy_student_id;
    }

    public String getRecommender_student_id() {
        return recommender_student_id;
    }

    public void setRecommender_student_id(String recommender_student_id) {
        this.recommender_student_id = recommender_student_id;
    }

    @Enumerated(EnumType.ORDINAL)
    public Gender getNeedy_gender() {
        return needy_gender;
    }

    public void setNeedy_gender(Gender needy_gender) {
        this.needy_gender = needy_gender;
    }

    public Entry_year getNeedy_entering_year() {
        return needy_entering_year;
    }

    public void setNeedy_entering_year(Entry_year needy_entering_year) {
        this.needy_entering_year = needy_entering_year;
    }

    public College getNeedy_college() {
        return needy_college;
    }

    public void setNeedy_college(College needy_college) {
        this.needy_college = needy_college;
    }

    public boolean isNeedy_dorm_occupy() {
        return needy_dorm_occupy;
    }

    public void setNeedy_dorm_occupy(boolean needy_dorm_occupy) {
        this.needy_dorm_occupy = needy_dorm_occupy;
    }



    public String getAbout_needy_student() {
        return about_needy_student;
    }

    public void setAbout_needy_student(String about_needy_student) {
        this.about_needy_student = about_needy_student;
    }

    public String getRecognition() {
        return recognition;
    }

    public void setRecognition(String recognition) {
        this.recognition = recognition;
    }
}
