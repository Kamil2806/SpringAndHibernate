package com.udemy.tutorial.BeanLifecyceXMLConfiguration;

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

    public String getDailyFortune() {
        return "It's your bad day";
    }

    public String getDailyPlan() {
        return "50 kick per day";
    }

    // it's bean initial method
    public void startStuff() {
        System.out.println("Called initial method");
    }

    // it's bean destroy method
    public void destroyStuff(){
        System.out.println("Called destory method");
    }

}
