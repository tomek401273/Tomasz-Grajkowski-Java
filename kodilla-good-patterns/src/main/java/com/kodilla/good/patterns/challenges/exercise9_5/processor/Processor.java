package com.kodilla.good.patterns.challenges.exercise9_5.processor;

import com.kodilla.good.patterns.challenges.exercise9_5.data.Flight;
import com.kodilla.good.patterns.challenges.exercise9_5.data.FlightDto;
import com.kodilla.good.patterns.challenges.exercise9_5.data.FlightRepository;
import com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.AvaiableFlight;
import com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.InformationService;
import com.kodilla.good.patterns.challenges.exercise9_5.orderFlight.OrderFlight;

import java.util.Optional;

public class Processor {
    private AvaiableFlight avaiableFlight;
    private InformationService informationService;
    private OrderFlight orderFlight;

    public Processor(final AvaiableFlight avaiableFlight,
                     final InformationService informationService,
                     final OrderFlight orderFlight) {
        this.avaiableFlight = avaiableFlight;
        this.informationService = informationService;
        this.orderFlight = orderFlight;
    }

    public FlightDto process (FlightRepository flightRepository) {
        Flight flight = avaiableFlight.checkAvaiable(flightRepository.flightList());
        Flight flightNull = new Flight();
        try{
            if (!flight.equals(flightNull)) {
                boolean isOrdered = orderFlight.order(flight);
                if (isOrdered) {
                    informationService.info();
                }
            }

        } catch (NullPointerException e){
            System.out.println("We do not have available flight with this paramethers");
        }

        return null;
    }
}
