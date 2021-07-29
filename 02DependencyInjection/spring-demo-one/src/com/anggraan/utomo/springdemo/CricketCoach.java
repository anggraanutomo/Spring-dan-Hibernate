package com.anggraan.utomo.springdemo;

public class CricketCoach implements Coach
{
    private FortuneService fortuneService;

    // add new fields for emailAddress and team
    private String emailAddress;
    private String team;

    public FortuneService getFortuneService()
    {
        return fortuneService;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress)
    {
        System.out.println("CricketCouch: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam()
    {
        return team;
    }

    public void setTeam(String team)
    {
        System.out.println("CricketCouch: inside setter method - setTeam");
        this.team = team;
    }

    public void CricketCoach()
    {
        System.out.println("CricketCoach: inside no-args constructor");
    }

    public void setFortuneService(FortuneService fortuneService)
    {
        System.out.println("CricketCouch: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout()
    {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }
}
