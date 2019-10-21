package com.company;

import java.util.HashMap;

public class PracticalLessonExerciseNine {
    /**
     * return hasMap which contain two value divide and multiplay of first and second
     *
     * @param first
     * @param second
     * @return
     */
    HashMap<String, Integer> getmultipliesAndDivides(int first, int second) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("multiplay", first * second);
        hashMap.put("divide", first / second);
        return hashMap;
    }

}
