package com.kodilla.good.patterns.challenges.exercise9_5.orderFlight;

import com.kodilla.good.patterns.challenges.exercise9_5.data.Flight;

import java.util.Optional;

public interface OrderFlight {
    boolean order (Optional<Flight> orderFlight);
}
