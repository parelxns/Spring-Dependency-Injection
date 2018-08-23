package com.example.java;

public class Main {

    public static void main(String[] args) {

        // create the object
        Flight theFlight = new RoyalDutchAirline();

        // use the object
        System.out.println(theFlight.getDailyFlight());
    }
}
