package com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.Flight_Gdańsk_Wrocław;

import com.kodilla.good.patterns.challenges.exercise9_5.data.Flight;
import com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.OrderFlight;

import java.util.Optional;

public class Order_Gdańsk_Wrocław implements OrderFlight {

    @Override
    public boolean order(Optional<Flight> orderFlight) {
        System.out.println("Checking availability of seats for first flight..................");
        System.out.println("Seats are avaiable order is posible");
        System.out.println("Order seats was finish succesfully");
        return true;
    }
}
