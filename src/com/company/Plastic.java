package com.company;

public class Plastic implements Observer, DisplayElement {
    private OilPrice internationalOilPrice;
    private double priceOil;
    private double pricePlastic;

    /**
     * Create constructor.
     *
     * @param internationalOilPrice
     */
    public Plastic(OilPrice internationalOilPrice) {
        this.internationalOilPrice = internationalOilPrice;
        internationalOilPrice.registerObserver(this);
    }

    /**
     * Display price plastic.
     */
    @Override
    public void display() {
        System.out.println("Price Plastic:" + pricePlastic + "$");
    }

    /**
     * Update price oil.
     *
     * @param priceOil price oil.
     */
    @Override
    public void update(double priceOil) {
        this.priceOil = priceOil;
        carculatePricePlastic();
        display();
    }

    /**
     * Carculate price plastic.
     */
    public void carculatePricePlastic() {
        pricePlastic += ((priceOil / 100) * 2) + priceOil;
    }
}
