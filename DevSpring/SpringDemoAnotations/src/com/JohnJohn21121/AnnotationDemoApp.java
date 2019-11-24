package com.JohnJohn21121;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

    //read the spring config file

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

    //get bean from spring container

        Coach theCoach = context.getBean("thatSillyCoach", Coach.class);

    //call method on a bean

        System.out.println(theCoach.getDailyWorkOut());

    //close context

        context.close();
    }
}
