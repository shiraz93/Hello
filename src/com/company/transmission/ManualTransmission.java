package com.company.transmission;

public class ManualTransmission implements Transmission {
    /**
     * Print transmission type.
     */
    @Override
    public void transmissionType() {
        System.out.println("transmission type is manual");
    }
}
