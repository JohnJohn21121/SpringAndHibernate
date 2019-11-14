package com.JohnJohn21121;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    //create no arg constructor


    public CricketCoach() {
        System.out.println("Inside: no-arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes per day";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
