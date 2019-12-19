package com.company;

import com.company.fuel.Petrol;
import com.company.transmission.ManualTransmission;

public class Sedan extends Car {
    /**
     * Create constructor.
     */
    public Sedan() {
        transmission = new ManualTransmission();
        fuel = new Petrol();
    }

    /**
     * Print vehicle type.
     */
    @Override
    public void display() {
        System.out.println(" vehicle type is: Sedan");
    }
}
