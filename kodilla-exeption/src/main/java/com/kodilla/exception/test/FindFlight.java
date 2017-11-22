package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    public void findFlight(Flight flight) throws RouteNotFoundException {


        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Warsaw", true);
        flightMap.put("Berlin", true);
        flightMap.put("Tokio",true);
        flightMap.put("NewYork",true);
        String ArrivalAirport = flight.getArrivalAirport();
        String DepartamentAirPort=flight.getDepartureAirport();

        boolean containsArivalAirport =flightMap.containsKey(ArrivalAirport);
        boolean containsDepartamentAirport = flightMap.containsKey(DepartamentAirPort);

        if (containsArivalAirport==false || containsDepartamentAirport == false){
             throw new RouteNotFoundException();
        }
        else {
            System.out.println("Airport is found in database");
            System.out.println("You can flight in this airport");
        }


    }
}
