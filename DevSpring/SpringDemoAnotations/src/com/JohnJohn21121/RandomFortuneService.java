package com.JohnJohn21121;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] data = {
      "You cannot foretell the consequences of your actions.",
            "Diligence is the Mother of good luck.",
            "The thousand miles Road is Fulfilled step by step."
    };

    private Random randomNumber = new Random();

    @Override
    public String getDailyFortune() {

        int index = randomNumber.nextInt(data.length);

        String theRandomFortune = data[index];

        return theRandomFortune;
    }

}
