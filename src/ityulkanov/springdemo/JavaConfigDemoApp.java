package ityulkanov.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {
//        read config file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
//        get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
//        call the method on a bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
//        close the context
        context.close();
    }
}
