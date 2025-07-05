/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.no1b;

/**
 *
 * @author hamidah
 */
import java.util.Random;

public class PassSource {
    private comp company;
    private Random random;

    public PassSource(comp company) {
        this.company = company;
        this.random = new Random();
    }

    public boolean requestPickup() {
        locate pickup = new locate(random.nextInt(101), random.nextInt(101));
        locate destination = new locate(random.nextInt(101), random.nextInt(101));
        pass passenger = new pass(pickup, destination);
        return company.scheduleVehicle(passenger);
    }
}