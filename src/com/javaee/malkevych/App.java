package com.javaee.malkevych;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Performer performer = (Performer) context.getBean("duke");
        performer.perform();

        Performer rep = (Performer) context.getBean("repDuke");
        rep.perform();
    }
}