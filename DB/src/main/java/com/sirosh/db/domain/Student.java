package com.sirosh.db.domain;


/**
 * Created by Illya on 17.03.17.
 */


public class Student {

    private int id;
    private String pib;
    private int course;

    public Student(){};

    public Student(String pib, int course) {
        this.pib = pib;
        this.course = course;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }


}
