package com.company;

public interface OilPrice {
    /**
     * Register observer.
     *
     * @param observer on register.
     */
    public void registerObserver(Observer observer);

    /**
     * Remove observer.
     *
     * @param observer on remove.
     */
    public void removeObserver(Observer observer);

    /**
     * Update all observers price of oil.
     */
    public void notifyObservers();
}
