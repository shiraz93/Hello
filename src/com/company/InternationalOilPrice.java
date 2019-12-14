package com.company;

import java.util.ArrayList;
import java.util.List;

public class InternationalOilPrice implements OilPrice {
    private List<Observer> observers;
    private Double priceOil;

    /**
     * Create constructor.
     */
    public InternationalOilPrice() {
        observers = new ArrayList<>();
    }

    /**
     * Register observer.
     *
     * @param observer on register.
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Remove observer
     *
     * @param observer on remove.
     */
    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }

    }

    /**
     * Update all observers price of oil.
     */
    @Override
    public void notifyObservers() {
        observers.forEach(s -> s.update(priceOil));

    }

    /**
     * Set price oil.
     *
     * @param priceOil price oil.
     */

    public void setPrice(double priceOil) {
        this.priceOil = priceOil;
        notifyObservers();
    }
}
