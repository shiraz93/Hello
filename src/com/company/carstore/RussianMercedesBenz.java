package com.company.carstore;

public class RussianMercedesBenz extends MercedsBenzCarStore {
    /**
     * @param model of car.
     * @return
     */
    @Override
    MercedesBenz createOrder(String model) {
        if (model.equals("S class")) {
            return new RussianSClass();
        } else if (model.equals("C class")) {
            return new RussianCClass();
        }
        if (model.equals("E class")) {
            return new RussianECLass();
        }
        return null;
    }
}
