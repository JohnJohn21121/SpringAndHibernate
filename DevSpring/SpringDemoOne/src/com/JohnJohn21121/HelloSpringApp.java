package com.JohnJohn21121;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {

        //load the spring configuration file

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve a bean from spring container

        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach theBoxCoach = context.getBean("boxingCoach", Coach.class);

        // call methods on the bean

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theBoxCoach.getDailyWorkout());

        //close the context
        context.close();
    }
}
