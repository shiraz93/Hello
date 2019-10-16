package com.company;

import java.util.ArrayList;
import java.util.List;

public class LessonNineLevelTwoExcersiceOne {
    /**
     * this method find from list element which equal to removeVariable and remove it
     * @param list
     * @param removeVariable
     * @param <T>
     */
    <T extends Comparable<T>> void removeVariableFromList(List<T> list, T removeVariable) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(removeVariable)) {
                list.remove(i);
                i--;
            }
        }
        for (T var :
                list) {
            System.out.println(var);
        }
    }
}
