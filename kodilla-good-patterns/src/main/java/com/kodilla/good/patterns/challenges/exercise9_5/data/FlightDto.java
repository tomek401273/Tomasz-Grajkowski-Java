package com.kodilla.good.patterns.challenges.exercise9_5.data;

public class FlightDto {
    private Flight flight;
    private boolean isOrdered;

    public FlightDto(Flight flight, boolean isOrdered) {
        this.flight = flight;
        this.isOrdered = isOrdered;
    }

    public Flight getFlight() {
        return flight;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
