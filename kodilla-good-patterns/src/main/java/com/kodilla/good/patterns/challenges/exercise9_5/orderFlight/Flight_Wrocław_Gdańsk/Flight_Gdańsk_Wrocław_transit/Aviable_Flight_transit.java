package com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.Flight_Wrocław_Gdańsk.Flight_Gdańsk_Wrocław_transit;

import com.kodilla.good.patterns.challenges.exercise9_5.data.Flight;
import com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.AvaiableFlight;

import java.util.List;
import java.util.stream.Collectors;

public class Aviable_Flight_transit implements AvaiableFlight {
    @Override
    public Flight checkAvaiable(List<Flight> flightList) {
        System.out.println("Checking avialable flight from Gdańsk to Wrocław with transit");
        flightList.stream()
                .filter(x -> x.getStartCity().equals("Gdańsk") && x.getFinishCity().equals("Wrocław") && !x.getTransitCity().isEmpty())
                .map(y -> y.getStartCity() + y.getTransitCity() + y.getFinishCity())
                .forEach(System.out::println);

        List<Flight> flightList2 = flightList.stream()
                .filter(x -> x.getStartCity().equals("Gdańsk") && x.getFinishCity().equals("Wrocław") && !x.getTransitCity().isEmpty())
                .collect(Collectors.toList());

        if (!flightList2.isEmpty()) {
            return flightList2.get(0);
        }
        return null;
    }
}
