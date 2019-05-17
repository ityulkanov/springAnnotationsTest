package ityulkanov.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {
    // create an array fo strings
    private String[] data = {
            "Beware of the wolf in sheep, clothes",
            "Dilligence is the mother of good luck",
            "the journly is the reward"
    };
    // crate a random number generator
    private Random myRandom = new Random();
    @Override
    public String getFortune() {
        // pick a random string from the array
        int index = myRandom.nextInt(data.length);
        String theFortune = data[index];

        return theFortune;
    }
}
