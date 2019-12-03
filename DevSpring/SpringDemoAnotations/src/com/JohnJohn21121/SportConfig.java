package com.JohnJohn21121;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.JohnJohn21121")
public class SportConfig {

    //Define bean for Sad Fortune Service

    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    //Define a bean for Swim Coach and inject dependencies for Swim Coach
    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }
}
