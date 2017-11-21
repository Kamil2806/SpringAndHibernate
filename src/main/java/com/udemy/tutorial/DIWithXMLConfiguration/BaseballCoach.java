package com.udemy.tutorial.DIWithXMLConfiguration;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyPlan() { return "I will be sleep 5h"; }

    public String getDailyFortune() { return "Just do it " + fortuneService.getFortune(); }

}
