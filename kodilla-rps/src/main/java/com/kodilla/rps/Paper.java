package com.kodilla.rps;

public class Paper implements Data{
    private int value = 3;
    private String name = "paper";
    private String isWeekerthan ="scissors";
    private String isStrongerthan="rock";

    private int isWeekerThan =2;
    private int isStrongerThan =1;


    public Paper() {
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
