package com.company;

public class Lesson5_3_5 {
    /**
     * print  it is possible to get the second from the letters of the first
     *
     * @param word1
     * @param word2
     */
    void isPossibleFormSecondWord(String word1, String word2) {

        boolean ispossible = true;
        OUT:
        for (int i = 0; i < word2.length(); i++) {
            if (!word1.contains(word2.substring(i, i + 1))) {
                ispossible = false;
                break OUT;
            }
        }
        if (ispossible) {
            System.out.println("possible");
        } else {
            System.out.println("not possible");
        }

    }
}
