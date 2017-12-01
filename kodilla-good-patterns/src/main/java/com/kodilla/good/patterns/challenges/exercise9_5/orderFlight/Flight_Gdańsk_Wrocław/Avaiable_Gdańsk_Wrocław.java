package com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.Flight_Gdańsk_Wrocław;

import com.kodilla.good.patterns.challenges.exercise9_5.data.Flight;
import com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.AvaiableFlight;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Avaiable_Gdańsk_Wrocław implements AvaiableFlight {

    @Override
    public Flight checkAvaiable(List<Flight> flightList) {
        System.out.println("Checking avialable flight from city: Gdańsk");
        flightList.stream()
                .filter(x ->x.getStartCity().equals("Gdańsk"))
                .map(y ->y.getStartCity()+y.getTransitCity()+y.getFinishCity())
                .forEach(System.out::println);

        List<Flight> flightList2 = flightList.stream()
                .filter(x ->x.getStartCity().equals("Gdańsk"))
                .collect(Collectors.toList());

        if(!flightList2.isEmpty()) {
            return flightList2.get(0);
        }

        return null;
    }
}
