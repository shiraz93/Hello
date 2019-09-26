package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(10);
        list.add(55);
        list.add(30);
        list.add(12);
        list.add(30);
        list.add(3);
        list.add(789);
        Lesson6_2_4 lesson6_2_4 = new Lesson6_2_4();
        lesson6_2_4.hasDuplicate(list);

    }
}
