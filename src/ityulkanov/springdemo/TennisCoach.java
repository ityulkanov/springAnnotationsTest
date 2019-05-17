package ityulkanov.springdemo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Data
@Component
@Scope("prototype")
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private  FortuneService fortuneService;

    // define my init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("TEnnis coach insode of startup method");
    }
    @PreDestroy
    public  void doMyCleanupStuff(){
        System.out.println("Inside the end method");
    }

    @Autowired
    public void doSomeCrazyStuff() {
        System.out.println(" crzry stuff");
    }
    @Override
    public String getDailyWorkout() {
        return "Here is a message from Tennis Coach";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

