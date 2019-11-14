package com.JohnJohn21121;

public class BaseballCoach implements Coach{

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on Batting Practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
