package ityulkanov.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from the spring container
        BasketBallCoach getCoach = context.getBean("basketBallCoach", BasketBallCoach.class);

        // call method on a bean
        // Call new swimcoach methods
        System.out.println("Times ball is hit " + getCoach.getTimesHit());
        System.out.println("Team name is " + getCoach.getName());
        System.out.println(getCoach.getDailyFortune());
        System.out.println(getCoach.getDailyWorkout());

    }

}
