package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LessonSevenLevelThreeExcersiceFour {
    /**
     * countArrow  find the count of arrows that are hidden in this  substrings of the form ‘>> ->’ and ‘<- <<’.
     */

    void countArrow() {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:/Users/Shiraz/Desktop/text.txt"))) {
            StringBuffer str = new StringBuffer();
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                str.append(s);
            }
            int startIndex = str.indexOf(">>-->") + 5;
            int endIndex = str.lastIndexOf("<--<<");
            int count = 0;
            for (int i = startIndex; i < endIndex; i++) {
                if (str.charAt(i) == '<' || str.charAt(i) == '>') {
                    count++;
                }
            }
            System.out.println(count);
        } catch (IOException e) {
            System.out.println("I/O Error : " + e);
        }

    }
}
