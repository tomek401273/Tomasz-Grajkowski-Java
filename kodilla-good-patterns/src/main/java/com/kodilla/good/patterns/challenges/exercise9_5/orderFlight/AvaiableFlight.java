package com.kodilla.good.patterns.challenges.exercise9_5.orderFlight;

import com.kodilla.good.patterns.challenges.exercise9_5.data.Flight;

import java.util.List;

public interface AvaiableFlight {
    Flight checkAvaiable(List<Flight> flightList);
}
