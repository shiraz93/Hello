package com.company;

import com.company.carstore.GermanyMercedesBenz;
import com.company.carstore.MercedesBenz;
import com.company.carstore.MercedsBenzCarStore;
import com.company.carstore.RussianMercedesBenz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MercedsBenzCarStore mercedsBenzCarStore = new GermanyMercedesBenz();
        MercedesBenz mercedesBenz = mercedsBenzCarStore.orderCar("S class");
        System.out.println("you ordered :" + mercedesBenz.getModel());
        MercedsBenzCarStore mercedsBenzCarStore1 = new RussianMercedesBenz();
        MercedesBenz mercedesBenzRussian = mercedsBenzCarStore1.orderCar("C class");
        System.out.println("you ordered :" + mercedesBenzRussian.getModel());
    }
}
