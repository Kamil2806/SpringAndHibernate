package com.udemy.tutorial.DIWithXMLConfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSetterInjection {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("DIApplicationContext.xml");

        TKDCoach theCoach = context.getBean("theTKDCoach", TKDCoach.class);

        System.out.println(theCoach.getDailyPlan());

        System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach.getCity());

        System.out.println(theCoach.getEmail());

        context.close();
    }
}
