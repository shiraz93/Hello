package com.company;

import java.util.List;

public class LessonTenLevelOneExercisefour {
    void getUppercaseCollection(List<String> list) {

        list.replaceAll(String::toUpperCase);
        list.forEach(System.out::println);
    }
}
