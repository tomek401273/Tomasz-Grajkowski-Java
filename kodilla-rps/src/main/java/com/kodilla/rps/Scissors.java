package com.kodilla.rps;

public class Scissors implements Data{
    private int value = 2;
    private String name = "scissors";
    private String isWeekerthan = "rock";
    private String isStrongerthan = "paper";

    private int isWeekerThan = 1;
    private int isStrongerThan = 3;

    public Scissors() {
    }

    @Override
    public String getIsWeekerthan() {
        return isWeekerthan;
    }

    @Override
    public int getIsStrongerThan() {
        return isStrongerThan;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public String getIsStrongerthan() {
        return isStrongerthan;
    }

    @Override
    public int getIsWeekerThan() {
        return isWeekerThan;
    }

    @Override
    public String getName() {
        return name;
    }


}
