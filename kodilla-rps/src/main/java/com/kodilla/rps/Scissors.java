package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;

public class Scissors implements Data{
    private int value = 2;
    private String name = "scissors";
    private String isWeekerthan = "rock";
    private String isStrongerthan = "paper";

    private int isWeekerThan = 1;
    private int isStrongerThan = 3;

    private List<Integer> isWeekerThanList = new ArrayList<>();
    private List<Integer> isStrongerThanList = new ArrayList<>();

    public Scissors() {
        this.isWeekerThanList.add(isWeekerThan);
        this.isStrongerThanList.add(isStrongerThan);
    }

    @Override
    public String getIsWeekerthan() {
        return isWeekerthan;
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
    public String getName() {
        return name;
    }

    @Override
    public List<Integer> getIsStrongerThan() {
        return isStrongerThanList;
    }

    @Override
    public List<Integer> getIsWeekerThan() {
        return isWeekerThanList;
    }

}
