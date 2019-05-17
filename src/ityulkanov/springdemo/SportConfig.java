package ityulkanov.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ityulkanov.springdemo")
public class SportConfig {

    // define bean for sad fortune service
    @Bean
    public FortuneService sadFurtuneService() {
        return new SadFortuneService();
    }

    // define the bean for your swim coach and injec dependency
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFurtuneService());
    }
}
