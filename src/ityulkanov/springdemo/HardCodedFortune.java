package ityulkanov.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class HardCodedFortune implements FortuneService {
    @Value("${foo.fortune}")
    private String fortune;
    @Override
    public String getFortune() {
        return fortune;
    }
}
