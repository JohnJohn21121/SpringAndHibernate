package com.JohnJohn21121;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {

        //Read Spring Config File
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        //Get the Bean From Bean Container
        Coach theCoach = context.getBean("karateCoach",Coach.class);

        //Call a method on the bean
        System.out.println(theCoach.getDailyFortune());
        System.out.println("\r"+ theCoach.getDailyWorkOut());

        //close the context
        context.close();
    }
}
