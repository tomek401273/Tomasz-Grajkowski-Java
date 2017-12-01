package com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.Flight_Gdańsk_Wrocław;

import com.kodilla.good.patterns.challenges.exercise9_5.data.Flight;
import com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.AvaiableFlight;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Avaiable_Gdańsk_Wrocław implements AvaiableFlight {

    @Override
    public Flight data() {
        String startCity = "Gdańsk";
        String finishCity = "Wrocław";
        List<String> transitCity = new ArrayList<>();
        transitCity.add("Toruń");
        transitCity.add("Warszawa");
        return new Flight(startCity, finishCity, transitCity);
    }
}
