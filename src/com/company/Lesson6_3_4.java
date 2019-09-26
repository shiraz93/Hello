package com.company;

import java.util.ArrayList;

public class Lesson6_3_4 {
    /**
     * this method get the largest segment which constis of odd numbers
     *
     * @param list
     */
    void getSegmentOdd(ArrayList<Integer> list) {
        ArrayList<Integer> count = new ArrayList<>();
        ArrayList<Integer> index = new ArrayList<>();
        int quantity;

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) % 2 != 0) {
                index.add(i);
                quantity = 0;
                OUT:
                for (int j = i; j < list.size(); j++) {
                    if (list.get(j) % 2 != 0) {
                        quantity++;
                        i++;
                    } else {
                        break OUT;
                    }
                }
                count.add(quantity);
            }
        }
        int maxCount = count.get(0);
        int maxIndex = 0;
        for (int i = 1; i < count.size(); i++) {
            if (count.get(i) > maxCount) {
                maxIndex = i;
                maxCount = count.get(i);
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>(count.get(maxIndex));
        for (int i = index.get(maxIndex); i < index.get(maxIndex) + count.get(maxIndex); i++) {
            arrayList.add(list.get(i));
            System.out.println(list.get(i));
        }


    }
}
