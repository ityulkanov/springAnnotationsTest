package ityulkanov.springdemo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
@Data
public class SwimCoach implements Coach {

    private FortuneService fortuneService;
    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    public SwimCoach(FortuneService theFortuneService) {
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
