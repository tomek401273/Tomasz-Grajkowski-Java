package com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.Flight_Gdańsk_Wrocław_with_transit;

import com.kodilla.good.patterns.challenges.exercise9_5.data.Flight;
import com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.OrderFlight;

public class Order_Wrocław_Gdańsk implements OrderFlight {
    @Override
    public boolean order(Flight orderFlight) {
        System.out.println("Checking availability of seats for first fligt..................");
        System.out.println("Seats are avaiable order is posible");
        System.out.println("Order seats was finish succesfully");
        return true;
    }
}
