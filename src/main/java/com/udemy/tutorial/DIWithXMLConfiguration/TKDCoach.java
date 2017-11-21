package com.udemy.tutorial.DIWithXMLConfiguration;

public class TKDCoach implements Coach {

    private FortuneService fortuneService;
    private String email;
    private String city;

    public TKDCoach() {
        System.out.println("It's my no-arg constructor");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Setter is used");
        this.fortuneService = fortuneService;
    }

    public String getDailyPlan() { return "I do nothing"; }
    
    public String getDailyFortune() { return "I said: " + fortuneService.getFortune(); }

}
