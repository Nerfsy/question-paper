/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.no1b;

/**
 *
 * @author hamidah
 */
public class pass {
    private locate pickup;
    private locate destination;

    public pass(locate pickup, locate destination) {
        this.pickup = pickup;
        this.destination = destination;
    }

    public locate getPickup() {
        return pickup;
    }

    public locate getDestination() {
        return destination;
    }
}
