package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int first[] = {1, 12, 45, 4, 54, 45, 4, 4, 1, 1};
        PracticalLessonExerciseTen exerciseTen = new PracticalLessonExerciseTen();
        System.out.println(exerciseTen.getCountElement(first));
        int second[] = {45, 1, 2, 41, 584, 7};
        System.out.println(exerciseTen.getCountElement(second));

    }
}
