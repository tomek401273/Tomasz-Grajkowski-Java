package com.kodilla.good.patterns.challenges.exercise9_5.data;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public Flight retrive1() {
        List<String> severalTransitcity = new ArrayList<>();
        severalTransitcity.add("Toruń");
        severalTransitcity.add("Warszawa");
        Flight flight1 = new Flight("Gdańsk", "Wrocław", severalTransitcity);
        return flight1;
    }

    public Flight retrive2() {
        List<String> severalTransitcity = new ArrayList<>();
        Flight flight1 = new Flight("Gdańsk", "Wrocław", severalTransitcity);
        return flight1;
    }

    public Flight retrive3() {
        List<String> severalTransitcity = new ArrayList<>();
        severalTransitcity.add("Sczecin");
        severalTransitcity.add("Tarnobrzeg");
        Flight flight1 = new Flight("Wrocław", "Gdańsk", severalTransitcity);
        return flight1;
    }

    public List<Flight> flightList (){
        List<Flight> flightList = new ArrayList<>();
        flightList.add(retrive1());
        flightList.add(retrive2());
        flightList.add(retrive3());
        return flightList;
    }
}
