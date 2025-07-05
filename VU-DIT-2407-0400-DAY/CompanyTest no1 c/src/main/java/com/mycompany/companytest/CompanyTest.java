package com.mycompany.companytest;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CompanyTest {
    private Company company;
    private PassengerSource source;

    @Before
    public void setup() {
        company = new Company();
        company.addVehicle(new Vehicle("Taxi", 4)); // One available vehicle
        source = new PassengerSource(company);
    }

    @Test
    public void testSuccessfulPickupFromPassengerSource() {
        assertTrue("Expected successful pickup from PassengerSource", source.requestPickup());
    }

    @Test
    public void testPickupFailsWhenNoVehicleAvailable() {
        source.requestPickup(); // First passenger takes the vehicle
        assertFalse("Expected failure due to no available vehicles", source.requestPickup());
    }
}
