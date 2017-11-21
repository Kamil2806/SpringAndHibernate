package com.udemy.tutorial.DIWithXMLConfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainConstructorInjection {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("DIApplicationContext.xml");

        Coach coach = context.getBean("theCoach", Coach.class );

        System.out.println(coach.getDailyPlan());

        System.out.println(coach.getDailyFortune());

        context.close();
    }
}
