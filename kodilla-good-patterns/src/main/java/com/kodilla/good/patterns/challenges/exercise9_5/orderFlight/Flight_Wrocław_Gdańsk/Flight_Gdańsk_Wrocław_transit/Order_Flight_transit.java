package com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.Flight_Wrocław_Gdańsk.Flight_Gdańsk_Wrocław_transit;

import com.kodilla.good.patterns.challenges.exercise9_5.data.Flight;
import com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.OrderFlight;

public class Order_Flight_transit implements OrderFlight{

    @Override
    public boolean order(Flight orderFlight) {
        System.out.println("Checking availability of seats for first flight..................");
        System.out.println("Seats are avaiable order is posible");
        System.out.println("Order seats was finish succesfully");
        return true;
    }
}
