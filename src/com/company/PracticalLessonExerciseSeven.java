package com.company;

public class PracticalLessonExerciseSeven {
    /**
     * rerurn multiplay
     *
     * @param first
     * @param second
     * @return
     */
   private double getMultiplay(double first, double second) {
        return first * second;
    }

    /**
     * return square degree of multiplay first and second
     *
     * @param first
     * @param second
     * @return
     */
    double getMultiplaySquareDegree(double first, double second) {
        return Math.pow(getMultiplay(first, second), 2);
    }


}
