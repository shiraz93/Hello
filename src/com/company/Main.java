package com.company;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 5; i < 60; i += 5) {
            list.add(i);
        }
        Lesson6_1_4 lesson6_1_4 = new Lesson6_1_4();
        lesson6_1_4.sumCollection(list);

    }
}
