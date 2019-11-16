package com.JohnJohn21121;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

    //load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

    //retrieve bean from spring container

        Coach theCoach = context.getBean("boxingCoach",Coach.class);

        Coach alphaCoach = context.getBean("boxingCoach",Coach.class);

    //Check if they are the same bean

        boolean result = (theCoach == alphaCoach);

     //print out the result
        System.out.println("\n Pointing to the same object : " +result);
        System.out.println("\n Memory location for theCoach : " + theCoach);
        System.out.println("\n Memory location for alphaCoach : " + alphaCoach+ "\n");

    // Close the context
        context.close();
    }
}
