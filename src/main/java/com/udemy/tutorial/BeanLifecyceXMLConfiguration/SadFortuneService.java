package com.udemy.tutorial.BeanLifecyceXMLConfiguration;


import java.util.Random;

public class SadFortuneService implements FortuneService {

    private Random random = new Random();
    private String[] Fortunes = new String[3];

    public String getFortune() {
        Fortunes[0] = "I'ts your bad day";
        Fortunes[1] = "I'ts your day";
        Fortunes[2] = "It's nothing";

        return Fortunes[random.nextInt(3)];
    }
}
