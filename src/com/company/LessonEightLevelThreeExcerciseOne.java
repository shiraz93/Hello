package com.company;

import java.util.ArrayList;
import java.util.List;

public class LessonEightLevelThreeExcerciseOne {
    /**
     * Find  horse's possible steps․
     *
     * @param coordinatX coordinat x․
     * @param coordinatY coordinat y․
     */
    void findHorsePossibleSteps(int coordinatX, int coordinatY) {
        List<String> stepsHorse = new ArrayList<>();
        int[] possibleStepsByX = {2, 2, 1, 1, -1, -1, -2, -2};
        int[] possibleStepsByY = {1, -1, 2, -2, 2, -2, 1, -1};
        System.out.println(coordinatX + "     " + coordinatY);
        for (int i = 0; i < 8; i++) {
            if (coordinatX + possibleStepsByX[i] >= 0 && coordinatX <= 8 && coordinatY + possibleStepsByY[i] >= 0 && coordinatY + possibleStepsByY[i] <= 8) {
                stepsHorse.add("step" + (stepsHorse.size() + 1) + " (" + (coordinatX + possibleStepsByX[i]) + "," + (coordinatY + possibleStepsByY[i]) + ")");
            }
        }
        stepsHorse.forEach(System.out::println);
    }
}
