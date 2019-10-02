package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String text = "Java was originally developed by James Gosling at Sun Microsystems" +
                "\n (which has since been acquired by Oracle)" +
                "\n and released in 1995 as a core component of Sun Microsystems' Java platform.";
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:/Users/Shiraz/Desktop/text.txt"))) {
            char[] buf = text.toCharArray();
            bufferedWriter.write(buf);


        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
        LessonSevenLevelTwoExerciseFour sevenLevelTwoExerciseFour = new LessonSevenLevelTwoExerciseFour();
        sevenLevelTwoExerciseFour.readTxtLineByLine();

    }
}
