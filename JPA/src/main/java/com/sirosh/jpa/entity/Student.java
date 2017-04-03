package com.sirosh.jpa.entity;


import javax.persistence.*;
import java.util.List;

/**
 * Created by Illya on 17.03.17.
 */

@Entity
@Table(name="students")
public class Student {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "pib")
    private String pib;
    @Column(name = "course")
    private int course;

    @ManyToMany
    @JoinTable(name="student_lectures",
                joinColumns = @JoinColumn(name="student_id"),
                inverseJoinColumns = @JoinColumn(name="lecture_id"))
    private List<Lecture> lectures;

    public List<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(List<Lecture> lectures) {
        this.lectures = lectures;
    }

    public Student(){};

    public Student(String pib, int course, List<Lecture> lectures) {
        this.pib = pib;
        this.course = course;
        this.lectures = lectures;
    }


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
