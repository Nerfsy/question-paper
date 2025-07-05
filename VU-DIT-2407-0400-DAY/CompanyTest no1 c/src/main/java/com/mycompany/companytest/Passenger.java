package com.mycompany.companytest;

public class Passenger {
    private Location pickup, destination;

    public Passenger(Location pickup, Location destination) {
        this.pickup = pickup;
        this.destination = destination;
    }

    public Location getPickup() { return pickup; }
    public Location getDestination() { return destination; }
}
