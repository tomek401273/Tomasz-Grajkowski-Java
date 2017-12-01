package com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.Flight_Gdańsk_Wrocław_with_transit;

import com.kodilla.good.patterns.challenges.exercise9_5.data.Flight;
import com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.AvaiableFlight;

import java.util.List;
import java.util.stream.Collectors;

public class Avaiable_Wrocław_Gdańsk implements AvaiableFlight{

    @Override
    public Flight checkAvaiable(List<Flight> flightList) {

        System.out.println("Checking avialable flight to city: Wrocław");
        flightList.stream()
                .filter(x ->x.getStartCity().equals("Wrocław"))
                .map(y ->y.getStartCity()+y.getTransitCity()+y.getFinishCity())
                .forEach(System.out::println);

        List<Flight> flightList1 = flightList.stream()
                .filter(x ->x.getFinishCity().equals("Wrocław"))
                .collect(Collectors.toList());

        if(!flightList1.isEmpty()) {
            return flightList1.get(0);
        }


        return null;
    }
}
