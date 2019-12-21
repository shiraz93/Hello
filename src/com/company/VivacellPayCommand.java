package com.company;

public class VivacellPayCommand implements Command {
    Vivacell vivacell;

    /**
     * Create constructor.
     *
     * @param vivacell Mobile radio communication.
     */
    public VivacellPayCommand(Vivacell vivacell) {
        this.vivacell = vivacell;
    }

    /**
     * Pay money to Vivacell mobile radio communication.
     */
    @Override
    public void execute() {
        vivacell.pay();
    }
}
