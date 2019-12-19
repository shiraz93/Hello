package com.company.carstore;


public abstract class MercedsBenzCarStore {
    /**
     * Order car.
     *
     * @param model of car.
     * @return class of car.
     */
    public MercedesBenz orderCar(String model) {
        MercedesBenz mercedesBenz;
        mercedesBenz = createOrder(model);
        mercedesBenz.prepareOrder();

        return mercedesBenz;
    }

    /**
     * Create order.
     *
     * @param model of car.
     * @return class of car.
     */
    abstract MercedesBenz createOrder(String model);
}
