package com.sirosh.di;

/**
 * Created by Illya on 01.02.17.
 */
public class Discipline {

    private String name;
    private int credits;


    public Discipline(){}

    public Discipline(String name,int credits){
        this .name = name;
        this.credits = credits;
    }


    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setName(String name) {
        this.name = name;
    }

   public String getName(){
        return name;
   }

   public int getCredits(){
       return credits;
   }



}
