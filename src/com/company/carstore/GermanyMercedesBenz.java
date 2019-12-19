package com.company.carstore;

public class GermanyMercedesBenz extends MercedsBenzCarStore {
    /**
     * Create order of car.
     *
     * @param model of car.
     * @return class of car.
     */
    @Override
    MercedesBenz createOrder(String model) {
        if (model.equals("S class")) {
            return new GermanySClass();
        } else if (model.equals("C class")) {
            return new GermanyEClass();
        }
        if (model.equals("E class")) {
            return new GermanyEClass();
        }
        return null;
    }
}
