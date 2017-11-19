package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;

public class Paper implements Data {
    private int value = 3;
    private String name = "paper";
    private String isWeekerthan = "scissors";
    private String isStrongerthan = "rock";

    private int isWeekerThan = 2;
    private int isStrongerThan = 1;

    private List<Integer> isWeekerThanList = new ArrayList<>();
    private List<Integer> isStrongerThanList = new ArrayList<>();

    public Paper() {
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
