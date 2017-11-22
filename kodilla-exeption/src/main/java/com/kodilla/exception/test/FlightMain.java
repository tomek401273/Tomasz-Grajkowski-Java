package com.kodilla.exception.test;

public class FlightMain {

    public static void main(String[] args) {
        Flight flight1 = new Flight("Berlin", "Warsaw");
        Flight flight2 = new Flight("Warsaw", "Moscow");

        FindFlight findFlight = new FindFlight();


        try {
            findFlight.findFlight(flight1);
        } catch (RouteNotFoundException e) {

            System.out.println("You can not flight in this airport");
            System.out.println("Error Error: " + e);
        }
        System.out.println();

        try {
            findFlight.findFlight(flight2);
        } catch (RouteNotFoundException e) {

            System.out.println("You can not flight in this airport");
            System.out.println("Error Error: " + e);
        }


    }


}
