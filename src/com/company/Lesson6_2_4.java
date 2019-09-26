package com.company;

import java.util.ArrayList;

public class Lesson6_2_4 {
    /**
     * hasDuplicate determine if the collection has only two identical elements.
     *
     * @param list
     */


    void hasDuplicate(ArrayList<Integer> list) {
        int count;
        boolean isHas = false;
        OUT:
        for (int i = 0; i < list.size(); i++) {
            count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
            }
            if (count == 2) {
                isHas = true;
                break OUT;
            }
        }
        if (isHas) {
            System.out.println("collection has only two identical elements");
        } else {
            System.out.println("collection hasn't only two identical elements");
        }
    }
}
