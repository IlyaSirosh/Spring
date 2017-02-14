package com.sirosh.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Illya on 01.02.17.
 */
public class Main {

    public static void main(String[] arg){
        ApplicationContext context = new ClassPathXmlApplicationContext("DI.xml");

        Student s1 = (Student) context.getBean("sam");

        System.out.println(s1.getId());
        System.out.println(s1.getName());

        for(Discipline x: s1.getDisciplenes())
            System.out.println(x.getName() + " , " + x.getCredits());

    }
}
