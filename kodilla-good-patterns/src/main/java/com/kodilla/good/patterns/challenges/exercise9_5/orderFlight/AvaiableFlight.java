package com.kodilla.good.patterns.challenges.exercise9_5.orderFlight;

import com.kodilla.good.patterns.challenges.exercise9_5.data.Flight;

import java.util.List;
import java.util.stream.Collectors;

public interface AvaiableFlight {
    Flight data();

    default public Flight checkAvaiable(List<Flight> flightList) {
        data();
        System.out.print("Checking avialable flight from " + data().getStartCity() + " to " + data().getFinishCity() + " ");

        if (!data().getTransitCity().isEmpty()) {
            System.out.print("with transit");
        }
        System.out.println();

        flightList.stream()
                .filter(x -> x.getStartCity().equals(data().getStartCity()) && x.getFinishCity().equals(data().getFinishCity()) && x.getTransitCity().equals(data().getTransitCity()))
                .map(y -> y.getStartCity() + y.getTransitCity() + y.getFinishCity())
                .forEach(System.out::println);

        List<Flight> flightList2 = flightList.stream()
                .filter(x -> x.getStartCity().equals(data().getStartCity()) && x.getFinishCity().equals(data().getFinishCity()) && x.getTransitCity().equals(data().getTransitCity()))
                .collect(Collectors.toList());

        if (!flightList2.isEmpty()) {
            return flightList2.get(0);
        }
        return null;
    }
}
