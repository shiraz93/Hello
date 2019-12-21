package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        SafePassword safePassword = SafePassword.getInstance();
        System.out.println(safePassword.getPassword());
    }
}
