package com.JohnJohn21121;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{

    @Override
    public String getDailyFortune() {
        return "It´s your lucky Day";
    }

}
