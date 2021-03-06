package ityulkanov.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
//        read config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
//        call the method on a bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
//        close the context
        context.close();
    }
}
