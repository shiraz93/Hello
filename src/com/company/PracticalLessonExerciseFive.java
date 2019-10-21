package com.company;

public class PracticalLessonExerciseFive {
    /**
     * return reverse array
     *
     * @param array
     * @return
     */
    int[] getReversedArray(int[] array) {
        int[] reverseArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            reverseArray[array.length - 1 - i] = array[i];
        }
        return reverseArray;
    }
}
