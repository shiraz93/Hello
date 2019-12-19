package com.company;

import com.company.fuel.Diesel;
import com.company.transmission.RobotTransmission;

public class Truck extends Car {
    /**
     * Create constructor.
     */
    public Truck() {
        transmission = new RobotTransmission();
        fuel = new Diesel();
    }

    /**
     * Print vehicle type.
     */
    @Override
    public void display() {
        System.out.println(" vehicle type is: Truck");
    }
}
