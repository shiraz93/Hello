package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("lamborgini");
        list.add("sony");
        list.add("panasonic");
        list.add("lg");
        LessonTenLevelTwoExerciseFour exerciseFour = new LessonTenLevelTwoExerciseFour();
        exerciseFour.AddSymbolAndPrintFirstElement(list, "!");

    }
}
