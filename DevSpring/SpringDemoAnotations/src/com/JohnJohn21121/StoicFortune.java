package com.JohnJohn21121;

import org.springframework.stereotype.Component;

@Component
public class StoicFortune implements FortuneService {

    @Override
    public String getDailyFortune() {
        return "Try to have a lot of virtues.";
    }
}

