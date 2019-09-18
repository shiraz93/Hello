package com.company;

public class Lesson5_2_5 {
    /**
     * Convert each symbol of the str to Integer
     *  plus that digit and print
     * @param str
     */
    void convertStringToInteger(String str){
        int sum=Integer.valueOf(str.substring(0,1))+Integer.valueOf(str.substring(1,2));
        System.out.println(sum);
    }
}
