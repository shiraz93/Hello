package com.company;

public class Main {

    public static void main(String[] args) {
        FuelInjector fuelInjector = new FuelInjector();
        FuelPump fuelPump = new FuelPump();
        Starter starter = new Starter();
        Radiator radiator = new Radiator();
        CarEngineFacade carEngineFacade = new CarEngineFacade(radiator, starter, fuelPump, fuelInjector);
        carEngineFacade.startEngine();
        carEngineFacade.stopEngine();


    }
}
