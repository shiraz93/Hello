package com.company;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Person");
        list.add("interesting");
        list.add("technology");
        list.add("information");
        PracticalLessonExerciseEight exerciseEight = new PracticalLessonExerciseEight();
        for (char symbol :
                exerciseEight.getCharCollection(list, 2)) {
            System.out.print(symbol + " ");
        }
        System.out.println();
        List<String> listfirst = new ArrayList<>();
        listfirst.add("12345");
        listfirst.add("summer");
        listfirst.add("spring");
        listfirst.add("lamborgini");
        listfirst.add("information");
        for (char symbol :
                exerciseEight.getCharCollection(listfirst, 3)) {
            System.out.print(symbol + " ");
        }
    }
}
