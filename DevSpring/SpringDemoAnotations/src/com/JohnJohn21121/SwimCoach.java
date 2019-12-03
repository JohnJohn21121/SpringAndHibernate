package com.JohnJohn21121;

public class SwimCoach implements Coach{

    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Swim 100 meters as a warm up";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }

}