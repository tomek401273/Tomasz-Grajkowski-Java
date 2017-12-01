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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        if (startCity != null ? !startCity.equals(flight.startCity) : flight.startCity != null) return false;
        if (finishCity != null ? !finishCity.equals(flight.finishCity) : flight.finishCity != null) return false;
        return transitCity != null ? transitCity.equals(flight.transitCity) : flight.transitCity == null;
    }

    @Override
    public int hashCode() {
        int result = startCity != null ? startCity.hashCode() : 0;
        result = 31 * result + (finishCity != null ? finishCity.hashCode() : 0);
        result = 31 * result + (transitCity != null ? transitCity.hashCode() : 0);
        return result;
    }
}
