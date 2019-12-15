package com.company;

public class Chicken extends Shawarma {
    /**
     * Create constructor.
     */
    public Chicken() {
        description = "chicken";
    }

    /**
     * @return cost of chicken sawarma.
     */
    @Override
    public double cost() {
        return 3.0;
    }
}
