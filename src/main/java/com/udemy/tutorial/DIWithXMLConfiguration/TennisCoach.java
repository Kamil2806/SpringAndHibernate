package com.udemy.tutorial.DIWithXMLConfiguration;

public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyPlan() {
        return "I do 50 pumps";
    }

    public String getDailyFortune() { return fortuneService.getFortune(); }
}
