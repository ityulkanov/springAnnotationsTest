package ityulkanov.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig {

    // define bean for sad fortune service
    @Bean
    public FortuneService hardCodedFortune() {
        return new HardCodedFortune();
    }

    // define the bean for your swim coach and injec dependency
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(hardCodedFortune());
    }
    @Bean
    public Coach basketBallCoach(){
        return new BasketBallCoach(hardCodedFortune());
    }
}
