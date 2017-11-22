package com.udemy.tutorial.BeanLifecyceXMLConfiguration;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainBLC {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("BeanLifecycleApplicationContext.xml");

        TKDCoach theCoachOne = context.getBean("theTKDCoach", TKDCoach.class);

        TKDCoach theCoachTwo = context.getBean("theTKDCoach", TKDCoach.class);

        System.out.println(theCoachOne == theCoachTwo);

        System.out.println(theCoachOne.getDailyPlan());

        context.close();
    }
}
