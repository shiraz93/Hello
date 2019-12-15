package com.company;

public class Pig extends Shawarma {
    /**
     * Create constructor.
     */
    public Pig() {
        description = "pig";
    }

    /**
     * @return cost of chicken pig.
     */
    @Override
    public double cost() {
        return 2.3;
    }
}
