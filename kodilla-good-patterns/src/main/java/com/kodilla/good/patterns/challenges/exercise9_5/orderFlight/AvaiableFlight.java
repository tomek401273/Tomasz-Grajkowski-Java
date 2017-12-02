package com.kodilla.good.patterns.challenges.exercise9_5.orderFlight;

import com.kodilla.good.patterns.challenges.exercise9_5.data.Flight;

import java.util.List;
import java.util.Optional;

public interface AvaiableFlight {
    Flight data();

    default public Optional<Flight> checkAvaiable(List<Flight> flightList) {
        data();
        System.out.print("Checking avialable flight from " + data().getStartCity() + " to " + data().getFinishCity() + " ");

        if (!data().getTransitCity().isEmpty()) {
            System.out.print("with transit");
        }
        System.out.println();

        flightList.stream()
                .filter(x -> x.equals(data()))
                .map(y -> y.getStartCity() + y.getTransitCity() + y.getFinishCity())
                .forEach(System.out::println);

        Optional<Flight> flight = Optional.of(new Flight());
        flight = flightList.stream()
                .filter(x -> x.equals(data()))
                .findFirst();

        return flight;
    }
}
