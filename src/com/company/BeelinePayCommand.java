package com.company;

public class BeelinePayCommand implements Command {
    Beeline beeline;

    /**
     * Create constructor.
     *
     * @param beeline Mobile radio communication.
     */
    public BeelinePayCommand(Beeline beeline) {
        this.beeline = beeline;
    }

    /**
     * Pay money to Beeline mobile radio communication.
     */
    @Override
    public void execute() {
        beeline.pay();
    }
}
