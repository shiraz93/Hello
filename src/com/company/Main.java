package com.company;


public class Main {

    public static void main(String[] args) {
        Shawarma shawarmaChicken = new Chicken();
        shawarmaChicken = new PotatoFry(shawarmaChicken);
        System.out.println(shawarmaChicken.getDescription() + ":" + shawarmaChicken.cost() + "$");
        Shawarma shawarmaPig = new Pig();
        shawarmaPig = new Salad(shawarmaPig);
        shawarmaPig = new Sauce(shawarmaPig);
        System.out.println(shawarmaPig.getDescription() + ":" + shawarmaPig.cost() + "$");
    }
}
