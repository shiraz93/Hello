package com.company;

public class UcomPayCommand implements Command {
    Ucom ucom;

    /**
     * Create constructor.
     *
     * @param ucom Mobile radio communication.
     */
    public UcomPayCommand(Ucom ucom) {
        this.ucom = ucom;
    }

    /**
     * Pay money to Ucom mobile radio communication.
     */
    @Override
    public void execute() {
        ucom.pay();
    }
}
