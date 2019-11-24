package com.JohnJohn21121;

import org.springframework.stereotype.Component;

@Component
public class BoxingCoach implements Coach{

    @Override
    public String getDailyWorkOut() {
        return "Throw a thousand Jabs";
    }
}
