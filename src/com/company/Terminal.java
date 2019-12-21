package com.company;

public class Terminal {

    Command command;

    /**
     * set command of Mobile radiocommunication
     *
     * @param command Mobile radiocommunication
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * Execute command.
     */
    public void buttonWasPressed() {
        command.execute();
    }
}
