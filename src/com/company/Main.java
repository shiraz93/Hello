package com.company;


import javax.swing.*;


public class Main {

    public static void main(String[] args) {
        InternationalOilPrice internationalOilPrice = new InternationalOilPrice();
        Petrol petrol = new Petrol(internationalOilPrice);
        Plastic plastic = new Plastic(internationalOilPrice);
        Rubber rubber = new Rubber(internationalOilPrice);
        internationalOilPrice.setPrice(80);
        internationalOilPrice.setPrice(120);
        internationalOilPrice.setPrice(150);

    }

}
