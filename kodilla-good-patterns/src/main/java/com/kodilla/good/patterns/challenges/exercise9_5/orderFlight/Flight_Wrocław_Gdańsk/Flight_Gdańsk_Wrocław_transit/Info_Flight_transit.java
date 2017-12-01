package com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.Flight_Wrocław_Gdańsk.Flight_Gdańsk_Wrocław_transit;

import com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.InformationService;

public class Info_Flight_transit implements InformationService {
    @Override
    public void info() {
        System.out.println("Sending email: 'We confirm your successful oredr for flight from Gdańsk to Wrocław with transit'");
    }
}
