package com.company.carstore;

import java.util.ArrayList;

public abstract class MercedesBenz {
    String model;
    ArrayList<String> list = new ArrayList<String>();

    /**
     * Prepare order.
     */
    void prepareOrder() {
        System.out.println("Preparing order " + model);

        for (String topping : list) {
            System.out.println(" " + topping);
        }
    }

    /**
     * @return model of car.
     */
    public String getModel() {
        return model;
    }
}
