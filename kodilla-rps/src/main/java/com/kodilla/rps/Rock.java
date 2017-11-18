package com.kodilla.rps;

public class Rock implements Data {

    private String name= "rock";
    private String isWeekerthan ="paper";
    private String isStrongerthan="scissors";

    private int value = 1;
    private int isWeekerThan=3;
    private int isStrongerThan= 2;

    public Rock() {
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
