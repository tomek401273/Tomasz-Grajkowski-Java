package com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.Flight_Gdańsk_Wrocław_with_transit;

import com.kodilla.good.patterns.challenges.exercise9_5.data.Flight;
import com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.AvaiableFlight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Avaiable_Wrocław_Gdańsk implements AvaiableFlight {


    @Override
    public Flight data() {
        String startCity = "Wrocław";
        String finishCity = "Gdańsk";
        List<String> transitCity = new ArrayList<>();
        transitCity.add("Sczecin");
        transitCity.add("Tarnobrzeg");
        return new Flight(startCity, finishCity, transitCity);
    }
}
