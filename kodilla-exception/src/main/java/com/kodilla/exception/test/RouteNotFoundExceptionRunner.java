package com.kodilla.exception.test;

import com.kodilla.exception.main.FlightRunner;

public class RouteNotFoundExceptionRunner {

    public static void main(String[] args) throws RouteNotFoundException {
        Flight flight1 = new Flight("Paris", "Warsaw");
        Flight flight2 = new Flight("London", "Warsaw");

        FlightRunner flightRunner = new FlightRunner();

        try {
            flightRunner.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("Flight not found but my proggram slill running very well");

        }
        System.out.println("Now, try flight");
    }
}
