package com.company;

import com.company.fuel.Diesel;
import com.company.transmission.AutomatTransmission;

public class Pickup extends Car {
    /**
     * Create constructor.
     */
    public Pickup() {
        transmission = new AutomatTransmission();
        fuel = new Diesel();
    }

    /**
     * Print vehicle type.
     */
    @Override
    public void display() {
        System.out.println(" vehicle type is: Pickup");
    }
}
