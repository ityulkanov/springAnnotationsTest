package ityulkanov.springdemo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Data
@Component
public class TennisCoach implements Coach {
    private  FortuneService fortuneService;
  /*  @Autowired
    public TennisCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }*/

    @Autowired
    public void setFortuneService (FortuneService fortuneService) {
        System.out.println("Inside setter injection");
        this.fortuneService = fortuneService;
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
