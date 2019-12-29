package com.company;

public class CarEngineFacade {
    Radiator radiator;
    Starter starter;
    FuelPump fuelPump;
    FuelInjector fuelInjector;

    /**
     * Create constructor.
     *
     * @param radiator
     * @param starter
     * @param fuelPump     fuel pump.
     * @param fuelInjector fuel injector.
     */
    public CarEngineFacade(Radiator radiator, Starter starter, FuelPump fuelPump, FuelInjector fuelInjector) {
        this.radiator = radiator;
        this.starter = starter;
        this.fuelPump = fuelPump;
        this.fuelInjector = fuelInjector;
    }

    /**
     * Start engine.
     */
    public void startEngine() {
        System.out.println("start engine");
        starter.start();
        fuelPump.on();
        fuelInjector.on();
        radiator.on();
    }

    /**
     * Stop engine.
     */
    public void stopEngine() {
        System.out.println("stop engine");
        fuelInjector.off();
        fuelPump.off();
        radiator.off();
    }
}
