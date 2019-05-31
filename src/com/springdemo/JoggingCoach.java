package com.springdemo;

public class JoggingCoach implements Coach{

    public String getDailyWorkout(){
        return "Run like hell";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
