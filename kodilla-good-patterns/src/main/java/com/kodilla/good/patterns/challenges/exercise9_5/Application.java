package com.kodilla.good.patterns.challenges.exercise9_5;

import com.kodilla.good.patterns.challenges.exercise9_5.data.FlightRepository;
import com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.Flight_Gdańsk_Wrocław.Avaiable_Gdańsk_Wrocław;
import com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.Flight_Gdańsk_Wrocław.Info_Gdańsk_Wrocław;
import com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.Flight_Gdańsk_Wrocław.Order_Gdańsk_Wrocław;
import com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.Flight_Gdańsk_Wrocław_with_transit.Avaiable_Wrocław_Gdańsk;
import com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.Flight_Gdańsk_Wrocław_with_transit.Info_Wrocław_Gdańsk;
import com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.Flight_Wrocław_Gdańsk.Flight_Gdańsk_Wrocław_transit.Aviable_Flight_transit;
import com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.Flight_Wrocław_Gdańsk.Flight_Gdańsk_Wrocław_transit.Info_Flight_transit;
import com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.Flight_Wrocław_Gdańsk.Flight_Gdańsk_Wrocław_transit.Order_Flight_transit;
import com.kodilla.good.patterns.challenges.exercise9_5.processor.Processor;

public class Application {
    public static void main(String[] args) {
        FlightRepository flightRepository = new FlightRepository();

        Processor processor = new Processor(new Avaiable_Gdańsk_Wrocław(),new Info_Gdańsk_Wrocław(),new Order_Gdańsk_Wrocław());
        processor.process(flightRepository);
        System.out.println();

        Processor processor2 = new Processor(new Avaiable_Wrocław_Gdańsk(),new Info_Wrocław_Gdańsk(), new Order_Gdańsk_Wrocław());
        processor2.process(flightRepository);
        System.out.println();

        Processor processor3 = new Processor(new Aviable_Flight_transit(), new Info_Flight_transit(), new Order_Flight_transit());
        processor3.process(flightRepository);
    }
}
