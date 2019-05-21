package ityulkanov.springdemo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class BasketBallCoach implements Coach {

    private FortuneService fortuneService;
    @Value("${foo.timesHit}")
    private String timesHit;

    @Value("${foo.name}")
    private String name;

    public BasketBallCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;

    }
    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meter as a warmup";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
