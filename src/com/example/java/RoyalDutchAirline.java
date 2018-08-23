package com.example.java;

public class RoyalDutchAirline implements Flight {

    private FlightService flightService;

    public RoyalDutchAirline(FlightService theFlightService) {
        flightService = theFlightService;
    }

    public RoyalDutchAirline(){

    }

    @Override
    public String getDailyFlight() {
        return "\nFly approx 24h from the Netherlands to Suriname";
    }

    @Override
    public String getDailyFortune() {
        return "RoyalDutchAirline: " + flightService.getDailyFlight();
    }
}