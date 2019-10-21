package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PracticalLessonExerciseNine exerciseNine = new PracticalLessonExerciseNine();
        HashMap<String, Integer> hashMap = exerciseNine.getmultipliesAndDivides(10, 5);
        System.out.println("Divide:" + hashMap.get("divide") + "  " + "Multiplay:" + hashMap.get("multiplay"));

    }
}
