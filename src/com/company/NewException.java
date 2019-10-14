package com.company;

public class NewException extends Exception {


    @Override
    public String toString() {
        return "new exception called: number is negative";
    }
}
