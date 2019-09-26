package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(11);
        list.add(8);
        list.add(1);
        list.add(3);
        list.add(16);
        list.add(13);
        list.add(19);
        list.add(21);
        list.add(27);
        list.add(31);
        Lesson6_3_4 lesson6_3_4=new Lesson6_3_4();
        lesson6_3_4.getSegmentOdd(list);


    }
}
