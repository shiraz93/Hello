package com.company;

public class Lesson5_3_5v2 {
    /**
     * print  it is possible form the second from the letters of the first
     * where each letters of the words quantity should be equal
     * @param word1
     * @param word2
     */
    void isPossibleFormSecondWord(String word1, String word2){
        boolean ispossible=true;
        int count1;
        int count2;
        if(word1.length()==word2.length()){
            OUT:
            for (int i = 0; i <word2.length() ; i++) {
                count1=0;
                count2=0;
                for (int j = 0; j < word2.length(); j++) {

                    if (word2.substring(i, i + 1).equals(word2.substring(j,j+1))){
                        count2++;
                    }
                    if (word2.substring(i, i + 1).equals(word1.substring(j,j+1))){
                        count1++;
                    }
                }
                if(count1!=count2){
                    ispossible=false;
                    break OUT;
                }
            }

        }else {
            ispossible=false;
        }
        if(ispossible){
            System.out.println("possible");
        }else {
            System.out.println("not possible");
        }
    }
}
