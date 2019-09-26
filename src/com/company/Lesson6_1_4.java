package com.company;

import java.util.ArrayList;

public class Lesson6_1_4 {
    /**
     * Determine the sum of the first six elements of the collection.
     *
     * @param list
     */
    void sumCollection(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
    }
}
