package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

public class SetterDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());


        System.out.println("---------------------");

        GolfCoach theGolfCoach = context.getBean("myGolfCoach",GolfCoach.class);
        GolfCoach theSecondGolfCoach = context.getBean("myGolfCoach",GolfCoach.class);

        System.out.println(theGolfCoach + " n " + theSecondGolfCoach);
        System.out.println(theGolfCoach.getDailyWorkout());
        System.out.println(theGolfCoach.getDailyFortune());
        System.out.println(theGolfCoach.getEmailAddress());
        System.out.println(theGolfCoach.getTeam());
        context.close();

    }
}
