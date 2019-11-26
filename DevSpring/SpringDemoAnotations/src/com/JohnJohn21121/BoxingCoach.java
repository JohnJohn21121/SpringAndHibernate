package com.JohnJohn21121;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BoxingCoach implements Coach{

    @Autowired
    @Qualifier("stoicFortune")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkOut() {
        return "Throw a thousand Jabs";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }

}
