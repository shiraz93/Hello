package com.company;

public class Petrol implements Observer, DisplayElement {
    private OilPrice internationalOilPrice;
    private double priceOil;
    private double pricePetrol;

    /**
     * Create constructor.
     *
     * @param internationalOilPrice
     */
    public Petrol(OilPrice internationalOilPrice) {
        this.internationalOilPrice = internationalOilPrice;
        internationalOilPrice.registerObserver(this);
    }

    /**
     * Display price petrol.
     */
    @Override
    public void display() {
        System.out.println("Price Petrol:" + pricePetrol + "$");
    }

    /**
     * Update price oil.
     *
     * @param priceOil
     */
    @Override
    public void update(double priceOil) {
        this.priceOil = priceOil;
        carculatePricePetrolPerLitter();
        display();
    }

    /**
     * Carculate price petrol.
     */
    public void carculatePricePetrolPerLitter() {
        pricePetrol += ((priceOil / 100) * 8) + priceOil;
    }
}
