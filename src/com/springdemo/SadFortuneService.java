package com.springdemo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SadFortuneService implements FortuneService{

    private List<String> sadFortunesList = new ArrayList<String>(Arrays.asList(
            "Today is your bad day!","Today is your worse day!!","Today is your worst day ever!!!"));

    @Override
    public String getFortune() {
//        Random randomFortuneIndex = new Random();
        return sadFortunesList.get((new Random()).nextInt(3));
    }
}
