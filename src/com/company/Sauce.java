package com.company;

public class Sauce extends Condiment {
    Shawarma shawarma;

    /**
     * Create constructor.
     *
     * @param shawarma
     */
    public Sauce(Shawarma shawarma) {
        this.shawarma = shawarma;
    }

    /**
     * @return description shawarma.
     */
    @Override
    public String getDescription() {
        return shawarma.getDescription() + ",sauce";
    }

    /**
     * @return cost of shawarma
     */
    @Override
    public double cost() {
        return shawarma.cost() + 0.25;
    }
}
