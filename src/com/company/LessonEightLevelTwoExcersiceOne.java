package com.company;

public class LessonEightLevelTwoExcersiceOne {
    /**
     * this method when number is neghative call new created Exception
     *
     * @param isnegative
     * @throws NewException
     */
    void callException(Boolean isnegative) throws NewException {
        if (!isnegative) {
            throw new NewException();
        }
    }
}
