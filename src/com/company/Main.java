package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PracticalLessonExerciseSix exerciseSix = new PracticalLessonExerciseSix();
        List<Double> listfirst = new ArrayList<>();
        listfirst.add(15.0);
        listfirst.add(12.0);
        listfirst.add(150.0);
        listfirst.add(60.0);
        for (double n :
                exerciseSix.getDividedCollection(listfirst, 5)) {
            System.out.print(n + " ");
        }
        System.out.println();
        List<Double> listsecond = new ArrayList<>();
        listfirst.add(150.0);
        listfirst.add(121.0);
        listfirst.add(190.0);
        listfirst.add(60.0);
        for (double n :
                exerciseSix.getDividedCollection(listfirst, 10)) {
            System.out.print(n + " ");
        }
    }
}
