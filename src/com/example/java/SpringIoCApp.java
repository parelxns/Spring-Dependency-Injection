package com.example.java;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIoCApp {
    public static void main(String[] args){

        // load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from the spring container
        Flight theFlight = context.getBean("myFlight", Flight.class);

        // call methods on the bean
        System.out.println(theFlight.getDailyFlight());

        // call new methods
        System.out.println(theFlight.getDailyFortune());

        // close the context
        context.close();
    }
}