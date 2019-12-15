package com.company;

public abstract class Shawarma {
    String description = "unknown";

    /**
     * @return description sawarma.
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return cost sawarma.
     */
    public abstract double cost();
}
