package com.JohnJohn21121;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class Teniscoach implements Coach {

    @Override
    public String getDailyWorkOut() {
        return "Practice Your BackHand Volley";
    }
}
