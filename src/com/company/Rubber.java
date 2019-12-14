package com.company;


public class Rubber implements Observer, DisplayElement {
    private OilPrice internationalOilPrice;
    private double priceOil;
    private double priceRubber;

    /**
     * Create constructor.
     *
     * @param internationalOilPrice
     */
    public Rubber(OilPrice internationalOilPrice) {
        this.internationalOilPrice = internationalOilPrice;
        internationalOilPrice.registerObserver(this);
    }

    /**
     * Display price rubber.
     */
    @Override
    public void display() {
        System.out.println("Price Rubber:" + priceRubber + "$");
    }

    /**
     * Update price  oil.
     *
     * @param priceOil
     */
    @Override
    public void update(double priceOil) {
        this.priceOil = priceOil;
        carculatePriceRubber();
        display();
    }

    /**
     * Carculate price rubber.
     */
    public void carculatePriceRubber() {
        priceRubber += ((priceOil / 100) * 1.2) + priceOil;
    }
}
