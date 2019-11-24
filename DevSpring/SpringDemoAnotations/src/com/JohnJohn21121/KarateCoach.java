package com.JohnJohn21121;

import org.springframework.stereotype.Component;

@Component
public class KarateCoach implements Coach {
    @Override
    public String getDailyWorkOut() {
        return "Practice the Water Kata.";
    }
}
