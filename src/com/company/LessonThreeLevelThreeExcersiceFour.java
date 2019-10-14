package com.company;

public class LessonThreeLevelThreeExcersiceFour {
    /**
     * given two  numbers firsDigit,secondDigit which written as a1a2 and b1b2 where a1 and b1 are the number of units,
     * a2 and b2 is the number of tens.,this method print difference of given numbers
     *
     * @param firstDigit
     * @param secondDigit
     */
    void getDifferenceDigits(String firstDigit, String secondDigit) {
        int orginalDigitFisrt = Integer.valueOf(firstDigit.substring(0, 1)) + Integer.valueOf(firstDigit.substring(1, 2)) * 10;
        int orginalDigitSecond = Integer.valueOf(secondDigit.substring(0, 1)) + Integer.valueOf(secondDigit.substring(1, 2)) * 10;
        System.out.println(orginalDigitFisrt - orginalDigitSecond);

    }
}
