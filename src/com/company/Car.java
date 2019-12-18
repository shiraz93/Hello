package com.company;

import com.company.fuel.Fuel;
import com.company.transmission.Transmission;

public abstract class Car {
    Fuel fuel;
    Transmission transmission;

    public Car() {
    }
    public  void typeTransmission(){
        transmission.transmission();
    }
}
