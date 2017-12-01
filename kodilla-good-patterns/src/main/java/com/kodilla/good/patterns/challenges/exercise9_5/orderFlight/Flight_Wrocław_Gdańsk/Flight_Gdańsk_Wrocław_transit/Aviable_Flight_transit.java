package com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.Flight_Wrocław_Gdańsk.Flight_Gdańsk_Wrocław_transit;

import com.kodilla.good.patterns.challenges.exercise9_5.data.Flight;
import com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.AvaiableFlight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aviable_Flight_transit implements AvaiableFlight {
//    private String startCity = "Gdańsk";
//    private String finishCity = "Wrocław";
//    private List<String> transitCity = new ArrayList<>();

    @Override
    public Flight data() {
        String startCity = "Gdańsk";
        String finishCity = "Wrocław";
        List<String> transitCity = new ArrayList<>();
        return new Flight(startCity, finishCity, transitCity);
    }
}
