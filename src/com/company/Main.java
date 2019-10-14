package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LessonEightLevelTwoExcersiceOne eightLevelTwoExcersiceOne = new LessonEightLevelTwoExcersiceOne();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        try {
            if (number > 0) {
                eightLevelTwoExcersiceOne.callException(true);
            } else {
                eightLevelTwoExcersiceOne.callException(false);
            }
        } catch (NewException e) {
            System.out.println(e);
        }

    }
}
