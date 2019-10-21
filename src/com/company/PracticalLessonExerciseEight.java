package com.company;

import java.util.ArrayList;
import java.util.List;

public class PracticalLessonExerciseEight {
    /**
     * return chnagelist collection type of Character
     *
     * @param list
     * @param index
     * @return
     */
    List<Character> getCharCollection(List<String> list, int index) {
        List<Character> changedList = new ArrayList<>();
        for (int i = 0; i < list.get(index).length(); i++) {
            changedList.add(list.get(index).charAt(i));
        }
        return changedList;
    }

}
