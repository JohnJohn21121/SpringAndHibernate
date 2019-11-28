package com.JohnJohn21121;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {

        //load the config file

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve the bean from the spring container

        Coach theCoach = context.getBean("thatSillyCoach",Coach.class);

        Coach alphaCoach = context.getBean("thatSillyCoach",Coach.class);

        //Check if they are the same

        boolean result = (theCoach == alphaCoach);

        System.out.println(result);

        System.out.println("\nMemory location for theCoach: " + theCoach);

        System.out.println("\nMemory location for alphaCoach: " + alphaCoach);

        context.close();

    }
}
