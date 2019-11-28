package com.company;

import java.util.HashMap;
import java.util.Map;

public class LessonEightLevelThreeExerciseTwo {
    private final Map<String, String> morseCode = new HashMap<>();

    public LessonEightLevelThreeExerciseTwo() {
        initializeMorseCode();
    }

    /**
     * Initialize Morse code.
     */
    void initializeMorseCode() {
        morseCode.put("A", ".-");
        morseCode.put("B", "-...");
        morseCode.put("C", "-...");
        morseCode.put("D", "-..");
        morseCode.put("E", ".");
        morseCode.put("F", "..-.");
        morseCode.put("G", "--.");
        morseCode.put("H", "....");
        morseCode.put("I", "..");
        morseCode.put("J", ".---");
        morseCode.put("K", "-.-");
        morseCode.put("L", ".-..");
        morseCode.put("M", "--");
        morseCode.put("N", "-.");
        morseCode.put("O", "---");
        morseCode.put("P", ".--.");
        morseCode.put("Q", "--.-");
        morseCode.put("R", ".-.");
        morseCode.put("S", "...");
        morseCode.put("T", "-");
        morseCode.put("U", "..-");
        morseCode.put("V", "...-");
        morseCode.put("W", ".--");
        morseCode.put("X", "-..-");
        morseCode.put("Y", "-.--");
        morseCode.put("Z", "--..");
        morseCode.put("1", ".----");
        morseCode.put("2", "..---");
        morseCode.put("3", "...--");
        morseCode.put("4", "....-");
        morseCode.put("5", ".....");
        morseCode.put("6", "-....");
        morseCode.put("7", "--...");
        morseCode.put("8", "---..");
        morseCode.put("9", "----.");
        morseCode.put("0", "-----");
        morseCode.put(".", ".-.-.-");
        morseCode.put(",", "--..--");
        morseCode.put("?", "..--..");
        morseCode.put("!", "-.-.--");

    }

    /**
     * Convert statment  to Morse code.
     *
     * @param statment converted statment.
     */
    void convertToMorseCode(String statment) {
        String convertedCode = "";
        for (int i = 0; i < statment.length(); i++) {
            if (statment.charAt(i) != ' ') {
                convertedCode += morseCode.get(statment.substring(i, i + 1)) + "  ";
            } else {
                convertedCode += "   ";
            }
        }
        System.out.println(convertedCode);
    }
}
