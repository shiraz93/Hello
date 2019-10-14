package com.company;

public class LessonFourLevelThreeExcerciseFour {
    /**
     * this method find count difference number and count repeate number of the digits
     *
     * @param digits
     */
    void getRepeatedNumberCountAndDifferenceNumberCount(int[] digits) {
        int countDifferenceNumber = 1;
        int countRepeateNumber = 0;
        int recentDigigit = 0;
        for (int i = 0; i < digits.length - 1; i++) {
            if (digits[i] != digits[i + 1]) {
                countDifferenceNumber++;

            }
            if (digits[i] == digits[i + 1] && recentDigigit != digits[i]) {
                recentDigigit = digits[i];
                countRepeateNumber++;
            }
        }
        System.out.println("countRepeateNumber:" + countRepeateNumber + "\ncountDifferenceNumber:" + countDifferenceNumber);
    }

}
