/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.no1b;

/**
 *
 * @author hamidah
 */
public class cardata {
    private boolean available = true;

    public boolean isAvailable() {
        return available;
    }

    public void assignPassenger(pass p) {
        this.available = false;
        System.out.println("Passenger assigned from (" +
            p.getPickup().getX() + "," + p.getPickup().getY() + ") to (" +
            p.getDestination().getX() + "," + p.getDestination().getY() + ")");
    }
}

