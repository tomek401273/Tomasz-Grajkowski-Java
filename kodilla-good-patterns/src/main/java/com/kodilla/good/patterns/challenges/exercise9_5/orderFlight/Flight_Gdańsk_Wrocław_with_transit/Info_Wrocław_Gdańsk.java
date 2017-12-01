package com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.Flight_Gdańsk_Wrocław_with_transit;

import com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.InformationService;

public class Info_Wrocław_Gdańsk implements InformationService {
    @Override
    public void info() {
        System.out.println("Sending email: 'We confirm your successful order to city Wrocław from Gdańsk");
    }
}
