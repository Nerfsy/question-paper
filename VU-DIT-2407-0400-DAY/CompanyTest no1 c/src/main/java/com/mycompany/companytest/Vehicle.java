package com.mycompany.companytest;

public class Vehicle {
    private String type;
    private int seats;
    private boolean available = true;

    public Vehicle(String type, int seats) {
        this.type = type;
        this.seats = seats;
    }

    public boolean isAvailable() {
        return available;
    }

    public void assignPassenger(Passenger p) {
        this.available = false;
    }
}
