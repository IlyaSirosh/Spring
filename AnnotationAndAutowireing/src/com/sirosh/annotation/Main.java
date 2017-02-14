package com.sirosh.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Illya on 14.02.17.
 */
public class Main {


    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");

        Gamer p1 = (Gamer) context.getBean("tetrisPlayer");

        p1.play();
    }
}
