package com.company;

public class PotatoFry extends Condiment {
    Shawarma shawarma;

    /**
     * Create constructor.
     *
     * @param shawarma
     */

    public PotatoFry(Shawarma shawarma) {
        this.shawarma = shawarma;
    }

    /**
     * @return description shawarma.
     */
    @Override
    public String getDescription() {
        return shawarma.getDescription() + ",potato fry";
    }

    /**
     * @return cost of shawarma
     */
    @Override
    public double cost() {
        return 0.5 + shawarma.cost();
    }
}
