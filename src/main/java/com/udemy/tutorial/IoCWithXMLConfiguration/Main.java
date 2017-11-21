package com.udemy.tutorial.IoCWithXMLConfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("IoCApplicationContext.xml");

        Coach coach = context.getBean("theCoach", Coach.class );

        System.out.println(coach.getDailyPlan());

        context.close();
    }
}
