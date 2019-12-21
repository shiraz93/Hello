package com.company;

public class RostelecomPayCommand implements Command {
    Rostelecom rostelecom;
    /**
     * Create constructor.
     *
     * @param rostelecom Mobile radio communication.
     */
    public RostelecomPayCommand(Rostelecom rostelecom) {
        this.rostelecom = rostelecom;
    }
    /**
     * Pay money to Rostelecom mobile radio communication.
     */
    @Override
    public void execute() {
        rostelecom.pay();
    }
}
