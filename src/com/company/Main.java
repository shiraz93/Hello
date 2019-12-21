package com.company;

public class Main {

    public static void main(String[] args) {
       Terminal terminal = new Terminal();
       Vivacell vivacell = new Vivacell();
       Ucom ucom = new Ucom();
       Rostelecom rostelecom = new Rostelecom();
       VivacellPayCommand vivacellPayCommand = new VivacellPayCommand(vivacell);
       RostelecomPayCommand rostelecomPayCommand = new RostelecomPayCommand(rostelecom);
       UcomPayCommand ucomPayCommand = new UcomPayCommand(ucom);
       terminal.setCommand(vivacell::pay);
       terminal.buttonWasPressed();
       terminal.setCommand(ucom::pay);
       terminal.buttonWasPressed();


    }
}
