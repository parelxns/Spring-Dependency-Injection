package com.example.java;

public class SurinamAirways implements Flight{

    // add private field for the dependency
    private FlightService flightService;

    // a constructor for dpi
    public SurinamAirways(FlightService theFlightService) {
        flightService = theFlightService;
    }

    @Override
    public String getDailyFlight() {
        return "\nFly approx 24h from Suriname to the Netherlands";
    }

    @Override
    public String getDailyFortune() {
        return "SurinamAirways: " + flightService.getDailyFlight();
    }
}