package com.sirosh.di;

import java.util.Collection;

/**
 * Created by Illya on 01.02.17.
 */



public class Student {

    private static int freeId;


    private int id;
    private String name;

    public void setDisciplenes(Collection<Discipline> disciplenes) {
        this.disciplenes = disciplenes;
    }

    public Collection<Discipline> getDisciplenes() {
        return disciplenes;
    }

    private Collection<Discipline> disciplenes;

    public Student(){
        this.id = (++freeId);
    }

    public Student(String name){
        this();
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    };


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
