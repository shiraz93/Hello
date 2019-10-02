package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LessonSevenLevelTwoExerciseFour {
    /**
     * this method read line by line from text.txt file
     */
    void readTxtLineByLine() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:/Users/Shiraz/Desktop/text.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }

}
