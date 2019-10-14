package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] digits = new int[10];
        for (int i = 0; i < 10; i++) {
            digits[i] = (int) (Math.random() * (90 + 1) + 10);
        }
        for (int s :
                digits) {
            System.out.println(s);
        }
        LessonFourLevelOneExcersiceFour fourLevelOneExcersiceFour = new LessonFourLevelOneExcersiceFour();
        fourLevelOneExcersiceFour.getMaxMinAverage(digits);
    }
}
