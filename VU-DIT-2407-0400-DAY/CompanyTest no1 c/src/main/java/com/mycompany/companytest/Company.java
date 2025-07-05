package com.mycompany.companytest;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    public boolean scheduleVehicle(Passenger p) {
        for (Vehicle v : vehicles) {
            if (v.isAvailable()) {
                v.assignPassenger(p);
                return true;
            }
        }
        return false;
    }
}
