package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int coordinatX = random.nextInt(8);
        int coordinatY = random.nextInt(8);
        LessonEightLevelThreeExcerciseOne levelThreeExcerciseOne = new LessonEightLevelThreeExcerciseOne();
        levelThreeExcerciseOne.findHorsePossibleSteps(coordinatX, coordinatY);

    }
}
