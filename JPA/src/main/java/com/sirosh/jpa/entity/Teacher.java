package com.sirosh.jpa.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;


/**
 * Created by Illya on 17.03.17.
 */
@Entity
@Table(name="teachers")
public class Teacher {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "cell_phone")
    private String cellphone;

    @OneToOne(fetch = FetchType.LAZY,cascade = {CascadeType.ALL})
    @JoinTable(name="teacher_address",
               joinColumns = @JoinColumn(name="teacher_id"),
               inverseJoinColumns = @JoinColumn(name="address_id"))
    private Address address;

    @OneToMany(cascade = {CascadeType.ALL})
    @JoinTable(name="teacher_lectures",
               joinColumns = @JoinColumn(name="teacher_id"),
               inverseJoinColumns = @JoinColumn(name="lecture_id"))
    private List<Lecture> lectures;

    public Teacher(){}

    public Teacher(String firstname, String lastname, Date birthDate, String cellphone, Address address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDate = birthDate;
        this.cellphone = cellphone;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(List<Lecture> lectures) {
        this.lectures = lectures;
    }


    public int getTeacherId() {
        return id;
    }

    public void setTeacherId(int teacherId) {
        this.id = teacherId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }
}
