/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.no1b;

/**
 *
 * @author hamidah
 */
public class Main {
    public static void main(String[] args) {
        comp company = new comp();
        company.addVehicle(new cardata()); // Add one vehicle

        PassSource source = new PassSource(company);
        boolean success = source.requestPickup();

        System.out.println("Pickup scheduled: " + success);
    }
}

