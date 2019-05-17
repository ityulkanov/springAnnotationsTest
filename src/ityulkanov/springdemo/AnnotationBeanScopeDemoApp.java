package ityulkanov.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        // load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
        boolean result = (theCoach == alphaCoach);
        // print out the result
        System.out.println("\n Pointing to the same object " + result);
        System.out.println("\n Memory location for the coach " + theCoach);
        System.out.println("\n Memory location for the alpha" + alphaCoach);
        context.close();
    }
}
