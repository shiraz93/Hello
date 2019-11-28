package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String statment = scanner.nextLine();
        LessonEightLevelThreeExerciseTwo levelThreeExerciseTwo = new LessonEightLevelThreeExerciseTwo();
        levelThreeExerciseTwo.convertToMorseCode(statment.toUpperCase());
    }
}
