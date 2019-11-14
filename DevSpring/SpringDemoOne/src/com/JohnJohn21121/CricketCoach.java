package com.JohnJohn21121;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    //create no arg constructor

    //add email addres and team

    private String emailAddress;
    private String team;

    public CricketCoach() {
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
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
