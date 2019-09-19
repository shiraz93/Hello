package com.company;

public class Lesson5_3_5v2 {
    /**
     * print  it is possible form the second from the letters of the first
     * where each letters of the words quantity should be equal
     *
     * @param word1
     * @param word2
     */
    void isPossibleFormSecondWord(String word1, String word2) {
        boolean ispossible = true;
        int firstcount;
        int secondcount;
        if (word1.length() == word2.length()) {
            OUT:
            for (int i = 0; i < word2.length(); i++) {
                firstcount = 0;
                secondcount = 0;
                for (int j = 0; j < word2.length(); j++) {

                    if (word2.substring(i, i + 1).equals(word2.substring(j, j + 1))) {
                        secondcount++;
                    }
                    if (word2.substring(i, i + 1).equals(word1.substring(j, j + 1))) {
                        firstcount++;
                    }
                }
                if (firstcount != secondcount) {
                    ispossible = false;
                    break OUT;
                }
            }

        } else {
            ispossible = false;
        }
        if (ispossible) {
            System.out.println("possible");
        } else {
            System.out.println("not possible");
        }
    }
}
