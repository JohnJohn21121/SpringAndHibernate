package com.JohnJohn21121;

public class BoxingCoach implements Coach {

    private FortuneService fortuneService;

    public BoxingCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Throw a Thousand Jabs and a Thousand hooks";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
