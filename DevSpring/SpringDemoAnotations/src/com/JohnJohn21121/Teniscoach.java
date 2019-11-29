package com.JohnJohn21121;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
@Scope
public class Teniscoach implements Coach {

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkOut() {
        return "Practice Your BackHand Volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }

    //add init method
    //@PostConstruct
    public void doMyStartUpStuff(){
        System.out.println("Inside init method for Tennis Coach");
    }
    //add destroy method
    //@PreDestroy
    public void doMyCleanUpStuff(){
        System.out.println("Inside Destroy method for tennis Coach");
    }

}
