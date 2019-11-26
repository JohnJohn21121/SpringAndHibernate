package com.JohnJohn21121;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

    @Override
    public String getDailyFortune() {
        return "You Cannot foretell the consequences of your actions.";
    }

}
