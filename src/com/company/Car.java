package com.company;

import com.company.fuel.Fuel;
import com.company.transmission.Transmission;

public abstract class Car {
    Fuel fuel;
    Transmission transmission;

    /**
     * Print type transmission.
     */
    public void typeTransmission() {
        transmission.transmissionType();
    }

    /**
     * Print type fuel.
     */
    public void typeFuel() {
        fuel.fuelType();
    }

    /**
     * Print vehicle type.
     */
    public abstract void display();
}
