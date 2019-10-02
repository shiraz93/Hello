package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {

        String symbol = ">>>>-->><-><>>><<<--<<>><><>---<<->>";
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:/Users/Shiraz/Desktop/text.txt"))) {
            char[] buf = symbol.toCharArray();
            bufferedWriter.write(buf);
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
        LessonSevenLevelThreeExcersiceFour sevenLevelThreeExcersiceFour = new LessonSevenLevelThreeExcersiceFour();
        sevenLevelThreeExcersiceFour.countArrow();
    }
}
