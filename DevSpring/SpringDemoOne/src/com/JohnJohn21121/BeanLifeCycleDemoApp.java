package com.JohnJohn21121;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

    public static void main(String[] args) {

    //load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("BeanLifeCycleApplicationContext.xml");

    //retrieve bean from spring container

        Coach theCoach = context.getBean("boxingCoach",Coach.class);

    //Check if they are the same bean

        System.out.println(theCoach.getDailyWorkout());

    // Close the context
        context.close();
    }
}
