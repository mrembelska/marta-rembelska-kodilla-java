package com.kodilla.exception.main;

import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.RouteNotFoundException;

import java.io.File;
import java.util.HashMap;

public class FlightRunner {

    private static HashMap<String, Boolean> newFlight = new HashMap<>();

    public boolean findFlight (Flight flight) throws RouteNotFoundException {
        newFlight.put("New York - Tokyo", true);
        newFlight.put("Warsaw - Paris", true);

        if (newFlight.containsKey(flight.getDepartureAirport()+"-"+flight.getArrivalAirport())) {
            System.out.println("Flight was foud!");
            return newFlight.get(flight.getDepartureAirport() + "-" + flight.getArrivalAirport());

        }else{
            throw new RouteNotFoundException("Flight not found!");
        }

    }
}

