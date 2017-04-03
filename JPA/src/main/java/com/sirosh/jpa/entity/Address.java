package com.sirosh.jpa.entity;

import javax.persistence.*;

/**
 * Created by Illya on 21.03.17.
 */

@Entity
@SecondaryTables({
        @SecondaryTable(name="city"),
        @SecondaryTable(name="country")
})
@Table(name="addresses")
public class Address {

    @Id
    @GeneratedValue
    @Column(name="id")
    private long id;

    @Column(table = "city",name="name")
    private String city;

    public Address(){}
    public Address( String country,String state,String city, String street, String building) {
        this.city = city;
        this.street = street;
        this.state = state;
        this.country = country;
        this.building = building;
    }
    @Column(name="street")
    private String street;
    @Column(table = "city",name="state")
    private String state;
    @Column(table = "country",name="name")
    private String country;
    @Column(name="building")
    private String building;


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }
}
