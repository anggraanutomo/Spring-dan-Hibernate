package com.anggraan.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDiDemoApp
{
    public static void main(String[] args)
    {
        // read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from the container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
