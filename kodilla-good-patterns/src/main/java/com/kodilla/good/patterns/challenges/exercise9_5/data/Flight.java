package com.kodilla.good.patterns.challenges.exercise9_5.data;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    private String startCity;
    private String finishCity;
    private List<String> transitCity = new ArrayList<>();

    public Flight(String startCity, String finishCity, List<String> transitCity) {
        this.startCity = startCity;
        this.finishCity = finishCity;
        this.transitCity = transitCity;
    }

    public Flight() {

    }

    public String getStartCity() {
        return startCity;
    }

    public String getFinishCity() {
        return finishCity;
    }

    public List<String> getTransitCity() {
        return transitCity;
    }
}
