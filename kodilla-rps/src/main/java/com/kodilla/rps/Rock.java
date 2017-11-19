package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;

public class Rock implements Data {

    private String name = "rock";
    private String isWeekerthan = "paper";
    private String isStrongerthan = "scissors";

    private int value = 1;
    private int isWeekerThan = 3;
    private int isStrongerThan = 2;
    private List<Integer> isWeekerThanList = new ArrayList<>();
    private List<Integer> isStrongerThanList = new ArrayList<>();

    public Rock() {
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
