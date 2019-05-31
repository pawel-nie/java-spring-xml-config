package com.springdemo;

public class GolfCoach implements Coach{

    private FortuneService fortuneService;
    private String team;
    private String emailAddress;

    public GolfCoach () {
        System.out.println("GolfCoach: inside no-arg constructor");
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String getDailyWorkout() {
        return "Do the swinging";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
