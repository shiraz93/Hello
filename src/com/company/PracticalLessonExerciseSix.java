package com.company;

import java.util.ArrayList;
import java.util.List;

public class PracticalLessonExerciseSix {
    /**
     * return divided changedList
     *
     * @param list
     * @param numb
     * @return
     */
    List<Double> getDividedCollection(List<Double> list, int numb) {
        List<Double> changedList = new ArrayList<>();
        for (double n :
                list) {
            changedList.add(n / numb);
        }
        return changedList;
    }
}
