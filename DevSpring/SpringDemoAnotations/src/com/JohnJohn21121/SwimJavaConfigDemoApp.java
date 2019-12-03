package com.JohnJohn21121;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {

        //Read Spring Config File
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        //Get the Bean From Bean Container
        Coach theCoach = context.getBean("swimCoach",Coach.class);

        //Call a method on the bean
        System.out.println(theCoach.getDailyFortune()+"\r");
        System.out.println("\n"+ theCoach.getDailyWorkOut());

        //close the context
        context.close();
    }
}
