package com.company;

public class Lesson2_3e {
    void SetBubbleSort(int x[]) {
        int max;
        for (int i = 0; i < x.length; i++) {
            max = 0;
            for (int j = 0; j < x.length; j++) {
                if (x[i] > x[j]) {
                    max = x[j];
                    x[j] = x[i];
                    x[i] = max;
                }
            }
        }
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }

    }
}
