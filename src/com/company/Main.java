package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("barev");
        list.add("vonces");
        list.add("inchka");
        list.add("chka");
        LessonTenLevelOneExercisefour tenLevelOneExercisefour = new LessonTenLevelOneExercisefour();
        tenLevelOneExercisefour.getUppercaseCollection(list);


    }
}
