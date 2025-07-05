/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.no1b;

/**
 *
 * @author haamidah
 */
import java.util.ArrayList;
import java.util.List;

public class comp {
    private List<cardata> vehicles = new ArrayList<>();

    public void addVehicle(cardata v) {
        vehicles.add(v);
    }

    public boolean scheduleVehicle(pass p) {
        for (cardata v : vehicles) {
            if (v.isAvailable()) {
                v.assignPassenger(p);
                return true;
            }
        }
        return false; // No available vehicle
    }

    void adVehicle(cardata cardata) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}



