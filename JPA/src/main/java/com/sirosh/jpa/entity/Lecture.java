package com.sirosh.jpa.entity;

import javax.persistence.*;

/**
 * Created by Illya on 21.03.17.
 */


@Entity
@Table(name="lectures")
public class Lecture {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "credits")
    private double credits;

    public Lecture(){}

    public Lecture(String name, double credits) {
        this.name = name;
        this.credits = credits;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }
}
