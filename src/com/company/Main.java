package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(50);
        list.add(60);
        list.add(125);
        list.add(1231);

        LessonNineLevelTwoExcersiceOne nineLevelTwoExcersiceOne = new LessonNineLevelTwoExcersiceOne();
        nineLevelTwoExcersiceOne.removeVariableFromList(list, 5);


    }
}
