package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] arrayfirst = {1, 2, 3, 4, 5, 6, 7};
        PracticalLessonExerciseFive exerciseFive = new PracticalLessonExerciseFive();

        for (int numb :
                exerciseFive.getReversedArray(arrayfirst)) {
            System.out.print(numb + " ");
        }


        int[] arraysecond = {90, 80, 70, 60, 50, 40, 30, 20, 10};
        System.out.println();
        for (int numb :
                exerciseFive.getReversedArray(arraysecond)) {
            System.out.print(numb + " ");
        }
    }
}
