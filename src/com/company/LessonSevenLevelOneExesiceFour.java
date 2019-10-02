package com.company;

import java.io.*;


public class LessonSevenLevelOneExesiceFour {
    /**
     * this method create text.txt file then write  and read from file
     * @param text
     */
    void createTextFile(String text) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:/Users/Shiraz/Desktop/text.txt"))) {
            char[] buf = text.toCharArray();
            bufferedWriter.write(buf);
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:/Users/Shiraz/Desktop/text.txt"))) {
            int i;
            while ((i = bufferedReader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        }
    }
}
