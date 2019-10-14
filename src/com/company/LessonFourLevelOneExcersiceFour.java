package com.company;

public class LessonFourLevelOneExcersiceFour {
    /**
     * this method print max,min and average of digits
     *
     * @param digits
     */
    void getMaxMinAverage(int[] digits) {
        int max = digits[0];
        int min = digits[0];
        int average = 0;
        for (int i = 0; i < digits.length; i++) {
            if (max < digits[i]) {
                max = digits[i];
            }
            if (min > digits[i]) {
                min = digits[i];
            }
            average += digits[i];
        }
        System.out.println("max: " + max + "\n min: " + min + "\n averag:" + (average / digits.length));
    }
}
