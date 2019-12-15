package com.company;

public class Salad extends Condiment {
    Shawarma shawarma;

    /**
     * Create constructor.
     *
     * @param shawarma
     */
    public Salad(Shawarma shawarma) {
        this.shawarma = shawarma;
    }

    /**
     * @return description shawarma.
     */
    @Override
    public String getDescription() {
        return shawarma.getDescription() + ",salad";
    }

    /**
     * @return cost of shawarma
     */
    @Override
    public double cost() {
        return shawarma.cost() + 0.3;
    }
}
