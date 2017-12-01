package com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.Flight_Gdańsk_Wrocław;

import com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.InformationService;

public class Info_Gdańsk_Wrocław implements InformationService{
    @Override
    public void info() {
        System.out.println("Sending email: 'We confirm your successful oredr for flight from Gdańsk to Wrocław'");
    }
}
